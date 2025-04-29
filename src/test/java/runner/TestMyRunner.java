package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/resources/feature/Login.feature",
		glue= "stepDefinition",
		tags="@all",
		plugin= {"pretty",
				"html:target/CucumberReports/CucumberHTMLReport.html",
				"json:target/CucumberReport/CucumberJSONReport.json",
				"junit:target/CucumberReport/CucumberJUNITReport.xml"
		})

public class TestMyRunner {

}


//tags: This is used to run the customized scripts based on the tag we have given to the scenario.
// not@login- It run except login tests

// Hooks -> 2 hooks ...@after @before 
// Tagged Hooks @after("login")/ @before("login")
// @BeforeStep @AfterStep
// Tags: 2 types of tags: Default tags and custom tags. 
// Default tags : @dev, @ignore, @wip