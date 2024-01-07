package com.bus.booking.reservation.repositories;

import com.bus.booking.reservation.documents.Bus;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface BusRepository extends MongoRepository<Bus, Integer> {
    Optional<Bus> findBusByBusNumber(Integer BusNumber);
}
