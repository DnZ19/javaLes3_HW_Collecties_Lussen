import java.util.HashMap;

public class Translator {

    HashMap<Integer, String> numericAlpha = new HashMap<>();

    //Constructor: (makes it useable in other classes)
    // iterates over the length of alp..
    // and adds for every find a num or alph to the HasMap

    public Translator(String[] alphabetic, Integer[] numeric) {
        for (int i = 0; i < alphabetic.length; i++) {
            numericAlpha.put(numeric[i], alphabetic[i]);
        }
    }

    //method
    public String translate(Integer number) {
        return numericAlpha.get(number);

    }


}


