import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {
    @Test
    public void getGuests_getOnePerson() {
    Event testEvent = new Event(1, 5);
    assertEquals(1,testEvent.getGuests());
    }

    @Test
    public void getGuests_getMorePeople() {
        Event testEvent = new Event(50, 5);
        assertEquals(50,testEvent.getGuests());
    }

    @Test
    public void getDetails_addFood() {
        Event testEvent = new Event (50, 5);
        assertEquals (250, testEvent.getDetails());
    }

}