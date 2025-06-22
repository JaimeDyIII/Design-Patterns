public class UnliCallsTextPackage implements UnliCallsTextOffer{
    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText){
        switch (telcoName){
            case "Smart":
                return "Smart does not have free unlimited calls and text";
            case "Globe":
                return "Globe has unlimited calls and text with other globe networks";
            case "Ditto":
                return "Ditto has unlimited calls and text to any network within the country";
            default:
                return "Telco Name does not exist!";
        }
    }
}