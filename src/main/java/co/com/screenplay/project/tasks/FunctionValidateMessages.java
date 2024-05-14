package co.com.screenplay.project.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.screenplay.project.helper.Constants.*;
import static co.com.screenplay.project.ui.SubscriptionBasicInformationUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class FunctionValidateMessages implements Task {

    private static final int MIN_NAME_LENGTH  = 1;
    private static final int MAX_NAME_LENGTH  = 50;

    @Override
    public <T extends Actor> void performAs(T actor) {

        String firstNameValidation = FIRST_NAME_ELEMENT.resolveFor(actor).getText();
        if (firstNameValidation.length() < MIN_NAME_LENGTH  || firstNameValidation.length() > MAX_NAME_LENGTH ) {
            actor.attemptsTo(WaitUntil.the(MESSAGE_VALIDATION_NAME_ELEMENT, isVisible())
                            .forNoMoreThan(TIME_SHORT).seconds(),
                    Ensure.that(MESSAGE_VALIDATION_NAME_ELEMENT).text().isEqualTo(VALIDATE_MESSAGE_NAME));
        }

    }

    public static FunctionValidateMessages validateMessages(){
        return Tasks.instrumented(FunctionValidateMessages.class);
    }
}
