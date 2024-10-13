package salesforcerunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features= "src/main/java/salesforcefeatures/ActCreation.feature",glue="salesforcestepdefinition")
public class ActCreationRunner extends AbstractTestNGCucumberTests {

}
