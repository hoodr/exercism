/*
Count each occurrence of a word in a string
ignore punctuation
ignore caps
include numbers

 */

import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static Map<String, Integer> phrase(String str){
        String[] yo = str.replaceAll("[^A-Za-z0-9 ]", " ").toLowerCase().split("\\s+");
        Map<String, Integer> phraseCount = new HashMap<>();
        for (String s : yo){
            //If element is not in dictionary, val = null, so we need to use Integer class
            Integer counter = phraseCount.get(s);
            phraseCount.put(s, counter == null ? 1 : counter + 1 );
        }
        return phraseCount;
    }
}
