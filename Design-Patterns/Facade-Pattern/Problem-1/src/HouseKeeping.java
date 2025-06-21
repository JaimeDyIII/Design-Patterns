public class HouseKeeping implements HotelService{
    private int roomNumber;

    public HouseKeeping(int roomNumber){
        this.roomNumber = roomNumber;
    }

    @Override
    public String service(){
        return cleanRoom(roomNumber);
    }

    public String cleanRoom(int roomNumber){
        return ("Cleaning service requested on room number: " + roomNumber);
    }
}