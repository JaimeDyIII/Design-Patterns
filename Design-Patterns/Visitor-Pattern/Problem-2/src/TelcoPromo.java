public class TelcoPromo {
    public static void main(String[] args) {
        Telco smart = new Telco(15, 500, "Smart",false);
        Telco globe = new Telco(10, 450, "Globe",true);
        Telco ditto = new Telco(8, 400, "Ditto",true);
  
        UsagePromo promo = new TelcoAllowance();
        UnliCallsTextOffer unli = new UnliCallsTextPackage();    
  
        System.out.println("Smart Data Usage Offer and price: Data Allowance: " + smart.getDataAllowance() + "GB for 30 days " + promo.showAllowance(smart.getTelcoName(), smart.getPromoPrice()));
        System.out.println("Globe Data Usage Offer and price: Data Allowance: " + globe.getDataAllowance() + "GB for 30 days " + promo.showAllowance(globe.getTelcoName(), globe.getPromoPrice()));
        System.out.println("Ditto Data Usage Offer and price: Data Allowance: " + ditto.getDataAllowance() + "GB for 30 days " + promo.showAllowance(ditto.getTelcoName(), ditto.getPromoPrice()));
  
        System.out.println("\nSmart unlimited calls and text package: " +

                                    unli.showUnliCallsTextOffer(smart.getTelcoName(), smart.isUnliCallText()));
        System.out.println("Globe unlimited calls and text package: " +
  
                                    unli.showUnliCallsTextOffer(globe.getTelcoName(), globe.isUnliCallText()));
        System.out.println("Ditto unlimited calls and text package: " +
  
                                     unli.showUnliCallsTextOffer(ditto.getTelcoName(), ditto.isUnliCallText()));
    }
  }