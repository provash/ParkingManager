package com.skillenza.parkinglotjava;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ParkingManagerApplicationBootstrap {
  private static final Logger LOGGER = LoggerFactory.getLogger(ParkingManagerApplicationBootstrap.class);

  public static void main(String[] args) {
    LOGGER.info("Starting ParkingManager application");
    SpringApplication.run(ParkingManagerApplicationBootstrap.class, args);
  }
}
