/**
 * Created by drewhoo on 1/10/16.
 */
//private static final String EXPECTED_ROBOT_NAME_PATTERN = "[A-Z]{2}\\d{3}";
    /*
    Random Name in the pattern of 2 Capital Letters and 3 numbers
    Store name in Dictionary, check name to dictionary every time.
     */
import java.util.HashSet;
import java.util.Random;

public class Robot {
    public static HashSet<String> newDict = new HashSet<>();

    public static String getName(){
        String finalName = getNameHelper();
        if (!newDict.contains(finalName)){
            return finalName;
        }
        else{
            return getName();
        }
    }
    public static String reset(){
        return getName();
    }
    private static String getNameHelper(){
        StringBuilder name = new StringBuilder();
        for (int i = 0; i <= 4; i++){
            if (i <= 1){
                name.append(randomLetter());
            }
            if (i >= 2){
                name.append(randomNum());
            }
        }
        return name.toString();
    }

    private static int randomNum(){
        Random rand = new Random();
        return rand.nextInt(10);
    }
    private static Character randomLetter(){
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWRXYZ";
        int n = alphabet.length();
        Random rand = new Random();
        return alphabet.charAt(rand.nextInt(n));
    }
}
