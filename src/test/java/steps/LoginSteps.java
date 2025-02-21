package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.title;

public class LoginSteps {

     LoginPage login = new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        login.openLoginPage();
    }
    @When("user enters username")
    public void user_enters_username() {
        login.enterUsername("standard_user");
    }
    @When("user enters password")
    public void user_enters_password() {
        login.enterPassword("secret_sauce");
    }
    @When("clicks on login button")
    public void clicks_on_login_button() {
        login.ClickOnLoginButton();
    }
    @Then("user should be redirected to the homepage")
    public void user_should_be_redirected_to_the_homepage() throws InterruptedException {
        Thread.sleep(5000);
        String pageTitle = title();
        System.out.println("Title of the Page is " + pageTitle);
        Assert.assertEquals(pageTitle, "Swag Labs");
    }

}
