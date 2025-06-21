public class AirConditioning implements HomeService{
    @Override
    public void turnOn(){
        System.out.println("AC has been turned on!");    }    

    @Override
    public void turnOff(){
        System.out.println("AC has been turned off!");    }
}
