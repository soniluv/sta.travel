package org.qatest.statravel;



import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/org/qatest/statravel/features", plugin = {"pretty", "html:target/cucumber-reports","json:target/sta.json"})
public class RunTest {
}
