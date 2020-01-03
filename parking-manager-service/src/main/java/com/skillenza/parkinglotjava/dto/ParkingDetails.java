package com.skillenza.parkinglotjava.dto;

import java.util.ArrayList;
import java.util.List;

public class ParkingDetails {
  private List<ParkVehicleStatus> parkVehicleStatusList = new ArrayList<>();

  public List<ParkVehicleStatus> getParkVehicleStatusList() {
    return parkVehicleStatusList;
  }

  public void setParkVehicleStatusList(final List<ParkVehicleStatus> parkVehicleStatusList) {
    this.parkVehicleStatusList = parkVehicleStatusList;
  }
}
