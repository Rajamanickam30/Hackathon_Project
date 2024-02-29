package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.TravelInsurance;
import testbase.BaseClass;

public class TC_001_TravelInsuranceTest extends BaseClass {


	@Test(priority=1)
	public void test_HomePage() {
		logger.info("***** Starting TC_001_TravelInsuranceTest *****");
		logger.info("clicking travel insurance");
		ti=new TravelInsurance(driver);
		ti.clickTravelInsurance();
	}
	@Test(priority=2)
	public void test_Destinations() {
		logger.info("entering destination");
		ti.enterDestination();
	}
	@Test(priority=3)
	public void test_TripDate() throws InterruptedException {
		logger.info("entering trip date");
		ti.enterTripDate();
	}
	@Test(priority=4)
	public void test_Travellers() throws IOException {
		logger.info("entering travellers detail");
		ti.enterTravellersDetail();
	}
	@Test(priority=5)
	public void test_MedicalHistory() {
		logger.info("entering travellers medical history");
		ti.enterMedicalHistory();
	}
	@Test(priority=6)
	public void test_contactDetails() throws IOException {
		logger.info("entering contact details");
		ti.enterContactDetails();
	}

	@Test(priority=7)
	public void test_StudentPlans() throws InterruptedException {
		logger.info("handling popup");
		ti.handlingPopup();
		logger.info("selcting the student plan");
		ti.typeOfPlan();
		logger.info("sorting the price as low to high");
		ti.sortByPrice();
	}
	@Test(priority=8)
	public void test_DisplayTravelInsurance() throws InterruptedException, IOException {
		logger.info("displaying travel insurance");
		ti.displayTravelInsurance();
		logger.info("***** Finishing TC_001_TravelInsuranceTest *****");
	}
}
