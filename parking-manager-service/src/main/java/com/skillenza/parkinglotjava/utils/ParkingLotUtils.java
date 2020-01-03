package com.skillenza.parkinglotjava.utils;

import java.util.Optional;

import com.skillenza.parkinglotjava.dto.ParkExit;
import com.skillenza.parkinglotjava.dto.ParkExitStatus;
import com.skillenza.parkinglotjava.dto.ParkVehicle;
import com.skillenza.parkinglotjava.dto.ParkVehicleStatus;
import com.skillenza.parkinglotjava.dto.ParkingCharges;
import com.skillenza.parkinglotjava.dto.ParkingDetails;
import com.skillenza.parkinglotjava.entities.ParkingLots;
import com.skillenza.parkinglotjava.entities.Parkings;

public class ParkingLotUtils {

  public static ParkingDetails createParkingDetailsFromParkings(Iterable<Parkings> parkings) {
    ParkingDetails parkingDetails = new ParkingDetails();

    return parkingDetails;
  }

  public static Parkings createParkingsFromAvailableParkingLotAndParkVehicle(final ParkingLots parkingLots,
                                                                             final ParkVehicle parkVehicle) {

    Parkings parkings = new Parkings();

    return parkings;
  }

  public static Optional<ParkVehicleStatus> createParkVehicleStatusFromBookParkins(final Parkings parkings) {

    return Optional.empty();
  }

  public static Parkings createParkingsFromParkExit(final ParkExit parkExit) {

    Parkings parkings = new Parkings();

    return parkings;
  }

  public static Optional<ParkExitStatus> createParkExitStatusFromBookParkins(final Parkings parkings) {
    return Optional.empty();
  }

  public static Optional<ParkingCharges> calculateParkingChargesFromParkingDetailsAndToDate(final Optional<Parkings> parkings, final long toDateInMillis) {
    return Optional.empty();
  }
}
