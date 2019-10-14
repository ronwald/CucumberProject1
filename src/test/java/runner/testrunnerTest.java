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
		
		
	}

}
