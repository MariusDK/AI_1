import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Incau Ionut on 06-Mar-17.
 * Contact: ionut.incau@gmail.com
 */

public class ApplicationTest {

    @Test
    public void p1() throws Exception {
        String in = "Buchetul contine trei lalele si treisprezeze frezii";
        String longest_word = Application.p1(in);
        assertEquals(longest_word, "treisprezeze");

        assertFalse(longest_word.equals("trei"));

        String in2 = "Buchetul contine treisprezeze lalele si treisprezeze frezii";
        String longest_word2 = Application.p1(in2);
        assertEquals(longest_word2, "treisprezeze");

        String in3 = "Buchetul";
        String longest_word3 = Application.p1(in3);
        assertEquals(longest_word3, "Buchetul");

        String in4 = "Studenta emineta";
        String longest_word4 = Application.p1(in4);
        assertEquals(longest_word4, "Studenta");
    }

}