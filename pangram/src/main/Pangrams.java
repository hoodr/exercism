/**
 * Created by drewhoo on 1/5/16.
 */
/*
Ignore case
Ignore Punctuation
ignore non-Ascii
 */
import java.lang.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Pangrams {
    public static boolean isPangram(String s){
        String[] listLetters = s.replaceAll("[^a-zA-Z ]", "").toLowerCase().replaceAll("\\s+", "").split("");
        Set<String> test = new HashSet<String>(Arrays.asList(listLetters));
        return test.size() == 26;
    }
}
