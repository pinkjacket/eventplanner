import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {
    @Test
    public void getGuests_getOnePerson() {
    Event testEvent = new Event(1, 0, 0, 0);
    assertEquals(1,testEvent.getGuests());
    }

    @Test
    public void getGuests_getMorePeople() {
        Event testEvent = new Event(50, 0, 0, 0);
        assertEquals(50,testEvent.getGuests());
    }

    @Test
    public void getDetails_addFood() {
        Event testEvent = new Event (50, 5, 0, 0);
        assertEquals (750, testEvent.getDetails());
    }

    @Test
    public void getDetails_addDrink() {
        Event testEvent = new Event (50, 5, 3, 0);
        assertEquals (900, testEvent.getDetails());
    }

    @Test
    public void getDetails_addShow() {
        Event testEvent = new Event (50, 5, 3, 5);
        assertEquals (1150, testEvent.getDetails());
    }

    @Test
    public void useCoupon_addFiftyOffCoupon() {
        Event testEvent = new Event (50, 5, 3, 5);
        assertEquals(1100, testEvent.useCoupon(testEvent.getDetails(), "fiftyoff"));
    }

    @Test
    public void useCoupon_addFreeShowCoupon() {
        Event testEvent = new Event (50, 5, 3, 5);
        assertEquals(900, testEvent.useCoupon(testEvent.getDetails(), "freeshow"));
    }

}