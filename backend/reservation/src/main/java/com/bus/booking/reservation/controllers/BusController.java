package com.bus.booking.reservation.controllers;

import com.bus.booking.reservation.services.BusService;
import com.bus.booking.reservation.documents.Bus;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class BusController {

    private final BusService busService;
    @GetMapping()
    public List<Bus> fetchAllBuses(){
        return busService.getAllBuses();
    }

}
