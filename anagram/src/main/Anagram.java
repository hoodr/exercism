import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {
    public String anagram;
    public Anagram (String word) {
        anagram = word;
    }
    public List<String> match(List<String> pos){
        List<String> isAnagram = new ArrayList<>();
        for (int i = 0; i < pos.size(); i++){
            if (pos.get(i).length() == anagram.length()){
                char[] temp1 = pos.get(i).toLowerCase().toCharArray();
                char[] temp2 = anagram.toLowerCase().toCharArray();
                Arrays.sort(temp1);
                Arrays.sort(temp2);
                if (Arrays.equals(temp1, temp2) && !pos.get(i).toLowerCase().equals(anagram.toLowerCase())) {
                    isAnagram.add(pos.get(i));
                }
            }
        }
        return isAnagram;
    }
}