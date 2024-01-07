package com.bus.booking.reservation.services;

import com.bus.booking.reservation.documents.Bus;
import com.bus.booking.reservation.repositories.BusRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BusService {
    private BusRepository busRepository;
    public List<Bus> getAllBuses(){
        return busRepository.findAll();
    }
}
