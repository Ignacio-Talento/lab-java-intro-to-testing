import com.ironhack.OddIntegers;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OddIntegersTest {

    @Test
    public void testOddIntegers() {
        OddIntegers oddIntegers = new OddIntegers();

        // Test case n = 1
        List<Integer> expected1 = Arrays.asList(1);
        assertEquals(expected1, oddIntegers.getOddIntegers(1));

        // Test case n = 2
        List<Integer> expected2 = Arrays.asList(1);
        assertEquals(expected2, oddIntegers.getOddIntegers(2));

        // Test case n = 10
        List<Integer> expected3 = Arrays.asList(1, 3, 5, 7, 9);
        assertEquals(expected3, oddIntegers.getOddIntegers(10));

        // Test case n = 0
        List<Integer> expected4 = new ArrayList<>();
        assertEquals(expected4, oddIntegers.getOddIntegers(0));

        // Test case n = -5
        List<Integer> expected5 = new ArrayList<>();
        assertEquals(expected5, oddIntegers.getOddIntegers(-5));


    }






}
