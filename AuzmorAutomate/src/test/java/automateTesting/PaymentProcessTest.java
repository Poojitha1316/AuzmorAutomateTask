package automateTesting;

import PageObjects.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import testBase.TestBaseClass;

public class PaymentProcessTest extends TestBaseClass {
    @BeforeMethod
    public void payment() throws Exception {
        launchBrowserAndNavigate();
        LoginPage login = new LoginPage();
        login.PaymentLogin();
        HomePage home= new HomePage();
        home.Get_user();
        CoursePage course = new CoursePage();
        course.select_course();
        ConfirmPaymentProcess confirm = new ConfirmPaymentProcess();
        confirm.ConfirmProcessMethod();
        FinalPaymentProcess payment = new FinalPaymentProcess();
        payment.PaymentFlow();
    }
    @Test
    public void CoursePayment() {
        System.out.println(driver.getCurrentUrl());
    }

}
