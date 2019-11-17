package com.mmn;

import static org.junit.Assert.assertTrue;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void apply() {
        String a = "Hello";
        String b0 = a.substring(0, 3);
        String b1 = a.substring(0, a.length()-1);
        String b2 = a.substring(a.length()-1, a.length());
        String b3 = a.substring(a.length()-1, a.length()-1);
        String b4 = a.substring(1);
        String b5 = a.substring(a.length()-2);
        System.out.println(a.length());
        System.out.println(b0);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
    }

    @Test
    public void test2() {
        System.out.println(System.getProperty("user.home"));
    }
}
