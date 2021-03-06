package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }


    public void testBigMinSize(){
        Integer[] a={1,2,3,4,5};
        Integer[] b={4,5};
        assertEquals(-1,App.containsAll(a,b,3,7));
    }
    public void testSmallMaxSize(){
    	Integer[] a={1,2,3,4,5};
    	Integer[] b={4,5};
        assertEquals(-1,App.containsAll(a,b,1,4));
    }
    public void testBigArraySmaller(){
    	Integer[] a={1,2,3,4,5};
    	Integer[] b={4,5};
        assertEquals(-1,App.containsAll(b,a,1,6));
    }
    public void testEmptyArray(){
    	Integer[] a={1,2,3,4,5};
    	Integer[] b={};
        assertEquals(-1,App.containsAll(a,b,1,6));
    }
    public void testContains(){
    	Integer[] a={1,2,3,4,5};
    	Integer[] b={4,5};
        assertEquals(3,App.containsAll(a,b,1,6));
    }
    public void testNotContains(){
    	Integer[] a={1,2,3,4,5};
    	Integer[] b={4,4};
        assertEquals(-1,App.containsAll(a,b,1,6));
    }

}
