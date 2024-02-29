package StepDefinition;

import java.io.IOException;

import Factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObjects.TravelInsurance;

public class travelInsurance extends BaseClass{
	
	@When("User selects travel insurance")
	public void user_selects_travel_insurance() {
		ti=new TravelInsurance (BaseClass.getDriver());
	    ti.clickTravelInsurance();
	}

	@When("User selects Destination")
	public void user_selects_destination() {
	    ti.enterDestination();
	}

	@When("User selects Date")
	public void user_selects_date() throws InterruptedException {
	    ti.enterTripDate();
	}

	@When("User selects Number of travellers")
	public void user_selects_number_of_travellers() throws IOException {
	    ti.enterTravellersDetail();
	}

	@When("User selects the medical condition")
	public void user_selects_the_medical_condition() {
	   ti.enterMedicalHistory();
	}

	@When("User Enters the mobile number")
	public void user_enters_the_mobile_number() throws IOException {
	    ti.enterContactDetails();
	}

	@When("User selects the student plan")
	public void user_selects_the_student_plan() throws InterruptedException {
	    ti.handlingPopup();
	    ti.typeOfPlan();
	}

	@When("User sort the plans")
	public void user_sort_the_plans() throws InterruptedException {
	    ti.sortByPrice();
	}

	@Then("Display the Results")
	public void display_the_results() throws InterruptedException, IOException {
	  ti.displayTravelInsurance();
	}
}
