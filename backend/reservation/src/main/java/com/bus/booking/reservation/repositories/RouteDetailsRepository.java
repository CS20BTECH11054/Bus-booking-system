package com.bus.booking.reservation.repositories;

import com.bus.booking.reservation.documents.BusDetails;
import com.bus.booking.reservation.documents.RouteDetails;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.LocalDateTime;
import java.util.Optional;

public interface RouteDetailsRepository extends MongoRepository<RouteDetails, String> {
    Optional<RouteDetails> findRouteDetailsByBus(BusDetails busDetails);
    Optional<RouteDetails> findRouteDetailsBySourceAndDestination(String source, String destination);
    //Optional<RouteDetails> findRouteDetailsByBusAnd_ETA(BusDetails busDetails, LocalDateTime _ETA);

}
