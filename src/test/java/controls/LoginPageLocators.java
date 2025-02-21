package controls;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public interface LoginPageLocators
{

    public final  SelenideElement usernameField = $(By.xpath("//input[@id='user-name']"));
    public final SelenideElement passwordField = $(By.xpath("//input[@id='password']"));
    public final SelenideElement loginButton = $(By.xpath("//input[@id='login-button']"));





}
