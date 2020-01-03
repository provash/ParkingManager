package com.skillenza.parkinglotjava.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.skillenza.parkinglotjava.dto.ParkExit;
import com.skillenza.parkinglotjava.dto.ParkExitStatus;
import com.skillenza.parkinglotjava.dto.ParkVehicle;
import com.skillenza.parkinglotjava.dto.ParkVehicleStatus;
import com.skillenza.parkinglotjava.dto.ParkingCharges;
import com.skillenza.parkinglotjava.dto.ParkingDetails;
import com.skillenza.parkinglotjava.model.ParkingStatus;
import com.skillenza.parkinglotjava.services.ParkingLotService;

@RequestMapping(path = "/api/v1/parkings")
@CrossOrigin(origins = "http://localhost:8080")
public class ParkingLotController {

  @Autowired
  private ParkingLotService parkingLotService;

  @GetMapping(path = "/details", produces = "application/json")
  public ParkingDetails getParkingDetails(@RequestParam("fromDate") final long fromDateInMillis,
                                          @RequestParam("toDate") final long toDateInMillis,
                                          @RequestParam("parkingStatus") ParkingStatus parkingStatus) {
    return parkingLotService.getParkingDetails(fromDateInMillis, toDateInMillis, parkingStatus);
  }

  @GetMapping(path = "/charges", produces = "application/json")
  public Optional<ParkingCharges> getParkingCharges(@RequestParam("parkingId") final String parkingId,
                                          @RequestParam("toDate") final long toDateInMillis) {
    return parkingLotService.getParkingCharges(parkingId, toDateInMillis);
  }

  @PostMapping(path = "/enter", consumes = "application/json", produces = "application/json")
  public Optional<ParkVehicleStatus> bookParking(ParkVehicle parkVehicle) {
    return parkingLotService.bookParking(parkVehicle);
  }

  @PostMapping(path = "/exit", consumes = "application/json", produces = "application/json")
  public Optional<ParkExitStatus> bookParking(ParkExit parkExit) {
    return parkingLotService.exitParking(parkExit);
  }
}
