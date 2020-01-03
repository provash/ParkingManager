package com.skillenza.parkinglotjava.dto;

import com.skillenza.parkinglotjava.model.VehicleType;

public class ParkingCharges {

  private String parkingId;
  private String vehicleNumber;
  private long startTime;
  private long endTime;
  private VehicleType vehicleType;
  private String message;
  private long charges;

  public String getParkingId() {
    return parkingId;
  }

  public void setParkingId(final String parkingId) {
    this.parkingId = parkingId;
  }

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

  public long getEndTime() {
    return endTime;
  }

  public void setEndTime(final long endTime) {
    this.endTime = endTime;
  }

  public VehicleType getVehicleType() {
    return vehicleType;
  }

  public void setVehicleType(final VehicleType vehicleType) {
    this.vehicleType = vehicleType;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(final String message) {
    this.message = message;
  }

  public long getCharges() {
    return charges;
  }

  public void setCharges(final long charges) {
    this.charges = charges;
  }
}
