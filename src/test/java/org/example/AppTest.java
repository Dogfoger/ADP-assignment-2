package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Ignore;
import org.w3c.dom.ls.LSOutput;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    App a = new App();
    App b = new App();
    App c = a;

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void doesPrintHelloWorld() {
        String printed = "Hello world";
        Assert.assertTrue(printed.equals("Hello world"));
    }

    @Test
    public void objectEquality() {

        Assert.assertTrue (a != b && c == a);

    }

    @Test
    public void objectIdentity() {
        Assert.assertTrue(a.hashCode() != b.hashCode() && c.hashCode() == a.hashCode());
    }

    @Test
    public void failingTest() {
        Assert.assertTrue(a==b);
    }

    @Test (timeout = 1000)
    public void timeOut() {
        Assert.assertTrue (a != b && c == a);
    }


    @Ignore("not yet ready , Please ignore.")
    @Test
    public void disablingTest() {
        Assert.assertTrue (a != b && c == a);
    }
}
