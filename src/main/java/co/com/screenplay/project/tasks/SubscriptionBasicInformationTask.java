package co.com.screenplay.project.tasks;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.screenplay.project.ui.SubscriptionBasicInformationUI.*;

@Slf4j
@AllArgsConstructor
public class SubscriptionBasicInformationTask implements Task {

    private String firstName;
    private String lastName;
    private String email;
    private String numberPhone;

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Enter.theValue(firstName).into(FIRST_NAME_ELEMENT),
                Enter.theValue(lastName).into(LAST_NAME_ELEMENT),
                Enter.theValue(email).into(EMAIL_ELEMENT),
                Enter.theValue(numberPhone).into(PHONE_NUMBER_ELEMENT));
    }

    public static SubscriptionBasicInformationTask basic(String firstName, String lastName, String email, String numberPhone){
        return Tasks.instrumented(SubscriptionBasicInformationTask.class, firstName, lastName, email, numberPhone);
    }


}
