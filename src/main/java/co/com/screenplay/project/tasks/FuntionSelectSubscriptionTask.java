package co.com.screenplay.project.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.screenplay.project.helper.Constants.TIME_SHORT;
import static co.com.screenplay.project.ui.SubscriptionBasicInformationUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class FuntionSelectSubscriptionTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Scroll.to(START_NOW_ELEMENT));
        actor.attemptsTo(WaitUntil.the(START_NOW_ELEMENT, isEnabled())
                        .forNoMoreThan(TIME_SHORT).seconds(),
                Click.on(START_NOW_ELEMENT));
    }

    public static FuntionSelectSubscriptionTask choose(){
        return Tasks.instrumented(FuntionSelectSubscriptionTask.class);
    }
}
