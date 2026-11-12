public class Restaurant
{
    protected String fishFinger;
    protected String friedRice;
    protected int fishFingerPrice;
    protected int friedRicePrice;
    protected int bill;

    public void exploreMenu()
    {
        System.out.println("MENU:");
        System.out.println("Fish Finger: " + this.fishFingerPrice);
        System.out.println("Fried Rice: " + this.friedRicePrice);
    }



}
