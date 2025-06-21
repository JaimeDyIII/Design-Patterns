package adapterPattern;

public class LaptopAdapter implements PowerOutlet{
    Laptop laptop = new Laptop();

    public LaptopAdapter(Laptop laptop){
        this.laptop = laptop;
    } 

    @Override
    public void plugin(){
        laptop.charge();
    }
}
