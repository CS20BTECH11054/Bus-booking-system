package com.bus.booking.reservation.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Document
public class Bus {

    @Id
    private Integer busNumber;
    private String busName;
    private String source;
    private String destination;
    private List<Integer> availableSeats;
    private Integer distance;
    private LocalDateTime _ETA;

    public Bus(Integer busNumber, String busName, String source, String destination, List<Integer> availableSeats, Integer distance, LocalDateTime _ETA) {
        this.busNumber = busNumber;
        this.busName = busName;
        this.source = source;
        this.destination = destination;
        this.availableSeats = availableSeats;
        this.distance = distance;
        this._ETA = _ETA;
    }
}
