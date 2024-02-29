package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.HealthInsurance;
import testbase.BaseClass;

public class TC_003_HealthInsuranceTest extends BaseClass {

	@Test
	public void test_MenuItems() throws InterruptedException, IOException {

		hi=new HealthInsurance(driver);
		BaseClass.navigate();
		logger.info("***** Starting TC_003_HealthInsuranceTest *****");
		logger.info("displaying the health insurance");
		hi.displayMenuItems();
		logger.info("***** Finishing TC_003_HealthInsuranceTest *****");
	}

}
