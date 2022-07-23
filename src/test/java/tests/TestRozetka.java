package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObj.*;

import java.time.Duration;
public class TestRozetka extends TestInit{

    @Test
    public void checkAuthorization(){
        RozetkaMainPage rozetkaMainPage = new RozetkaMainPage(driver);

        goToRozetka();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        rozetkaMainPage.getSignIn().click();
        rozetkaMainPage.getSignInEmailInput().sendKeys("test57tin@gmail.com");
        rozetkaMainPage.getSignInPasswordInput().sendKeys("RozetkaTest123");
        rozetkaMainPage.getSignInSubmitBtn().click();

    }
}
