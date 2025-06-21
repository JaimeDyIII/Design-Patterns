package adapterPattern;

public class ViewerApp {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        Refrigerator refrigerator = new Refrigerator();
        SmartphoneCharger smartphoneCharger = new SmartphoneCharger();

        PowerOutlet laptopRC = new LaptopAdapter(laptop);
        PowerOutlet refrigeratorRC = new RefrigeratorAdapter(refrigerator);
        PowerOutlet smartphoneChargerRC = new SmartphoneChargerAdapter(smartphoneCharger);

        laptopRC.plugin();
        refrigeratorRC.plugin();
        smartphoneChargerRC.plugin();
    }
}
