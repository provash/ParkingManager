package com.skillenza.parkinglotjava.dto;

import com.skillenza.parkinglotjava.model.VehicleType;

public class ParkVehicle {
    private String vehicleNumber;
    private long startTime;
    private VehicleType vehicleType;
    private String parkerId;

  public String getVehicleNumber() {
    return vehicleNumber;
  }

  public void setVehicleNumber(final String vehicleNumber) {
    this.vehicleNumber = vehicleNumber;
  }

  public long getStartTime() {
    return startTime;
  }

  public void setStartTime(final long startTime) {
    this.startTime = startTime;
  }

  public VehicleType getVehicleType() {
    return vehicleType;
  }

  public void setVehicleType(final VehicleType vehicleType) {
    this.vehicleType = vehicleType;
  }

  public String getParkerId() {
    return parkerId;
  }

  public void setParkerId(final String parkerId) {
    this.parkerId = parkerId;
  }
}
