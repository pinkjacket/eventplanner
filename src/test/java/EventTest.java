import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {
    @Test
    public void getGuests_getOnePerson_1() {
    Event testEvent = new Event(1);
    assertEquals(1,testEvent.getGuests());
    }

    @Test
    public void getGuests_getMorePeople_50() {
        Event testEvent = new Event(50);
        assertEquals(50,testEvent.getGuests());
    }

}