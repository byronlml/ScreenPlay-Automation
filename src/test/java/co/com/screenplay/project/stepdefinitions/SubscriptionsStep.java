package co.com.screenplay.project.stepdefinitions;


import co.com.screenplay.project.tasks.*;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.util.EnvironmentVariables;


import static co.com.screenplay.project.helper.Constants.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class SubscriptionsStep {

    private static EnvironmentVariables environmentVariables;
    private String company_name;
    private String company_country;
    private String company_city;
    private String company_state;


    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }


    @When("Select the Free trial package")
    public void selectTheFreeTrialPackage() {
        theActorCalled(ACTOR).attemptsTo(FuntionSelectSubscriptionTask.choose());

    }
    //Option 1 to use the data
    @When("Fill in the basic information {string}, {string}, {string}, {string}")
    public void fillInTheBasicInformation(String firstname, String lastname, String email, String phone ) {
        theActorCalled(ACTOR).attemptsTo(
                SubscriptionBasicInformationTask.basic(
                        firstname,lastname, email, phone));

    }

    @When("Click on next button")
    public void clickOnNextButton() {
        theActorCalled(ACTOR).attemptsTo(FuntionNextSubscriptionTask.select());
    }
    //Option 2 to use the data
    @When("Fill in the company information")
    public void fillInTheCompanyInformation() {
        company_name = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(COMPANY_NAME);
        company_country = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(COUNTRY_NAME);
        company_city = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(CITY_NAME);
        company_state = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(STATE_NAME);
        theActorCalled(ACTOR).attemptsTo(
                SubscriptionInformationCompanyTask.customer(
                        company_name, company_country, company_city, company_state));

    }

    @When("Click on second next button")
    public void clickOnNextSecondButton() {
        theActorCalled(ACTOR).attemptsTo(FuntionNextCompanySubscriptionTask.next());
    }

    @Then("Should display the message satisfactory")
    public void shouldDisplayTheMessageSatisfactory() {
        theActorCalled(ACTOR).attemptsTo(FuntionSuccessfullySubscriptionTask.success());

    }


}
