package StepDefinition;

import java.io.IOException;

import Factory.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CarInsurance;

public class carInsurance extends BaseClass{

	@When("User selects Car insurance")
	public void user_selects_car_insurance() {
	   ci=new CarInsurance(BaseClass.getDriver());
	   ci.clickCarInsurance(); 
	}

	@When("User selects Car insurance quote")
	public void user_selects_car_insurance_quote() {
	   ci.carInsuranceQuote();
	}

	@When("user selects City and Rto")
	public void user_selects_city_and_rto() {
	   ci.carCityAndRto();
	}

	@When("user selects the car brand")
	public void user_selects_the_car_brand() {
	   ci.carBrand(); 
	}

	@When("user selects the car model")
	public void user_selects_the_car_model() {
	   ci.carModel();
	}

	@When("user selects the fuel type of the selected car")
	public void user_selects_the_fuel_type_of_the_selected_car() {
	   ci.carFuelType();
	}

	@When("user selects the car Variant")
	public void user_selects_the_car_variant() {
	   ci.carVariant();  
	}

	@When("user fill the details")
	public void user_fill_the_details() throws IOException {
	   ci.fillDetails(); 
	}

	@Then("display the captured error message")
	public void display_the_captured_error_message() {
	   ci.captureErrorMsg(); 
	}
}
