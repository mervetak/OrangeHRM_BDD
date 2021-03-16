package stepDefinition;

import com.OrangeHRM.base.ConfigReader;
import com.OrangeHRM.pages.HomePage;
import com.OrangeHRM.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginPageSD {

    @Given("I am on OrangeHRM login page")
    public void verifyTitleTest() {
        Assert.assertEquals("OrangeHRM", LoginPage.verifyTitle());
    }

    @When("I enter Admin into username field on the login page")
    public void enterValidUsername(){
        LoginPage.enterUserName(ConfigReader.getProperty("username"));
    }


    @And("I enter admin123 into password field on the login page")
    public void enterValidPassword() {
        LoginPage.enterPassword(ConfigReader.getProperty("password"));
    }

    @And("I click on login button on login page")
    public void clickOnLogin() {
        LoginPage.clickLoginBtn();
    }

    @Then("I verify valid login message on sign in page")
    public void verifyHomePageTitle() {
        Assert.assertEquals("OrangeHRM", HomePage.verifyTitle());
    }


    @When("I enter incorrect username into username field on the login page")
    public void enterInvalidUsername(){
    LoginPage.enterUserName(ConfigReader.getProperty("invalidusername"));
    }

    @And("I enter incorrect password into password field on the login page")
    public void enterInvalidPassword(){
    LoginPage.enterPassword(ConfigReader.getProperty("invalidpassword"));
    }

    @Then("I see the error message on the login page")
    public void verifyErrorMessage(){
    Assert.assertEquals("Invalid credentials", LoginPage.getErrorMessage());
    }
}
