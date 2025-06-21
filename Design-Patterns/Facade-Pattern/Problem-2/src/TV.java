public class TV implements HomeService{
    @Override
    public void turnOn(){
        System.out.println("TV has been turned on!");
    }    

    @Override
    public void turnOff(){
        System.out.println("TV has been turned off!");
    }
}
