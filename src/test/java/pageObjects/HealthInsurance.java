package pageObjects;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testbase.BaseClass;
public class HealthInsurance extends BasePage{
	public HealthInsurance(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="(//i[@class='arrow'])[1]")
	WebElement insProducts;
	@FindBy(xpath="(//div[@class='ruby-col-3 hidden-md'])[2]//ul//li")
	List<WebElement> menuItems;


	public void displayMenuItems() throws InterruptedException, IOException {
		
		insProducts.click();
		Thread.sleep(5000);
		System.out.println("     ***** List Of Health Insurance *****");
		int row=1;
		for(WebElement menu: menuItems ) {
			System.out.println("     "+menu.getText());
		}
		System.out.println("------------------------------------------------------------------");

		for(WebElement menu1: menuItems ) {
			BaseClass.xlutil.setCellData("Sheet2",0,9,"Health Insurance Menu");
			BaseClass.xlutil.setCellData("Sheet2",row,9,menu1.getText());
			row++;
		}

	}
}