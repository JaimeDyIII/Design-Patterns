public class FurnitureShippingCostCalculator implements ShippingCostCalculator{
    @Override
    public double computeShippingCost(String type, String size, double distance){
        double cost;
        switch(type){
            case "Chair" -> {
                cost = 300;
            }

            case "Table" -> {
                switch (size){
                    case "Small" -> cost = 300 + (30 * distance);
                    case "Medium" -> cost = 350 + (35 * distance);
                    case "Large" -> cost = 400 + (40 * distance);
                    default -> throw new IllegalArgumentException("Invalid furniture size!");

                }
            }

            case "Sofa" -> {
                switch (size){
                    case "Small" -> cost = 400 + (40 * distance);
                    case "Medium" -> cost = 450 + (45 * distance);
                    case "Large" -> cost = 500 + (50 * distance);
                    default -> throw new IllegalArgumentException("Invalid furniture size!");
                }
            }

            default -> throw new IllegalArgumentException("Invalid furniture type!");

        }

        return cost;
    }
}