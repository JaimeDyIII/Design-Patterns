public class Light implements HomeService{
    @Override
    public void turnOn(){
        System.out.println("Light has been turned on!");    }    

    @Override
    public void turnOff(){
        System.out.println("Light has been turned off!");    }
}
