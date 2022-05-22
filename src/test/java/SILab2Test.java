import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class SILab2Test {

    private List<String> createList(String... elems) {
        return new ArrayList<>(Arrays.asList(elems));
    }

    @Test
    public void test1(){
        IllegalArgumentException ex;
        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(createList()));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));


        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(createList("x", "x", "x")));
        assertTrue(ex.getMessage().contains("List length should be a perfect square"));

        List<String> result = SILab2.function(createList("0", "#", "0", "0", "0", "#", "0", "#", "#"));
        List<String> actual = createList("1", "#", "2", "0", "3", "#", "1", "#", "#");
        assertEquals(result, actual);

        //# 0 # # # # # # #
        result = SILab2.function(createList("#", "0", "#", "#", "#", "#", "#", "#", "#"));
        actual = createList("#", "3", "#", "#", "#", "#", "#", "#","#");
        assertEquals(result, actual);
    }

    @Test
    public  void test2(){
        test1();
    }

}
