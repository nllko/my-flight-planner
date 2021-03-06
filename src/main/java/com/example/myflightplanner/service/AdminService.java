package com.example.myflightplanner.service;

import com.example.myflightplanner.models.Flight;
import com.example.myflightplanner.repository.FlightsRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class AdminService {

  private final FlightsRepository flightsRepository;

  public AdminService(FlightsRepository flightsRepository) {
    this.flightsRepository = flightsRepository;
  }

  public void addFlight(Flight flight) {
    if (flightsRepository.isSameFlight(flight)) {
      throw new ResponseStatusException(HttpStatus.CONFLICT);
    }
    if (flight.getFrom().equals(flight.getTo())) {
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
    }
    if (flight.isBadDates()) {
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
    }
    flightsRepository.addFlight(flight);
  }

  public Integer getNewId() {
    return (int) ((Math.random() * 9000000) + 1000000);
  }

  public Flight fetchFlight(Integer id) {
    return flightsRepository.fetchFlight(id);
  }

  public void deleteFlight(Integer id) {
    flightsRepository.deleteFlight(id);
  }
}
