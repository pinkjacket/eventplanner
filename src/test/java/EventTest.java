import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {
    @Test
    public void getGuests_getOnePerson() {
    Event testEvent = new Event(1, 0, 0);
    assertEquals(1,testEvent.getGuests());
    }

    @Test
    public void getGuests_getMorePeople() {
        Event testEvent = new Event(50, 0, 0);
        assertEquals(50,testEvent.getGuests());
    }

    @Test
    public void getDetails_addFood() {
        Event testEvent = new Event (50, 5, 0);
        assertEquals (750, testEvent.getDetails());
    }

    @Test
    public void getDetails_addDrink() {
        Event testEvent = new Event (50, 5, 3);
        assertEquals (750, testEvent.getDetails());
    }

}