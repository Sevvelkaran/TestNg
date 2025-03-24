package TEST;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.testng.annotations.Test;
import org.testng.Assert;

public class JUnitTestRunner {
    @Test
    public void runJUnitTests() {
        Result result = JUnitCore.runClasses(JUnitTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println("JUnit Test Failure: " + failure.toString());
        }
        Assert.assertTrue(result.wasSuccessful(), "JUnit Tests Failed");
    }
}
