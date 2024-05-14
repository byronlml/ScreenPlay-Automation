package co.com.screenplay.project.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.screenplay.project.helper.Constants.CONFIRMATION;
import static co.com.screenplay.project.helper.Constants.TIME_SHORT;
import static co.com.screenplay.project.helper.Waits.waiting;
import static co.com.screenplay.project.ui.SubscriptionInformationCompanyUI.SUCCESSFULLY_ELEMENT;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FunctionSuccessfullySubscriptionTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor){
        waiting(TIME_SHORT);
        actor.attemptsTo(WaitUntil.the(SUCCESSFULLY_ELEMENT, isVisible())
                        .forNoMoreThan(TIME_SHORT).seconds(),
                Ensure.that(SUCCESSFULLY_ELEMENT).text().isEqualTo(CONFIRMATION)
        );
    }

    public static FunctionSuccessfullySubscriptionTask success(){
        return Tasks.instrumented(FunctionSuccessfullySubscriptionTask.class);
    }
}
