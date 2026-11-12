import java.util.Scanner;
public class FoodDeliveryApp
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Customer aoufin = new Customer();
        Restaurant restaurant = new Restaurant();
        aoufin.viewRestaurants();
    }
}
