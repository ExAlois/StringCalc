package test.com.strincalc;

import com.strincalc.StringCalc;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestStringCalc {
    StringCalc testStringCalc;
    @Before
    public void setUp() throws Exception {
        testStringCalc = new StringCalc();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testGetSum() throws Exception {
        assertEquals(5,testStringCalc.getSum(2,3));
    }

    @Test
    public void testAdd() throws Exception {
        assertEquals(6,testStringCalc.add("test1,2test,te3st"));
        //assertEquals(3,testStringCalc.add("//;\n1,2"));
    }

    @Test
    public void testGetDigestFromAnyString() throws Exception {
        assertEquals(33,testStringCalc.getNumberFromAnyString("3testString3"));
    }

    @Test
    public void testGetSumAllNumbersInAnyString() throws Exception {
        assertEquals(6,testStringCalc.getSumAllDigitsInAnyString("3testString3"));
    }
}
