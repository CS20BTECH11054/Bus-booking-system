package com.bus.booking.reservation.components;

import lombok.Data;

@Data
public class Seat {
    private Integer seatNumber;
    private Boolean isReserved;
    private String userEmailId;

    public Seat(Integer seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Seat(Integer seatNumber, Boolean isReserved, String userEmailId) {
        this.seatNumber = seatNumber;
        this.isReserved = isReserved;
        this.userEmailId = userEmailId;
    }
}
