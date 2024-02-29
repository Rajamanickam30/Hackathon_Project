package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.CarInsurance;
import testbase.BaseClass;

public class TC_002_CarInsuranceTest extends BaseClass {
	@Test(priority=1)
	public void test_HomePage() throws InterruptedException {

		ci=new CarInsurance(driver);
		BaseClass.navigate();
		logger.info("***** Starting TC_002_CarInsuranceTest *****");
		logger.info("clicking car insurance");
		ci.clickCarInsurance();
	}

	@Test(priority=2)
	public void test_carQuote() {
		logger.info("Entering the details");
		ci.carInsuranceQuote();
	}

	@Test(priority=3)
	public void test_carCityAndRto() {
		logger.info("Entering the details");
		ci.carCityAndRto();
	}

	@Test(priority=4)
	public void test_carBrand() {
		logger.info("Entering the details");
		ci.carBrand();
	}

	@Test(priority=5)
	public void test_carModel() {
		logger.info("Entering the details");
		ci.carModel();
	}

	@Test(priority=6)
	public void test_carFuelType() {
		logger.info("Entering the details");
		ci.carFuelType();
	}

	@Test(priority=7)
	public void test_carVariant() {
		logger.info("Entering the details");
		ci.carVariant();
	}

	@Test(priority=8)
	public void test_userDetails() throws IOException {
		logger.info("filling the user details");
		ci.fillDetails();
	}
	@Test(priority=9)
	public void test_captureErrorMsg() {
		logger.info("capturing error message");
		ci.captureErrorMsg();
		logger.info("***** Finishing TC_002_CarInsuranceTest *****");
	}



}
