import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private Person person;

    @Before
    public void before(){
        busStop = new BusStop("Livingston");
        person = new Person();
    }


    @Test
    public void busStopHasName(){
        assertEquals("Livingston", busStop.getName());
    }

    @Test
    public void canAddPersonToQueue(){
        busStop.addPersonToQueue(person);
        busStop.addPersonToQueue(person);
        assertEquals(2, busStop.getQueueTotal());
    }

    @Test
    public void canRemoverPersonFromQueue(){
        busStop.addPersonToQueue(person);
        busStop.removePersonFromQueue();
        assertEquals(0, busStop.getQueueTotal());
    }

}

