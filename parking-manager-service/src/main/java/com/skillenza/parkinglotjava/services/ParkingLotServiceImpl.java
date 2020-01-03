package com.skillenza.parkinglotjava.services;

import java.util.Optional;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillenza.parkinglotjava.dto.ParkExit;
import com.skillenza.parkinglotjava.dto.ParkExitStatus;
import com.skillenza.parkinglotjava.dto.ParkVehicle;
import com.skillenza.parkinglotjava.dto.ParkVehicleStatus;
import com.skillenza.parkinglotjava.dto.ParkingCharges;
import com.skillenza.parkinglotjava.dto.ParkingDetails;
import com.skillenza.parkinglotjava.entities.ParkingLots;
import com.skillenza.parkinglotjava.entities.Parkings;
import com.skillenza.parkinglotjava.model.ParkingStatus;
import com.skillenza.parkinglotjava.repos.ParkingLotRepository;
import com.skillenza.parkinglotjava.repos.ParkingsRepository;
import com.skillenza.parkinglotjava.utils.ParkingLotUtils;

@Service
public class ParkingLotServiceImpl implements ParkingLotService {
  @Autowired
  private ParkingLotRepository parkingLotRepository;
  @Autowired
  private ParkingsRepository parkingsRepository;

  @Override
  public ParkingDetails getParkingDetails(final long fromDateInMillis,
                                          final long toDateInMillis,
                                          final ParkingStatus parkingStatus) {

    final Iterable<Parkings> parkingsItr = parkingsRepository.findAllByParkingStatusAndUpdateDateTimeAfterAndUpdateDateTimeBefore(
        parkingStatus, fromDateInMillis, toDateInMillis);
    return ParkingLotUtils.createParkingDetailsFromParkings(parkingsItr);
  }

  @Override
  @Transactional
  public Optional<ParkVehicleStatus> bookParking(final ParkVehicle parkVehicle) {
    final Iterable<ParkingLots> parkingLotsItr = parkingLotRepository.findFirstByVehicleTypeAndAvailableTrue(
        parkVehicle.getVehicleType(), true);
    ParkingLots parkingLots = null;
    if (parkingLotsItr.iterator().hasNext()) {
      parkingLots = parkingLotsItr.iterator().next();
    }

    if (parkingLots != null) {
      parkingLots.setAvailable(false);
      parkingLotRepository.save(parkingLots);
      Parkings parkings = ParkingLotUtils.createParkingsFromAvailableParkingLotAndParkVehicle(parkingLots, parkVehicle);
      parkingsRepository.save(parkings);
      return ParkingLotUtils.createParkVehicleStatusFromBookParkins(parkings);
    }
    return Optional.empty();
  }

  @Override
  public Optional<ParkingCharges> getParkingCharges(final String parkingId, final long toDateInMillis) {

    final Optional<Parkings> parkings = parkingsRepository.findById(UUID.fromString(parkingId));

    return ParkingLotUtils.calculateParkingChargesFromParkingDetailsAndToDate(parkings, toDateInMillis);
  }

  @Override
  @Transactional
  public Optional<ParkExitStatus> exitParking(final ParkExit parkExit) {
    Parkings parkings = ParkingLotUtils.createParkingsFromParkExit(parkExit);
    parkingsRepository.save(parkings);
    final Optional<ParkingLots> parkingLots = parkingLotRepository.findById(parkings.getParkingLotId());
    if (parkingLots.isPresent()) {
      final ParkingLots parkingLots1 = parkingLots.get();
      parkingLots1.setAvailable(true);
      parkingLotRepository.save(parkingLots1);
      return ParkingLotUtils.createParkExitStatusFromBookParkins(parkings);
    }

    return Optional.empty();
  }
}
