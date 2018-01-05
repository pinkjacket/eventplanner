public class Event {
    private int people;
    private int foodType;
    private int drinkType;
    private int showType;

    public Event(int numGuests, int foodLevel, int drinkLevel, int showLevel) {
        people = numGuests;
        foodType = foodLevel;
        drinkType = drinkLevel;
        showType = showLevel;
    }

    public int getGuests() {
        return people;
    }

    public int getDetails() {
        int cost = people * (foodType + drinkType + showType + 10);
        return cost;
    }
}
