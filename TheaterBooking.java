//  Movie Theater Booking System
class Seat {
    protected int seatNumber;
    public Seat(int seatNumber) {
        this.seatNumber = seatNumber;
    }
    public String bookSeat() {
       return "Seat : #" + seatNumber + " booked.";
    }
}

class RegularSeat extends Seat {
    public RegularSeat(int seatNumber) {
        super(seatNumber);
    }

    @Override
    public String bookSeat() {
        return "Regular Seat : #" + seatNumber + " booked successfully.";
    }
}

class PremiumSeat extends Seat {
    public PremiumSeat(int seatNumber) {
        super(seatNumber);
    }

    @Override
    public String bookSeat() {
        return "Premium Seat : #" + seatNumber + " booked with snacks and luxury tax included.";
    }
}

public class TheaterBooking {
    public static void main(String[] args) {
        Seat[] seats = {
            new RegularSeat(1),
            new PremiumSeat(2),
            new RegularSeat(3)
        };

        for (Seat se : seats) {
            System.out.println(se.bookSeat());
        }
    }
}