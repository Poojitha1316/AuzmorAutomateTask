package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.TestBaseClass;

public class CoursePage extends TestBaseClass {
    @FindBy(xpath = "//*[@data-testid='price-tag']")
    WebElement selectcourse;
    @FindBy(xpath = "//*[text()='Buy Now for']")
    WebElement click_buynow;
    @FindBy(xpath = "//*[text()='Checkout']")
    WebElement click_checkout;

    public CoursePage(){
        PageFactory.initElements(driver,this);
    }

    public void select_course(){
        selectcourse.click();
        click_buynow.click();
        click_checkout.click();
    }
}
