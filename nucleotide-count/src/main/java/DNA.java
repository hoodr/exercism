
/* Need two classes - count and nucleotideCounts
DNA dna = new DNA("xxxx") -> need to make "xxxx" usable for whole class
count returns an int given a char
nucleotideCounts returns a map given no arguments
 */

import java.util.HashMap;
import java.util.Map;

public class DNA{
    public DNA(String s) {this.dnaStrand = s;}
    private String dnaStrand;

    public Map<Character, Integer> nucleotideCounts(){
        Map<Character, Integer> nucleotideMap = new HashMap<>();
        nucleotideMap.put('A', 0);
        nucleotideMap.put('T', 0);
        nucleotideMap.put('C', 0);
        nucleotideMap.put('G', 0);
        for (char x : dnaStrand.toCharArray()) {
            nucleotideMap.put(x, nucleotideMap.get(x) + 1);
        }
        return nucleotideMap;
    }

    public int count(char a){
        if (a == 'A' || a == 'T' || a == 'C' || a == 'G') {
            return nucleotideCounts().get(a);
        }
        else{
            throw new IllegalArgumentException();
        }
    }
}