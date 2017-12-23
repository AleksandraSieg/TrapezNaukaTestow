package pl.madison;

import org.junit.Assert;
import org.junit.Test;

public class TrapezTest {
//    @Before
//    public void setUp() throws Exception {
//    }
//
//    @After
//    public void tearDown() throws Exception {
//    }

    @Test
    public void poleTrapezu() throws Exception {
        Trapez trapez = new Trapez();

        double p1 = 2.0;
        double p2 = 3.0;
        double h = 4.0;

        double wynik = trapez.poleTrapezu(p1,p2,h);

        Assert.assertEquals(10, wynik, 0);

    }

}