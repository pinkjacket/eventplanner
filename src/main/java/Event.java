public class Event {
    private int people;
    private int foodType;

    public Event(int numGuests, int foodLevel) {
        people = numGuests;
        foodType = foodLevel;
    }

    public int getGuests() {
        return people;
    }

    public int getDetails() {
        int cost = people * 10 * foodType;
        return cost;
    }
}
