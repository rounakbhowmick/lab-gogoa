package services;

import java.time.LocalDate;

import model.Bus;
import model.Flight;
import model.Hotel;
import model.Train;

// Type your code
public class FareCalculator extends Booking {
	double total_fare;

	public double book(Hotel hotel) {
		int noOfPersons = hotel.getNoOfPersons();
		String roomType = hotel.getRoomType();
		int rates = hotel.getRates();
		String occupancy = hotel.getOccupancy();
		LocalDate fromdate = hotel.getFromdate();
		LocalDate todate = hotel.getTodate();
		if (noOfPersons == 3) {
			hotel.setRoomType("double");
			hotel.setRoomType("single");// Doubt
		} else if (noOfPersons == 2) {
			hotel.setRoomType("double");
		} else {
			hotel.setRoomType("single");
		}
		if (fromdate.isAfter(todate)) {
			total_fare = Booking.booking(noOfPersons, rates);
			return total_fare;
		} else
			return total_fare;

	}

	public double book(Flight flight) {
		int persons = flight.getNoOfPersons();
		int rates = flight.getRates();
		LocalDate fromdate = flight.getFrom();
		LocalDate todate = flight.getTo();
		String triptype = flight.getTriptype();
		double data = 0.0;

		if (triptype == "One-Way") {
			data = Booking.booking(persons, rates);
		}

		if (todate.isAfter(fromdate)) {
			rates = rates * 2;
			data = Booking.booking(persons, rates);
		}
		return data;

	}

	public double book(Train train) {

		int persons = train.getNoOfPersons();
		int rates = train.getRates();
		double data = Booking.booking(persons, rates);
		return data;
	}

	public double book(Bus bus) {
		int persons = bus.getNoOfPersons();
		int rates = bus.getRates();
		double data = Booking.booking(persons, rates);
		return data;
	}
}
