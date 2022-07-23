package pageObj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RozetkaMainPage extends BasePage {

    public RozetkaMainPage(WebDriver driver) {
        super(driver);
    }
    //name Петро , secondname Петрович , email test57tin@gmail.com ,  pass RozetkaTest123

    public WebElement getSignIn(){
        return driver.findElement(By.xpath("//rz-user[@class='header-actions__component']"));
    }

    public WebElement getSignInEmailInput(){
        return driver.findElement(By.xpath("//input[@type='email']"));
    }

    public WebElement getSignInPasswordInput(){
        return driver.findElement(By.xpath("//input[@type='password']"));
    }

    public WebElement getSignInSubmitBtn(){
        return driver.findElement(By.xpath("//button[@class='button button--large button--green auth-modal__submit ng-star-inserted']"));
    }
}
