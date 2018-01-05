import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {
    @Test
    public void getGuests_getOnePerson_1() {
    Event testEvent = new Event(0);
    assertEquals(1,testEvent.getGuests());
    }

}