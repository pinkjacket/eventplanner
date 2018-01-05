import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import static java.lang.Integer.parseInt;
public class App {
    public static void main(String[] args) {

        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("How many guests are expected?");
            int numGuests = parseInt(bufferedReader.readLine());
            System.out.println("Would you like pizza ($5 a person) or fancy pizza? ($10 a person). Please enter the price you prefer.");
            int foodType = parseInt(bufferedReader.readLine());
            System.out.println("Would you prefer soda ($2 a person) or cocktails? ($8 a person) Please enter the price you prefer.");
            int drinkType = parseInt(bufferedReader.readLine());
            System.out.println("Would you prefer live theater ($10 a person) or quality marijuana for all guests? ($20 a person) Please enter the price you prefer.");
            int showType = parseInt(bufferedReader.readLine());

            System.out.println("If you have a coupon code, please enter it now.");
            String promoCode = bufferedReader.readLine();

            Event party = new Event( numGuests, foodType, drinkType, showType);
            int startCost = party.getDetails();
            int finalCost = party.useCoupon(startCost, promoCode);
            System.out.print("Your bill comes to: ");
            System.out.println(finalCost);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
