package co.com.screenplay.project.stepdefinitions.hook;

import co.com.screenplay.project.hook.Subscription;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import org.hamcrest.Matchers;

import static co.com.screenplay.project.helper.Constants.TIME_SHORT;
import static co.com.screenplay.project.helper.Constants.TITLE;
import static co.com.screenplay.project.helper.Waits.waiting;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Hook {

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("The {string} is in the package subscription section")
    public void theUserIsInThePackageSubscriptionSection(String actor) {
        OnStage.theActorCalled(actor).attemptsTo(
                Subscription.browserURL()
        );
        waiting(TIME_SHORT);
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                        TheWebPage.title(),
                        Matchers.containsString(TITLE)
                )
        );

    }
}
