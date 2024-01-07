package com.bus.booking.reservation.repositories;

import com.bus.booking.reservation.documents.BusDetails;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface BusDetailsRepository extends MongoRepository<BusDetails, String> {

    Optional<BusDetails> findBusDetailsByBusNumber(Integer busNumber);
}
