package dummy;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
import org.junit.Rule;
import org.junit.rules.Verifier;
import org.junit.rules.TestRule;
import org.junit.runners.model.Statement;
import org.junit.runner.Description;
import org.junit.ClassRule;
import org.junit.Before;
import org.junit.After;

import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /*
    @Rule
    public RunTwiceRule runtwice = new RunTwiceRule();
    */
    @Rule
    public TestRule runtwice = new TestRule() {
        @Override
        public Statement apply(final Statement base, Description description) {
            return new Statement() {
                @Override
                public void evaluate() throws Throwable {
                    base.evaluate();
                    base.evaluate();
                }
            };
        }
    };
    /*
    @Rule
    public Verifier verifier = new Verifier() {
        @Override
        public void verify() {
            System.out.println("Hello World!");
        }
    };
    */
    @Before
    public void before() {
        System.out.println("before");
    }
    @After
    public void after() {
        System.out.println("after");
    }
    /**
     * Rigorous Test :-)
     */
    static int x = 0;
    static int y = 0;
    
    @Test
    public void victim()
    {
        System.out.println("victim");
        assertTrue(x == 0);
    }

    @Test
    public void ni()
    {
        System.out.println("ni");
        y++;
        assertTrue(y == 1);
    }

    @Test
    public void polluter1()
    {
        System.out.println("polluter1");
        x++;
        assertTrue(x == 1);
    }
    @Test
    public void polluter2()
    {
        System.out.println("polluter2");
        x++;
        assertTrue(x == 2);
    }

    @Test
    public void cleaner()
    {
        System.out.println("cleaner");
        x = 0;
    }
}
