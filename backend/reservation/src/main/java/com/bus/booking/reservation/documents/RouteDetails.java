package com.bus.booking.reservation.documents;

import com.bus.booking.reservation.components.Seat;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

@Data
@Document
public class RouteDetails {
    @Id
    private String id;
    private BusDetails bus;
    private String source;
    private String destination;
    private Integer distance;
    private LocalDateTime _ETA;
    private List<Seat> availableSeats;

    public RouteDetails(BusDetails bus, String source, String destination, Integer distance, LocalDateTime _ETA, List<Seat> availableSeats) {
        this.bus = bus;
        this.source = source;
        this.destination = destination;
        this.distance = distance;
        this._ETA = _ETA;
        this.availableSeats = availableSeats;
    }
}
