package co.com.screenplay.project.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SubscriptionBasicInformationUI extends PageObject {

    //Basic Information
    public static final Target START_NOW_ELEMENT = Target.the("Start now").located(By.xpath("//button[@class=\"ant-btn btn-free-trial ant-btn-primary ant-btn-round ant-btn-lg\"]"));
    public static final Target FIRST_NAME_ELEMENT = Target.the("First name").located(By.id("name"));

    public static final Target LAST_NAME_ELEMENT = Target.the("last name").located(By.id("lastName"));

    public static final Target EMAIL_ELEMENT = Target.the("Email").located(By.id("email"));

    public static final Target SELECT_INDICATOR_NUMBER_ELEMENT = Target.the("Select indicator number").located(By.xpath("//div[@class=\"ant-form-item-control-input ng-tns-c61-23\"]//nz-select-arrow[@class=\"ant-select-arrow ng-tns-c84-39 ng-star-inserted\"]"));

    public static final Target PHONE_NUMBER_ELEMENT = Target.the("Phone Number").located(By.id("phone"));

    public static final Target NEXT_ELEMENT = Target.the("Next Button").located(By.xpath("//div[@class=\"ant-form-item-control-input ng-tns-c61-4\"]//button[@class=\"ant-btn ml-10 width-47 ng-tns-c61-4 ant-btn-primary ant-btn-round ant-btn-lg\"]"));


}
