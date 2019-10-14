package runner;

import java.io.File;

import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features"
		,glue = {"seleniumgluecode"}
		,plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"} 
		,monochrome = true
		
		
		)


public class testrunnerTest {
	
	public static void writeExtenReport() {
		Reporter.loadXMLConfig(new File("config/report.xml"));
		Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
		Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
		Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
	    Reporter.setSystemInfo("Selenium", "3.7.0");
	    Reporter.setSystemInfo("Maven", "3.5.2");
	    Reporter.setSystemInfo("Java Version", "1.8.0_151");
		
		
		
	}

}
