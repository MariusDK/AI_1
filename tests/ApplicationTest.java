import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

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

    @Test
    public void p2() throws Exception {
        String in = "zero unu doi trei unu patru doi unu cinci";
        HashMap counter = Application.p2(in);
        assertTrue(Integer.parseInt(counter.get("zero").toString()) == 1);
        assertTrue(Integer.parseInt(counter.get("unu").toString()) == 3);
        assertTrue(Integer.parseInt(counter.get("doi").toString()) == 2);
        assertTrue(Integer.parseInt(counter.get("trei").toString()) == 1);
        assertTrue(Integer.parseInt(counter.get("patru").toString()) == 1);
        assertTrue(Integer.parseInt(counter.get("cinci").toString()) == 1);
        Iterator it = counter.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            System.out.println(pair.getKey() + " : " + pair.getValue());
            it.remove();
        }

        String in2 = "java";
        HashMap counter2 = Application.p2(in2);
        assertTrue(Integer.parseInt(counter2.get("java").toString()) == 1);

        String in3 = "c++ c++";
        HashMap counter3 = Application.p2(in3);
        assertTrue(Integer.parseInt(counter3.get("c++").toString()) == 2);

        String in4 = "c++ c++";
        HashMap counter4 = Application.p2(in4);
        assertFalse(Integer.parseInt(counter4.get("c++").toString()) == 1);

        String in5 = "java";
        HashMap counter5 = Application.p2(in5);
        assertTrue(counter5.get("c++") == null);
    }

    @Test
    public void p3() throws Exception {
        String in = "zero unu doi trei unu patru doi unu cinci";
        Map.Entry maxEntry = Application.p3(in);
        assertTrue(Integer.parseInt(maxEntry.getValue().toString()) == 3);

        assertFalse(Integer.parseInt(maxEntry.getValue().toString()) == 2);

        assertFalse(maxEntry.getKey().equals("doi"));

        String in2 = "c++ c++";
        Map.Entry maxEntry2 = Application.p3(in2);
        assertTrue(Integer.parseInt(maxEntry2.getValue().toString()) == 2);

        assertTrue(maxEntry.getKey().equals("c++"));
    }
}