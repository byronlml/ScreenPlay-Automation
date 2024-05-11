package co.com.screenplay.project.tasks;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.util.EnvironmentVariables;

import static co.com.screenplay.project.helper.Constants.TIME_SHORT;
import static co.com.screenplay.project.ui.SubscriptionInformationCompanyUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

@Slf4j
@AllArgsConstructor
public class SubscriptionInformationCompanyTask implements Task {

    private static EnvironmentVariables environmentVariables;

    private String companyName;
    private String country;
    private String state;
    private String city;


    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Enter.theValue(companyName).into(CUSTOMER_NAME_ELEMENT),
                Click.on(FISCAL_MONTH_ELEMENT),
                Click.on(MONTH_ELEMENT),
                Click.on(ACCOUNTING_SOFTWARE_ELEMENT),
                Click.on(SOFTWARE_ELEMENT),
                Enter.theValue(country).into(COUNTRY_ELEMENT),
                WaitUntil.the(STATE_ELEMENT, isVisible())
                                .forNoMoreThan(TIME_SHORT).seconds(),
                Click.on(STATE_ELEMENT),
                Enter.theValue(state).into(STATE_ELEMENT),
                Enter.theValue(city).into(CITY_ELEMENT),
                Click.on(READ_AGREED_ELEMENT)
        );
    }

    public static SubscriptionInformationCompanyTask customer(String companyName, String country, String state, String city){
        return Tasks.instrumented(SubscriptionInformationCompanyTask.class, companyName, country, state, city);
    }
}
