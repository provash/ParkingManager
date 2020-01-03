package com.skillenza.parkinglotjava.services;

import java.util.Optional;

import com.skillenza.parkinglotjava.dto.ParkExit;
import com.skillenza.parkinglotjava.dto.ParkExitStatus;
import com.skillenza.parkinglotjava.dto.ParkVehicle;
import com.skillenza.parkinglotjava.dto.ParkVehicleStatus;
import com.skillenza.parkinglotjava.dto.ParkingCharges;
import com.skillenza.parkinglotjava.dto.ParkingDetails;
import com.skillenza.parkinglotjava.model.ParkingStatus;

public interface ParkingLotService {
  ParkingDetails getParkingDetails(final long fromDateInMillis,
                                   final long toDateInMillis,
                                   final ParkingStatus parkingStatus);

  Optional<ParkVehicleStatus> bookParking(ParkVehicle parkVehicle);

  Optional<ParkingCharges> getParkingCharges(final String parkingId, final long toDateInMillis);

  Optional<ParkExitStatus> exitParking(ParkExit parkExit);
}
