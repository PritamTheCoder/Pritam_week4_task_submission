// Transport Ticket System
class Ticket{
    protected String ticketNumber;
    protected double price;
    public Ticket(String ticketNumber, double price){
        this.ticketNumber = ticketNumber;
        this.price = price;
    }

    public String generateTicket(){
        return "Ticket #" + ticketNumber + ", Price: $" + price;
    }
}

class BusTicket extends Ticket {
    protected int seatNumber;

    public BusTicket(String ticketNumber, double price, int seatNumber) {
        super(ticketNumber, price);
        this.seatNumber = seatNumber;
    }

    @Override
    public String generateTicket() {
        return "Bus Ticket #" + ticketNumber + " | Seat: " + seatNumber + " | Price: $" + price;
    }
}

class TrainTicket extends Ticket{
    private String coachType;

    public TrainTicket(String ticketNumber,double price, String coachType){
        super(ticketNumber,price);
        this.coachType = coachType;
    }

    @Override
    public String generateTicket(){
        return "Train Ticket #" + ticketNumber + " | Coach: " + coachType + " | Price: $" + price;
    }
}

class FlightTicket extends Ticket {
    private String boardingGate;

    public FlightTicket(String ticketNumber, double price, String boardingGate) {
        super(ticketNumber, price);
        this.boardingGate = boardingGate;
    }

    @Override
    public String generateTicket() {
        return "Flight Ticket #" + ticketNumber + " | Gate: " + boardingGate + " | Price: $" + price;
    }
}

public class TicketSystem {
    public static void main(String[] args) {
        Ticket[] tks = {
            new BusTicket("980B",12.00,44),
            new TrainTicket("2Y",25.00,"A06"),
            new FlightTicket("AAA",350.99,"B0")
        };
        for(Ticket t : tks){
            System.out.println(t.generateTicket());
        }
    }
}