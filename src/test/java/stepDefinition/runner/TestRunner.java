package stepDefinition.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(


        plugin = {"pretty", "html:target/site/cucumber-pretty.html"},

        snippets = CucumberOptions.SnippetType.CAMELCASE,

        glue = {"stepDefinition"},

        features = {"src/test/resources/features"},

        tags = "@login",

        dryRun = false,

        monochrome = true

)


public class TestRunner {


}
