package stepDefination;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="OrrangeHRM",
				  glue="stepDefination",
				  monochrome=true,
				  tags= {
						  "@Sanity,@ApplicationFunctionalityWithTestData"
				  }
				  
				  )














public class TestRunner {

}
