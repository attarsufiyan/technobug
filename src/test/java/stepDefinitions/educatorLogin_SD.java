package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObjects.educatorLogin_PO;
import utils.GenericUtils;
import utils.Variables;

public class educatorLogin_SD {

    Variables variables;

    public educatorLogin_SD(Variables variables) {
        this.variables = variables;
    }

    @Then("^educator will enter (.+) and (.+) and click on sigin button$")
    public void educator_will_enter_and_the_message_should_display(String email, String pwd) {
        educatorLogin_PO educatorlogin = variables.pageObjectManager.educatorLogin();
        educatorlogin.enterEmail(email);
        educatorlogin.enterpassword(pwd);
        educatorlogin.siginInButton();
    }

    @Then("^to educator (.+) message should display$")
    public void the_message_should_display(String expectedMessage) {
        // Wait for the message to be visible using the utility method
        GenericUtils.visibilityOfElementLocated(variables.driver, By.xpath("//div[@id='notistack-snackbar']"));

        // Get the message element and its text
        WebElement messageElement = variables.driver.findElement(By.cssSelector("#notistack-snackbar"));
        String actualMessage = messageElement.getText();

        // Assert the message
        Assert.assertEquals(expectedMessage, actualMessage);
        // variables.driver.quit(); -- Avoid quitting the driver prematurely
    }

    @Then("educator will click on siginbutton without entering credentials")
    public void educator_will_click_on_siginbutton_without_entering_credentials() {
        educatorLogin_PO educatorlogin = variables.pageObjectManager.educatorLogin();
        educatorlogin.siginInButton();
    }

    @Then("^educator will enter (.+) and click on sigin$")
    public void educator_will_enter_email_only(String email) {
        educatorLogin_PO educatorlogin = variables.pageObjectManager.educatorLogin();
        educatorlogin.enterEmail(email);
        educatorlogin.siginInButton();
    }
}
