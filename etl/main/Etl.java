import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Etl {
    public Map<String, Integer> transform (Map<Integer, List<String>> old) {
        Map<String, Integer> newMap = new HashMap<>();
        for (Map.Entry<Integer, List<String>> entry : old.entrySet()) {
            for (String oldLetter : entry.getValue()) {
                newMap.put(oldLetter.toLowerCase(), entry.getKey());
            }
        }
        return newMap;
    }
}