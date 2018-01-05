public class Event {
    private int people;
    private int foodType;
    private int drinkType;

    public Event(int numGuests, int foodLevel, int drinkLevel) {
        people = numGuests;
        foodType = foodLevel;
        drinkType = drinkLevel;
    }

    public int getGuests() {
        return people;
    }

    public int getDetails() {
        int cost = people * (foodType + drinkType + 10);
        return cost;
    }
}
