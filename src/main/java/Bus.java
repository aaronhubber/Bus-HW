import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Person>();
    }

    public int getNumberOfPassengers() {
        return this.passengers.size();
    }

    public String getDestination() {
        return this.destination;
    }

    public String addPassenger(BusStop busStop) {
        if (this.passengers.size() <= this.capacity) {
            Person person = busStop.removePersonFromQueue();
            this.passengers.add(person);
        } else;
        {
            return "no spaces";
        }}

    public void removePassenger() {
        this.passengers.remove(0);
    }
}
