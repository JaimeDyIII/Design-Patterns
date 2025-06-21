public class FrontDesk{
    private HotelService hotelService;

    public FrontDesk (HotelService hotelService){    
        this.hotelService = hotelService;
    }

    public String service(){
        return hotelService.service();
    }
}