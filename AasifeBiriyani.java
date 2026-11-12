import java.util.Scanner;
public class AasifeBiriyani extends Restaurant
{
    private int mandiPrice;
    private int bill;
    public AasifeBiriyani(int mandiPrice, String starter, int starterPrice, String friedRice, int friedRicePrice)
    {
        this.fishFinger = starter;
        this.friedRice = friedRice;
        this.fishFingerPrice = starterPrice;
        this.friedRicePrice = friedRicePrice;
        this.mandiPrice = mandiPrice;
    }

    @Override
    public void exploreMenu()
    {
        super.exploreMenu();
        System.out.println("Mandi: " + this.mandiPrice);
    }

    public int orderItem()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Select item to order: ");
        String item = input.nextLine();
        switch(item)
        {
            case "Mandi":
            bill = this.mandiPrice;
            break;
            case "Fish Finger":
            bill = this.fishFingerPrice;
            break;
            case "Fried Rice":
            bill = this.friedRicePrice;
        }
        return bill;
    }
}
