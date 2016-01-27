/**
 * Created by drewhoo on 1/19/16.
 */
public class PhoneNumber {
    public String phoneNumber;
    public PhoneNumber(String number) {
        phoneNumber = cleanUpNumber(number);
    }
    public String getNumber(){
        return phoneNumber;
    }
    public String getAreaCode(){
        return phoneNumber.substring(0,3);
    }
    public String pretty(){
        return  "(" + phoneNumber.substring(0,3) + ")" + " " + phoneNumber.substring(3,6) + "-" + phoneNumber.substring(6,10);
    }

    private String cleanUpNumber(String num){
        num = num.replaceAll("[^0-9]", "");
        if (num.length() < 10 || num.length() > 11){
            return "0000000000";
        }
        else if (num.length() == 10) {
            return num;
        }
        else if (num.length() == 11 && num.startsWith("1")){
            return num.substring(1);
        }
        else{
            return "0000000000";
        }
    }
}
