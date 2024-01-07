package com.bus.booking.reservation.controllers;

import com.bus.booking.reservation.documents.BusDetails;
import com.bus.booking.reservation.services.BusDetailsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/busDetails")
public class BusDetailsController {

    private final BusDetailsService busDetailsService;

    @GetMapping()
    public List<BusDetails> fetchAllBusDetails()
    {
        return busDetailsService.getAllBusDetails();
    }
}
