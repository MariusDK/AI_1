import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Incau Ionut on 05-Mar-17.
 * Contact: ionut.incau@gmail.com
 */

public class Application {
    public static void main(String[] args) {

    }

    /**
     * Să se determine cuvântul de lungime maximă din cadrul unui text. Cuvintele sunt
     separate prin spațiu. În cazul în care există mai multe cuvinte de lungime maximă, se
     va returna ultimul cuvânt identificat.
     */
    public static String p1(String in) {
        String longest_word = "";
        String[] splited = in.split("\\s+");
        for (String word : splited) {
            if (word.length() >= longest_word.length()) {
                longest_word = word;
            }
        }
        return longest_word;
    }


    /**
     * Să se determine frecvența de apariție a cuvintelor într-un text.
     */
    public static HashMap p2(String in) {
        String[] splited = in.split("\\s+");
        HashMap counter = new HashMap(splited.length);
        for (String word : splited) {
            if (counter.containsKey(word)) {
                counter.put(word, Integer.parseInt(counter.get(word).toString()) + 1);
            }
            else {
                counter.put(word, 1);
            }
        }
        return counter;
    }

    /**
     * Să se determine cel mai frecvent cuvânt într-un text.
     */
    public static Map.Entry p3(String in) {
        String[] splited = in.split("\\s+");
        HashMap counter = new HashMap(splited.length);
        for (String word : splited) {
            if (counter.containsKey(word)) {
                counter.put(word, Integer.parseInt(counter.get(word).toString()) + 1);
            }
            else {
                counter.put(word, 1);
            }
        }

        Map.Entry maxEntry = null;
        Iterator it = counter.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            if (maxEntry == null || Integer.parseInt(maxEntry.getValue().toString()) < Integer.parseInt(pair.getValue().toString())) {
                maxEntry = pair;
            }
            it.remove();
        }
        return maxEntry;
    }
}
