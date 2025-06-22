public class TelcoAllowance implements UsagePromo{
    @Override
    public String showAllowance(String telcoName, double money){
        return telcoName + " Promo costs " + money + " pesos per month";
    }
}