package pageObjects;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import testbase.BaseClass;

public class TravelInsurance extends BasePage {

	public TravelInsurance(WebDriver driver) {
		super(driver);
	}


	@FindBy(xpath="(//*[@class='shadowHandlerBox'])[7]")
	WebElement secTravel;

	@FindBy(xpath="//li[@class='countryButton']//p[contains(text(),'Germany')]")
	WebElement btnDestination;

	@FindBy(xpath="//div[@class='pqCtaWrapper']//button")
	WebElement btnNxt1;

	@FindBy(xpath="(//input[@placeholder='dd mmmm, yyyy'])[1]")
	WebElement date1;
	@FindBy(xpath="(//input[@placeholder='dd mmmm, yyyy'])[2]")
	WebElement date2;

	@FindBy(xpath="//*[contains(@class,'MuiPickersDateRangeDay-rangeIntervalPreview')]")
	List<WebElement> calender;

	@FindBy(xpath="//*[@class='pqCtaWrapper']/button")
	WebElement btnNxt2;

	@FindBy(xpath="//*[@id='traveller_2']//following::label")
	WebElement travellersCount;

	@FindBy(xpath="//div[contains(text(),'Select age of traveller 1')]")
	WebElement traveller1;

	@FindBy(xpath="//div[@class='options_box_wrapper__option']//input//following::label")
	List<WebElement> ageSelection1;

	@FindBy(xpath="//div[contains(text(),'Select age of traveller 2')]")
	WebElement traveller2;

	@FindBy(xpath="//div[@class='options_box_wrapper__option']//input//following::label")
	List<WebElement> ageSelection2;

	@FindBy(xpath="//button[contains(text(),'Next')][@class='travel_main_cta']")
	WebElement btnNxt3;

	@FindBy(xpath="//input[@id='ped_no']")
	WebElement medHistory;

	@FindBy(xpath="//input[@id='mobileNumber']")
	WebElement mobNo;

	@FindBy(xpath="//button[contains(text(),'View plans')]")
	WebElement btnPlan;

	@FindBy(xpath="//div[@class='exitIntentPopup__box ']")
	WebElement popup;

	@FindBy(xpath="//span[@class='exitIntentPopup__box__closePop']")
	WebElement closePopUp;

	@FindBy(id="studentTrip")
	WebElement planType;

	@FindBy(xpath="//label[contains(text(),'Traveller 1 (22 yrs)')]")
	WebElement ChecboxTraveller1;

	@FindBy(xpath="//label[contains(text(),'Traveller 2 (21 yrs)')]")
	WebElement ChecboxTraveller2;

	@FindBy(id="feet")
	WebElement drpdwnDuration;

	@FindBy(xpath="//button[contains(text(),'Apply')]")
	WebElement btnApply;

	@FindBy(xpath="//p[@class='filter_name_heading']")
	WebElement sort;

	@FindBy(xpath="(//li[@class='options_box_wrapper__option'])[2]")
	WebElement sortopt;

	@FindBy(xpath="(//p[@class='quotesCard--insurerName'])")
	List<WebElement> insurerName;

	@FindBy(xpath="(//span[@class='premiumPlanPrice'])")
	List<WebElement> planPrice;

	JavascriptExecutor js = (JavascriptExecutor)driver;

	String timestamp=new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
	String currentdate=timestamp.substring(6,8);


	public void clickTravelInsurance() {
		secTravel.click();
	}

	public void enterDestination() {
		btnDestination.click();
		BaseClass.explicitWait(driver,Duration.ofSeconds(30),btnNxt1);
		btnNxt1.click();
	}

	public void enterTripDate() throws InterruptedException {
		BaseClass.explicitWait(driver, Duration.ofSeconds(30), date1);
		date1.click();
		for(int i=0;i<calender.size();i++) {
			if(calender.get(i).getText().equals(currentdate)) {
				calender.get(i).click();
				break;
			}
		}
		BaseClass.explicitWait(driver,Duration.ofSeconds(30),date1);
		date1.click();
		BaseClass.explicitWait(driver,Duration.ofSeconds(30),date2);
		date2.click();
		for(int i=0;i<calender.size();i++) {
		if(calender.get(i).getText().equals(currentdate)) {
				calender.get(i+30).click();
				break;
			}
		}
		BaseClass.explicitWait(driver,Duration.ofSeconds(30),btnNxt2);
		btnNxt2.click();
	}

	public void enterTravellersDetail() throws IOException {
		BaseClass.explicitWait(driver,Duration.ofSeconds(30),travellersCount);
		travellersCount.click();
		traveller1.click();
		for(WebElement ele: ageSelection1) {
			if(ele.getText().equals(BaseClass.xlutil.getCellData("Sheet1", 0, 0))) {
				ele.click();
				break;
			}
		}
		traveller2.click();
		for(WebElement el: ageSelection2) {
			if(el.getText().equals(BaseClass.xlutil.getCellData("Sheet1", 1, 0))) {
				el.click();
				break;
			}
		}
		btnNxt3.click();
	}

	public void enterMedicalHistory() {
		medHistory.click();

	}

	public void enterContactDetails() throws IOException {

		BaseClass.explicitWait(driver,Duration.ofSeconds(30),mobNo);
		mobNo.sendKeys(BaseClass.xlutil.getCellData("Sheet1", 2, 0));
		btnPlan.click();
	}

	public void handlingPopup() {
		BaseClass.explicitWait(driver,Duration.ofSeconds(120),popup);
		popup.click();
		closePopUp.click();
	}

	public void typeOfPlan() throws InterruptedException {
		planType.click();
		BaseClass.explicitWait(driver,Duration.ofSeconds(50),ChecboxTraveller1);
		ChecboxTraveller1.click();
		BaseClass.explicitWait(driver,Duration.ofSeconds(50),ChecboxTraveller2);
		ChecboxTraveller2.click();
		Select select=new Select(drpdwnDuration);
		select.selectByVisibleText("30 Days");
		btnApply.click();
	}

	public void sortByPrice() throws InterruptedException {
		try {
			BaseClass.explicitWait(driver,Duration.ofSeconds(30),sort);
			sort.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", sort);
		}
		BaseClass.explicitWait(driver, Duration.ofSeconds(40), sortopt);
		sortopt.click();

	}

	public void displayTravelInsurance() throws InterruptedException, IOException {
		Thread.sleep(3000);

		System.out.println("     ***** Three Lowest International Travel Insurance Plan *****");
		for(int i=0;i<3;i++) {

			System.out.println("   Insurer_Name - "+(insurerName.get(i)).getText());
			System.out.println("   Amount       - "+(planPrice.get(i)).getText());
			System.out.println("------------------------------------------------------------------");
		}

		int row=1; for(int i=0;i<3;i++) { 
			BaseClass.xlutil.setCellData("Sheet2",0,0,"Insurance Provider Company");
			BaseClass.xlutil.setCellData("Sheet2",row,0,insurerName.get(i).getText()); 
			row++; 
		} 
		int r=1; for(int j=0;j<=2;j++) {
			BaseClass.xlutil.setCellData("Sheet2",0,5,"Insurance Provider Company Price"); 
			BaseClass.xlutil.setCellData("Sheet2",r,5,planPrice.get(j).getText()); 
			r++; 
		}
	}
}



