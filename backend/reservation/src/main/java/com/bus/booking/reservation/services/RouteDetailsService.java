package com.bus.booking.reservation.services;

import com.bus.booking.reservation.documents.RouteDetails;
import com.bus.booking.reservation.repositories.RouteDetailsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class RouteDetailsService {
    private final RouteDetailsRepository routeDetailsRepository;

    public List<RouteDetails> getAllRouteDetails()
    {
        return routeDetailsRepository.findAll();
    }
    public RouteDetails postRouteDetails(RouteDetails routeDetails) {return routeDetailsRepository.save(routeDetails);}
    public Optional<RouteDetails> getRouteDetailsBySrcAndDest(String source, String dest) {return routeDetailsRepository.findRouteDetailsBySourceAndDestination(source, dest);}
}
