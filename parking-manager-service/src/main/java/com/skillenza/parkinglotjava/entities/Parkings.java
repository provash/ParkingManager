package com.skillenza.parkinglotjava.entities;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.skillenza.parkinglotjava.model.ParkingStatus;
import com.skillenza.parkinglotjava.model.VehicleType;

@Entity
@Table(name = "parkings")
public class Parkings {

  @Id
  @GeneratedValue(generator = "uuid2")
  @GenericGenerator(name = "uuid2", strategy = "uuid2")
  @Column(columnDefinition = "BINARY(16)")
  private UUID parkingId;
  private String vehicleNumber;
  private long startTime;
  private VehicleType vehicleType;
  private String parkerId;
  private String parkingLotId;
  private ParkingStatus parkingStatus;
  private long endTime;
  private String exitId;
  private long charges;
  private long updateDateTime;

  public UUID getParkingId() {
    return parkingId;
  }

  public void setParkingId(final UUID parkingId) {
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

  public String getParkingLotId() {
    return parkingLotId;
  }

  public void setParkingLotId(final String parkingLotId) {
    this.parkingLotId = parkingLotId;
  }

  public ParkingStatus getParkingStatus() {
    return parkingStatus;
  }

  public void setParkingStatus(final ParkingStatus parkingStatus) {
    this.parkingStatus = parkingStatus;
  }

  public long getEndTime() {
    return endTime;
  }

  public void setEndTime(final long endTime) {
    this.endTime = endTime;
  }

  public String getExitId() {
    return exitId;
  }

  public void setExitId(final String exitId) {
    this.exitId = exitId;
  }

  public long getCharges() {
    return charges;
  }

  public void setCharges(final long charges) {
    this.charges = charges;
  }

  public long getUpdateDateTime() {
    return updateDateTime;
  }

  public void setUpdateDateTime(final long updateDateTime) {
    this.updateDateTime = updateDateTime;
  }
}
