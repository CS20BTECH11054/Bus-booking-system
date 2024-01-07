package com.bus.booking.reservation.services;

import com.bus.booking.reservation.documents.BusDetails;
import com.bus.booking.reservation.repositories.BusDetailsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class BusDetailsService {
    private final BusDetailsRepository busDetailsRepository;

    public List<BusDetails> getAllBusDetails()
    {
        return busDetailsRepository.findAll();
    }
}
