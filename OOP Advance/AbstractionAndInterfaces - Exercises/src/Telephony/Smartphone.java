package Telephony;


public class Smartphone implements phonesCalling,phonesBrowsing{

    @Override
    public String makeCall(String number) {
        for (Character character:number.toCharArray()) {
            if(!Character.isDigit(character)){
                return "Invalid number!";
            }
        }
        return "Calling... " + number;
    }

    @Override
    public String startBrowse(String webAress) {
        for (Character num:webAress.toCharArray()) {
           if(Character.isDigit(num)){
               return "Invalid URL!";
           }
        }
        return "Browsing: " + webAress + "!";
    }
}
