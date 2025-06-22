public class Furniture implements FurnitureInterface{
    private String type;
    private String size;
    private double distance;

    public Furniture(String type, String size, double distance){
        this.type = type;
        this.size = size;
        this.distance = distance;
    }

    @Override
    public double accept(ShippingCostCalculator shippingCostCalculator, String type, String size, double distance){
        return shippingCostCalculator.computeShippingCost(type, size, distance);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    
}