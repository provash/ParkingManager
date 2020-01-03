package com.skillenza.parkinglotjava.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.skillenza.parkinglotjava.model.VehicleType;

@Entity
@Table(name = "parkingLots")
public class ParkingLots {
  @Id
  private String parkingLotId;
  private VehicleType vehicleType;
  private  boolean available;

  public String getParkingLotId() {
    return parkingLotId;
  }

  public void setParkingLotId(final String parkingLotId) {
    this.parkingLotId = parkingLotId;
  }

  public VehicleType getVehicleType() {
    return vehicleType;
  }

  public void setVehicleType(final VehicleType vehicleType) {
    this.vehicleType = vehicleType;
  }

  public boolean isAvailable() {
    return available;
  }

  public void setAvailable(final boolean available) {
    this.available = available;
  }
}
