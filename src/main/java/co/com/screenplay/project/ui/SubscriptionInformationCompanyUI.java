package co.com.screenplay.project.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class SubscriptionInformationCompanyUI extends PageObject {

    public static final Target CUSTOMER_NAME_ELEMENT = Target.the("Customer name").located(By.id("customerName"));

    public static final Target FISCAL_MONTH_ELEMENT = Target.the("fiscal month").located(By.id("fiscalMonth"));

    public static final Target MONTH_ELEMENT = Target.the("month").located(By.xpath("//*[@id=\"cdk-overlay-0\"]/nz-option-container/div/cdk-virtual-scroll-viewport/div[1]"));


    public static final Target ACCOUNTING_SOFTWARE_ELEMENT = Target.the("accounting software").located(By.id("accountingSoftware"));

    public static final Target SOFTWARE_ELEMENT = Target.the("accounting software click").located(By.xpath("(//cdk-virtual-scroll-viewport[contains(@class,'cdk-virtual-scroll-viewport cdk-virtual-scrollable')]//div)[1]"));

    public static final Target COUNTRY_ELEMENT = Target.the("country").located(By.id("countryId"));

    public static final Target STATE_ELEMENT = Target.the("state").located(By.id("stateId"));
    public static final Target CITY_ELEMENT = Target.the("city").located(By.id("city"));

    public static final Target CURRENCY_ELEMENT = Target.the("currency").located(By.id("currency"));

    public static final Target READ_AGREED_ELEMENT = Target.the("read and agreed").located(By.xpath("//span[@class=\"ant-checkbox\"]//input[@class=\"ant-checkbox-input ng-untouched ng-pristine ng-valid\"]"));

    public static final Target NEXT_BUTTON_ELEMENT = Target.the("next button company").located(By.xpath("//div[@class=\"ant-form-item-control-input ng-tns-c61-18\"]//button[@class=\"ant-btn width-47 btn-next ng-tns-c61-18 ant-btn-primary ant-btn-round ant-btn-lg\"]"));

    public static final Target SUCCESSFULLY_ELEMENT = Target.the("successfully message").located(By.xpath("//div[@class='ant-card-meta-title ng-star-inserted']"));


}
