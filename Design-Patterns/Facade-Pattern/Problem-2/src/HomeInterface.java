public class HomeInterface{
    private HomeService light;
    private HomeService tv;
    private HomeService ac;

    public HomeInterface(){
        this.light = new Light();
        this.tv = new TV();
        this.ac = new AirConditioning();
    }

    public void turnOnAll(){
        light.turnOn();
        tv.turnOn();
        ac.turnOn();
    }

    public void turnOffAll(){
        light.turnOff();
        tv.turnOff();
        ac.turnOff();
    }
}
