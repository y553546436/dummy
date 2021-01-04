package dummy;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    static int x = 0;
    static int y = 0;
    
    @Test
    public void victim()
    {
        assertTrue(x == 0);
    }

    @Test
    public void ni()
    {
        y++;
        assertTrue(y == 1);
    }

    @Test
    public void polluter1()
    {
        x++;
        assertTrue(x == 1);
    }
    @Test
    public void polluter2()
    {
        x++;
        assertTrue(x == 2);
    }

    @Test
    public void cleaner()
    {
        x = 0;
    }
}
