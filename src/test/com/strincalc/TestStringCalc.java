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
    public void testAdd() throws Exception {
        assertEquals(6, testStringCalc.add("test1,test-2,te3st", ","));
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
