public class HotelApp{
    public static void main(String[] args){
        String plateNumber = "ALS302";
        int roomNumber = 10;
        int noOfCarts = 3; 
        
        HotelService valet = new Valet(plateNumber);
        HotelService houseKeeping = new HouseKeeping(roomNumber);
        HotelService cart = new Cart(noOfCarts);

        FrontDesk valetService = new FrontDesk(valet);
        FrontDesk houseKeepingService = new FrontDesk(houseKeeping);
        FrontDesk cartService = new FrontDesk(cart);

        System.out.println(valetService.service());
        System.out.println(houseKeepingService.service());
        System.out.println(cartService.service());
    }
}