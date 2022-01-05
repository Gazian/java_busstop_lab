import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Passenger passenger;


    @Before

    public void before(){
        bus = new Bus("Codeclan",3);
        passenger= new Passenger();
    }

    @Test
    public void busStartsEmpty(){
        assertEquals(0,bus.passengerCount());
    }

    @Test
    public void addPassenger(){
        bus.add(passenger);
        bus.add(passenger);
        bus.add(passenger);
        bus.add(passenger);
        assertEquals(3,bus.passengerCount());
    }

    @Test
    public void removePassenger(){
        bus.add(passenger);
        bus.remove();
        assertEquals(0,bus.passengerCount());
    }



}
