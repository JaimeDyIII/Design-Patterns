public class Valet implements HotelService{
    private String plateNumber = "ABC093";

    public Valet(String plateNumber){
        this.plateNumber = plateNumber;
    }

    @Override
    public String service(){
        return pickUpVehicle(plateNumber);
    }

    public String pickUpVehicle(String plateNumber){
        return ("Valet service requested on plate number: " + plateNumber);
    }
}