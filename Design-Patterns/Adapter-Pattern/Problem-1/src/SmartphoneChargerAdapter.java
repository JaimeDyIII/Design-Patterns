package adapterPattern;

public class SmartphoneChargerAdapter implements PowerOutlet {
    SmartphoneCharger smartphoneCharger = new SmartphoneCharger();

    public SmartphoneChargerAdapter(SmartphoneCharger smartphoneCharger){
        this.smartphoneCharger = smartphoneCharger;
    }

    @Override
    public void plugin(){
        smartphoneCharger.chargePhone();
    }
}
