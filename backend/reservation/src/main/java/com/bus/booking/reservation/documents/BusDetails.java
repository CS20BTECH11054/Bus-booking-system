package com.bus.booking.reservation.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class BusDetails {
    @Id
    private Integer busNumber;
    private String busName;
    private Integer totalNumOfSeats;

    public BusDetails(Integer busNumber, String busName, Integer totalNumOfSeats) {
        this.busNumber = busNumber;
        this.busName = busName;
        this.totalNumOfSeats = totalNumOfSeats;
    }
}
