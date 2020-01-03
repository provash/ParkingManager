package com.skillenza.parkinglotjava.dto;

import com.skillenza.parkinglotjava.model.ParkingStatus;
import com.skillenza.parkinglotjava.model.VehicleType;

public class ParkVehicleStatus {
  private String parkingId;
  private String vehicleNumber;
  private long startTime;
  private VehicleType vehicleType;
  private String parkerId;
  private String parkingLotNumber;
  private ParkingStatus parkingStatus;

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

  public String getParkingLotNumber() {
    return parkingLotNumber;
  }

  public void setParkingLotNumber(final String parkingLotNumber) {
    this.parkingLotNumber = parkingLotNumber;
  }

  public ParkingStatus getParkingStatus() {
    return parkingStatus;
  }

  public void setParkingStatus(final ParkingStatus parkingStatus) {
    this.parkingStatus = parkingStatus;
  }
}
