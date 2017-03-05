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
}
