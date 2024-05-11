package co.com.screenplay.project.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.screenplay.project.helper.Constants.TIME_SHORT;
import static co.com.screenplay.project.ui.SubscriptionBasicInformationUI.NEXT_ELEMENT;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class FuntionNextSubscriptionTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Scroll.to(NEXT_ELEMENT));
        actor.attemptsTo(WaitUntil.the(NEXT_ELEMENT, isEnabled())
                        .forNoMoreThan(TIME_SHORT).seconds(),
                Click.on(NEXT_ELEMENT));
    }

    public static FuntionNextSubscriptionTask select(){
        return Tasks.instrumented(FuntionNextSubscriptionTask.class);
    }
}
