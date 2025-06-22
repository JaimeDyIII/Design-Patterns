public class DeliveryApp{
    public static void main(String[] args) {
        Furniture chair = new Furniture("Chair", "Small", 10);
        Furniture table = new Furniture("Table", "Medium", 5);
        Furniture sofa = new Furniture("Sofa", "Large", 3);

        ShippingCostCalculator furnitureShippingCostCalculator = new FurnitureShippingCostCalculator();

        System.out.println("Delivery 1:\nFurniture Type: " + chair.getType() + "\nSize: " + chair.getSize() + "\nDistance: " + chair.getDistance() + " km");
        System.out.println("For chairs, since chairs have generally lightwewight, shipping cost is flat ₱300.\nCost of the chair furniture to be delivered is: ₱" +
                            chair.accept(furnitureShippingCostCalculator, chair.getType(), chair.getSize(), chair.getDistance())
        );

        System.out.println("\nDelivery 2:\nFurniture Type: " + table.getType() + "\nSize: " + table.getSize() + "\nDistance: " + table.getDistance() + " km");
        System.out.println("""
                               For Tables, shipping costs are as follows:
                               Small Table: Starts at ₱300 for the first kilomenter and ₱30 per kilometer after
                               Medium Table: Starts at ₱350 for the first kilomenter and ₱35 per kilometer after
                               Large Table: Starts at ₱400 for the first kilomenter and ₱40 per kilometer after
                               Cost of the table furniture to be delivered is: ₱""" +
                               table.accept(furnitureShippingCostCalculator, table.getType(), table.getSize(), table.getDistance() )
        );


        System.out.println("\nDelivery 3:\nFurniture Type: " + sofa.getType() + "\nSize: " + sofa.getSize() + "\nDistance: " + sofa.getDistance() + " km");
        System.out.println("""
                            For Sofas, shipping costs are as follows:
                            Small Sofa: Starts at ₱400 for the first kilomenter and ₱40 per kilometer after
                            Medium Sofa: Starts at ₱450 for the first kilomenter and ₱45 per kilometer after
                            Large Sofa: Starts at ₱500 for the first kilomenter and ₱50 per kilometer after
                            Cost of the sofa furniture to be delivered is: ₱""" +
                            sofa.accept(furnitureShippingCostCalculator, sofa.getType(), sofa.getSize(), sofa.getDistance())
        );
    }
}