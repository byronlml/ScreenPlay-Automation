package co.com.screenplay.project.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "co.com.screenplay.project.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        //if you want to run all scenarios you can include tag or comment tag line SubscriptionOutline
        tags = "@SubscriptionMessage"
)
public class RunnerSubscription {
}
