import java.util.ArrayList;

public class Bus {
    private String destination;
    private Integer capacity;
    private ArrayList<Passenger> usedSeats;

    public Bus (String destination, Integer capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.usedSeats = new ArrayList<Passenger>();
    }

    public int passengerCount(){
        return usedSeats.size();
    }
    public void add(Passenger passenger) {
        if(this.usedSeats.size() < Bus.this.capacity) {
            this.usedSeats.add(passenger);
        }
    }

    public Passenger remove(){
        return this.usedSeats.remove(0);
    }




}
