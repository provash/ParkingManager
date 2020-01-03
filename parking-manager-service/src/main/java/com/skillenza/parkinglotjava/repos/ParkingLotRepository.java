package com.skillenza.parkinglotjava.repos;

import org.springframework.data.repository.CrudRepository;

import com.skillenza.parkinglotjava.entities.ParkingLots;
import com.skillenza.parkinglotjava.model.VehicleType;

public interface ParkingLotRepository extends CrudRepository<ParkingLots, String> {
 Iterable<ParkingLots> findFirstByVehicleTypeAndAvailableTrue(VehicleType vehicleType,boolean available);
}
