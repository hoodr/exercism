/**
 * Created by drewhoo on 1/6/16.
 */
import java.lang.String;

public class Bob {
    public static String hey(String str){
        if (str.trim().isEmpty()){
            return "Fine. Be that way!";
        }
        if (isCaps(str)){
            return "Whoa, chill out!";
        }
        if (str.endsWith("?")){
            return "Sure.";
        }
            return "Whatever.";
    }
    public static boolean isCaps(String str){
        str = str.replaceAll("[^\\p{L}\\p{Nd}]+", " ").replaceAll("\\d", "").replaceAll("\\s+", "");
        if (str.isEmpty()){
            return false;
        }
        for(int i = 0; i < str.length(); i++) {
            if (!Character.isUpperCase(str.charAt(i))) {
                return false;
            }
        }
        return true;
        }
    }