package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.TestBaseClass;

public class ConfirmPaymentProcess extends TestBaseClass {
    @FindBy(xpath = "//*[@name='Contact Number']")
    WebElement enter_phonenumber;
    @FindBy(xpath = "//*[@data-testid='confirm-payment-btn']")
    WebElement click_proceed;
    @FindBy(xpath = "//*[@placeholder='Add zip code']")
    WebElement addzipcode;
    @FindBy(xpath = "//*[@placeholder='Add country']")
    WebElement addcountry;
    @FindBy(xpath = "//*[@name='City']")
    WebElement addcity;
    @FindBy(xpath = "//*[@placeholder='Add state']")
    WebElement addstate;
    @FindBy(xpath = "//*[@placeholder='20A St.Lawrence Toronto']")
    WebElement addaddress;
    @FindBy(xpath = "//*[@data-testid='payment-text']")
    WebElement click_checkout_process;

    public ConfirmPaymentProcess(){
        PageFactory.initElements(driver, this);
    }
    public void ConfirmProcessMethod(){
        enter_phonenumber.clear();
        enter_phonenumber.sendKeys("+91 9030950277");
        click_proceed.click();
        addzipcode.clear();
        addzipcode.sendKeys("533124");
        addcountry.clear();
        addcountry.sendKeys("India");
        addcity.clear();
        addcity.sendKeys("Rjy");
        addstate.clear();
        addstate.sendKeys("Andhra Pradesh");
        addaddress.clear();
        addaddress.sendKeys("Bommuru");
        click_checkout_process.click();
    }
}

//*[@placeholder='20A St.Lawrence Toronto']
//
//city <input class="FormRowInput" id="city" type="city" placeholder="Toronto" required="" value="">
//
//State <input class="FormRowInput" id="state" type="state" placeholder="MD" required="" value="">
//
//zip <input class="FormRowInput" id="postal_code" type="postal_code" placeholder="21201" required="" value="">
//
//card placeholder="Card number"
//
//mmyy placeholder="MM / YY"
//
//cvc placeholder="CVC"
//
//submit <button class="SubmitButton " type="submit">Pay $10</button>