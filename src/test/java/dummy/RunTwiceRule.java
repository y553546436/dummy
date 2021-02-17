package dummy;

import org.junit.rules.TestRule;
import org.junit.runners.model.Statement;
import org.junit.runner.Description;

public class RunTwiceRule implements TestRule {
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
}
