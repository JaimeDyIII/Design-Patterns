public class Cart implements HotelService{
    private int noOfCarts = 0;

    public Cart(int noOfCarts){
        this.noOfCarts = noOfCarts;
    }

    @Override
    public String service(){
        return requestCart(noOfCarts);
    }

    public String requestCart(int noOfCarts){
        return ("Cart requested on room number: " + noOfCarts);
    }
}