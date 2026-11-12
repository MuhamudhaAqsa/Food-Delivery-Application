import java.util.Scanner;
public class Customer
{
    private String choiceOfRestaurant;
    private int bill;
    public void viewRestaurants()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Restaurants nearby:");
        System.out.println("Taj Restaurant");
        System.out.println("Aasife Biriyani");
        System.out.print("Where do you want to buy food from? ");
        choiceOfRestaurant = input.nextLine();

        if(choiceOfRestaurant.equals("Aasife Biriyani"))
        {
           AasifeBiriyani aasifeBiriyani = new AasifeBiriyani(750, "Fish Finger", 394, "Fried Rice", 270);
           aasifeBiriyani.exploreMenu();
           bill = aasifeBiriyani.orderItem();
        }
        else if(choiceOfRestaurant.equals("Taj Restaurant"))
        {
            TajRestaurant tajRestaurant = new TajRestaurant(120, "Fish Finger", 300, "Fried Rice", 320);
            tajRestaurant.exploreMenu();
            bill = tajRestaurant.orderItem();
        }
        System.out.println("Your bill is: " + bill);
    }




}