package pages;

import com.codeborne.selenide.Configuration;
import controls.LoginPageLocators;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class LoginPage implements LoginPageLocators
{

    public void openLoginPage()
    {
        Configuration.browser = "chrome";
        open("https://www.saucedemo.com/v1/");

    }

    public void enterUsername(String username)
    {
        usernameField.setValue(username);
    }

    public void enterPassword(String password)
    {
        passwordField.setValue(password);
    }

    public void ClickOnLoginButton()
    {
        loginButton.click();
    }




}
