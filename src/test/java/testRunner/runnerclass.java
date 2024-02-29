package testRunner;
 
import org.junit.runner.RunWith;
 
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		   features={".//Feature/1Travel.feature",".//Feature/2Car.feature",".//Feature/3Health.feature"},
		   glue = "StepDefinition" ,
		   plugin= {"pretty","html:reports/myreport.html", 
				   "rerun:target/rerun.txt",
				 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		   )
 

public class runnerclass {

}
