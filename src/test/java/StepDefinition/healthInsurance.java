package StepDefinition;

import java.io.IOException;

import Factory.BaseClass;
import io.cucumber.java.en.When;
import pageObjects.CarInsurance;
import pageObjects.HealthInsurance;

public class healthInsurance extends BaseClass{

	@When("Display all Health Insurance menu items")
	public void display_all_health_insurance_menu_items() throws InterruptedException, IOException {
		hi=new HealthInsurance(BaseClass.getDriver());
		hi.displayMenuItems();
	}
}
