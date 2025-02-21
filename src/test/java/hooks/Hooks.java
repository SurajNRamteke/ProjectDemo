package hooks;
import com.codeborne.selenide.Configuration;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class Hooks {

    @Before
    public void setUp()
    {
        Configuration.browser = "chrome";
        open("https://www.saucedemo.com/v1/");
    }


    @After
    public void tearDown()
    {
        closeWebDriver();
    }

}
