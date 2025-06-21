package adapterPattern;

public class RefrigeratorAdapter implements PowerOutlet{
    Refrigerator refrigerator = new Refrigerator();

    public RefrigeratorAdapter(Refrigerator refrigerator){
        this.refrigerator = refrigerator;
    }

    @Override
    public void plugin(){
        refrigerator.startCooling();
    }
}
