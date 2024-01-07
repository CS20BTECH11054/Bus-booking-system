package com.bus.booking.reservation.controllers;

import com.bus.booking.reservation.documents.RouteDetails;
import com.bus.booking.reservation.services.RouteDetailsService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:3000/")
@RequestMapping("/api/v1/routeDetails")
public class RouteDetailsController {

    private final RouteDetailsService routeDetailsService;


    @GetMapping("/getAll")
    public List<RouteDetails> fetchAllRouteDetails()
    {
        return routeDetailsService.getAllRouteDetails();
    }

    @GetMapping("/getSrcAndDest")
    public Optional<RouteDetails> fetchRouteDetailsSrcAndDest(@RequestParam String source, @RequestParam String dest)
    {
        return routeDetailsService.getRouteDetailsBySrcAndDest(source, dest);
    }

    @PostMapping()
    public ResponseEntity<RouteDetails> setRouteDetail(@RequestBody RouteDetails routeDetails)
    {
        System.out.println(routeDetails);
        RouteDetails savedrouteDetails = routeDetailsService.postRouteDetails(routeDetails);
        return new ResponseEntity<>(savedrouteDetails, HttpStatus.CREATED);
    }
}
