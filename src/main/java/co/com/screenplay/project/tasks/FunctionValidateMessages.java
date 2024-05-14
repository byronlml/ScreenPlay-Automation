package co.com.screenplay.project.tasks;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.screenplay.project.helper.Constants.*;
import static co.com.screenplay.project.ui.SubscriptionBasicInformationUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class FunctionValidateMessages implements Task {

    private static final int minLength = 1;
    private static final int maxLength = 50;

    //Enter.theValue(firstName).into(FIRST_NAME_ELEMENT)

    @Override
    public <T extends Actor> void performAs(T actor) {

        String firstNameValidation = FIRST_NAME_ELEMENT.resolveFor(actor).getText();
        if (firstNameValidation.length() < minLength || firstNameValidation.length() > maxLength) {
            actor.attemptsTo(WaitUntil.the(MESSAGE_VALIDATION_NAME_ELEMENT, isVisible())
                            .forNoMoreThan(TIME_SHORT).seconds(),
                    Ensure.that(MESSAGE_VALIDATION_NAME_ELEMENT).text().isEqualTo(VALIDATE_MESSAGE_NAME));
        }

    }

    public static FunctionValidateMessages validateMessages(){
        return Tasks.instrumented(FunctionValidateMessages.class);
    }
}
