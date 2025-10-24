package main.model.entities;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import main.model.exceptions.ReservationException;

public class Reservation {
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    private Integer roomNumber;
    private LocalDate checkIn;
    private LocalDate checkOut;
    
    public Reservation() {
    }

    public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkOut) {
        dateValidator(checkIn, checkOut);

        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }


    public LocalDate getCheckOut() {
        return checkOut;
    }

    public int duration(){
        Period duration = Period.between(checkIn, checkOut);

        return duration.getDays();
    }

    public void updateDates(LocalDate checkIn, LocalDate checkOut) {
        dateValidator(checkIn, checkOut);

        this.checkIn = checkIn;
        this.checkOut = checkOut;
        
    }

    @Override
    public String toString() {
        return "Room " 
            + roomNumber 
            + ", check-in: " 
            + checkIn.format(formatter) 
            + ", check-out: " 
            + checkOut.format(formatter) 
            + ", " + duration() 
            + "nights";
    }
    
    private void dateValidator(LocalDate checkIn, LocalDate checkOut) {
        if(checkIn.isAfter(LocalDate.now()) || checkOut.isAfter(LocalDate.now())){
            if(!checkOut.isAfter(checkIn)){
                throw new ReservationException("Check-out date must be after check-in date");
            }
        }else {
            throw new ReservationException("Reservation dates for update must be future dates");
        }
    }
}
