package Lesson6.hands;

public class SamsungHand implements IHand{
    private int price;
    SamsungHand(int price){ this.price = price; }
    SamsungHand(){}


    @Override
    public void upHand() {
        System.out.println("рука Samsung, поднята вверх");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
