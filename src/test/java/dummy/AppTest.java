package dummy;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    static int x;
    
    @Test
    public void t1()
    {
        assertTrue(x == 0);
    }

    @Test
    public void t2()
    {
        x++;
        assertTrue(x == 1);
    }

    @Test
    public void cleaner()
    {
        x = 0;
    }
}
