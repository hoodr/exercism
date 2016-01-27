


public class Hamming {
    public static int compute (String a, String b){
        int index = 0;
        int counter = 0;
        if (a.length() == b.length()){
            while (index < a.length()) {
                if (a.charAt(index) == b.charAt(index)) {
                    index++;
                } else {
                    counter++;
                    index++;
                }
            }
            return counter;
        }
        else{
            throw new IllegalArgumentException();
        }
    }

}
