/**
 * Created by Alexander_Demidovich on 10/8/2016.
 */

import Handler.Handler;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JUnitTests {
    @Test
    public void FindMinCountElem_RandomArr_4Returned() {
        int[] actualArrOfNumbers = {111, 5, 7, 43, 3, 0, 123, 2, 11, 8};
        int actual  = Handler.findMinCountElemToAbort(actualArrOfNumbers,0,actualArrOfNumbers[0],1);
        int expected = 6;
        assertEquals(expected,actual);
    }
    @Test
    public void FindMinCountElem_EmptyArr_0Returned() {
        int[] actualArrOfNumbers = {};
        int actual  = Handler.findMinCountElemToAbort(actualArrOfNumbers,0,0,1);
        int expected = 0;
        assertEquals(expected,actual);
    }
    @Test
    public void FindMinCountElem_OneElemInArr_0Returned() {
        int[] actualArrOfNumbers = {0};
        int actual  = Handler.findMinCountElemToAbort(actualArrOfNumbers,0,actualArrOfNumbers[0],1);
        int expected = 0;
        assertEquals(expected,actual);
    }
}
