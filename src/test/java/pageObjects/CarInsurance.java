package pageObjects;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testbase.BaseClass;
public class CarInsurance extends BasePage{
	public CarInsurance(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="(//div[@class='shadowHandlerBox'])[4]")
	WebElement secCar;
	@FindBy(xpath="//a[@class='btn-proceed']")
	WebElement btnNewcar;
	@FindBy(xpath="//span[@id='spn1']")
	WebElement city;
	@FindBy(xpath="//span[text()='KA01']")
	WebElement rto;
	@FindBy(xpath="//span[@class='tata']")
	WebElement brand;
	@FindBy(xpath="//b[text()='ALTROZ']")
	WebElement model;
	@FindBy(id="Petrol")
	WebElement fuelType;
	@FindBy(xpath="//b[text()='XE Petrol (1199 cc)']")
	WebElement variant;
	@FindBy(id="name")
	WebElement name;
	@FindBy(id="email")
	WebElement email;
	@FindBy(xpath="//div[@class='msg-error show']")
	WebElement errorMsg;
	@FindBy(id="mobileNo")
	WebElement mobileNo;

	public void clickCarInsurance() {
		BaseClass.explicitWait(driver, Duration.ofSeconds(20), secCar);
		secCar.click();
	}

	public void carInsuranceQuote() {
		BaseClass.explicitWait(driver, Duration.ofSeconds(20), btnNewcar);
		btnNewcar.click();   
	}

	public void carCityAndRto(){
		city.click();
		rto.click();
	}

	public void carBrand() {
		brand.click();
	}

	public void carModel() {
		model.click();
	}

	public void carFuelType() {
		fuelType.click();
	}

	public void carVariant() {
		variant.click();
	}

	public void fillDetails() throws IOException {
		BaseClass.explicitWait(driver, Duration.ofSeconds(20), name);
		name.sendKeys(BaseClass.xlutil.getCellData("Sheet1", 3, 0));
		email.sendKeys(BaseClass.xlutil.getCellData("Sheet1", 4, 0));
		mobileNo.sendKeys(BaseClass.xlutil.getCellData("Sheet1", 2, 0));
	}
	public void captureErrorMsg() {
		System.out.println("     ***** Displaying Error Message *****");
		System.out.println("Captured error message: "+errorMsg.getText());
		System.out.println("------------------------------------------------------------------");

	}
}