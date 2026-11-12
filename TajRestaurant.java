import java.util.Scanner;

public class TajRestaurant extends Restaurant
{
    private int browniePrice;
    public TajRestaurant(int browniePrice, String starter, int starterPrice, String friedRice, int friedRicePrice)
    {
        this.browniePrice = browniePrice;
        this.fishFinger = starter;
        this.friedRice = friedRice;
        this.fishFingerPrice = starterPrice;
        this.friedRicePrice = friedRicePrice;
    }

    @Override
    public void exploreMenu()
    {
        super.exploreMenu();
        System.out.println("Brownie: " + this.browniePrice);
    }

    public int orderItem()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Select item to order: ");
        String item = input.nextLine();
        switch(item)
        {
            case "Brownie":
                bill = this.browniePrice;
                break;
            case "Fish Finger":
                bill = this.fishFingerPrice;
                break;
            case "Fried Rice":
                bill = this.friedRicePrice;
                break;
        }
        return bill;
    }
}
