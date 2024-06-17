package stepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/Login.feature", glue= {"stepDefinations"},
monochrome = true,
plugin = {"pretty","html:target/cucumber-report.html"})
public class TestRunner {

}
