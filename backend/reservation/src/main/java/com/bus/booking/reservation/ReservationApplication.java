package com.bus.booking.reservation;

import com.bus.booking.reservation.documents.BusDetails;
import com.bus.booking.reservation.documents.RouteDetails;
import com.bus.booking.reservation.repositories.BusDetailsRepository;
import com.bus.booking.reservation.repositories.RouteDetailsRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.IntStream;

@SpringBootApplication
public class ReservationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReservationApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(RouteDetailsRepository routeDetailsRepository){
		return args -> {
			System.out.println(routeDetailsRepository.findRouteDetailsBySourceAndDestination("Hyderabad", "Pune"));
		};
	}
	/*
	@Bean
	CommandLineRunner runner(BusDetailsRepository busDetailsRepository, RouteDetailsRepository routeDetailsRepository){
		return args -> {
			BusDetails busDetails = new BusDetails(
					2304,
					"Raghav Travels",
					54
			);
			List<Integer> list = IntStream.rangeClosed(1, 54)
					.boxed().toList();
			RouteDetails routeDetails = new RouteDetails(
					busDetails,
					"Hyderabad",
					"Pune",
					500,
					LocalDateTime.of(2024, 1, 30, 21, 30),
					LocalDateTime.of(2024, 1, 31, 6, 30),
					list
			);

			busDetailsRepository.findBusDetailsByBusNumber(busDetails.getBusNumber()).ifPresentOrElse(
					busDetails1 -> {
						System.out.println("Bus with bus number " + busDetails1.getBusNumber() + " already exists");
					},
					()->{
						System.out.println("Inseting Bus " + busDetails);
						busDetailsRepository.insert(busDetails);
					}
			);

			routeDetailsRepository.insert(routeDetails);
		};
	}

	@Bean
	CommandLineRunner runner(BusRepository busRepository){
		return args->{
			List<Integer> list = IntStream.rangeClosed(1, 54)
					.boxed().toList();
			Bus bus = new Bus(
					2304,
					"Raghav Travels",
					"Mumbai",
					"Bangalore",
					list,
					500,
					LocalDateTime.of(2024, 1, 30, 6, 30)
			);
			busRepository.findBusByBusNumber(bus.getBusNumber()).ifPresentOrElse(b->{
				System.out.println("Bus with bus number " + bus.getBusNumber() + " already exists");
			},()->{
				System.out.println("Inserting bus " + bus);
				busRepository.insert(bus);
			});
		};

	}*/
}
