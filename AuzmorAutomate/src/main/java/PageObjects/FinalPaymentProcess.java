package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.TestBaseClass;

public class FinalPaymentProcess extends TestBaseClass {
    @FindBy(xpath = "//*[@id='line1']")
    WebElement enter_address;
    @FindBy(xpath = "//*[@id='city']")
    WebElement enter_city;
    @FindBy(xpath = "//*[@id='state']")
    WebElement enter_state;
    @FindBy(xpath = "//*[@id='postal_code']")
    WebElement enter_pin;

    @FindBy(xpath = "/html/body/div[4]/div/div/div[3]/div/div/div/div/form/fieldset[2]/div/div/div/iframe")
    WebElement i_Frame;
    @FindBy(xpath = "//*[@id='root']/form/div/div[2]/span[1]/span[2]/div/div[2]/span/input")
    WebElement enter_cardnumber;
    @FindBy(xpath = "//*[@id='root']/form/div/div[2]/span[2]/span[1]/span/span/input")
    WebElement enter_mmyy;
    @FindBy(xpath = "//*[@id='root']/form/div/div[2]/span[2]/span[2]/span/span/input")
    WebElement enter_cvc;
    @FindBy(xpath = "/html/body/div[4]/div/div/div[3]/div/div/div/div/form/button")
    WebElement click_pay;

    public FinalPaymentProcess()
    {
        PageFactory.initElements(driver,this);
    }
    public void PaymentFlow()
    {
        enter_address.clear();
        enter_address.sendKeys("Bommuru");
        enter_city.clear();
        enter_city.sendKeys("Rjy");
        enter_state.clear();
        enter_state.sendKeys("Andhra Pradesh");
        enter_pin.clear();
        enter_pin.sendKeys("122133");
        driver.switchTo().frame(i_Frame);
        enter_cardnumber.sendKeys("4242 4242 4242 4242");
        enter_mmyy.sendKeys("04/24");
        enter_cvc.sendKeys("123");
        driver.switchTo().defaultContent();
        click_pay.click();;
    }
}
