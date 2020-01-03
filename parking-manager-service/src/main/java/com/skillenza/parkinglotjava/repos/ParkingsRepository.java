package com.skillenza.parkinglotjava.repos;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.skillenza.parkinglotjava.entities.Parkings;
import com.skillenza.parkinglotjava.model.ParkingStatus;

public interface ParkingsRepository extends CrudRepository<Parkings, UUID> {

  Iterable<Parkings> findAllByParkingStatusAndUpdateDateTimeAfterAndUpdateDateTimeBefore(ParkingStatus parkingStatus,
                                                                                         long updatedDateTimeAfter,
                                                                                         long updatedDateTimeBefore);
}
