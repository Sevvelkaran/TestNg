package DataProvider;

import org.testng.annotations.DataProvider;

public class DPDemo {
    
	@DataProvider(name="testData", parallel = true)
	public Object[][] dataProvFunc(){
		return new Object[][] {
			{"Automation Tester", "2-5 years"},
			{"Performance Tester", "3+ years"},
			{"DevOps", "5+ years"} };

    }
}
