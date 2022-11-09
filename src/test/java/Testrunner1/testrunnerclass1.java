package Testrunner1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		features = "src/test/java/Features1",
		glue = {"Step_Defenation1"},
				monochrome = true, //show the formatted output in console
				dryRun = false,
				
				plugin = {"pretty"}
		
		
		)
public class testrunnerclass1 {

}
