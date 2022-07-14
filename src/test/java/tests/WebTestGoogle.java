package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.Keys;
import pageObj.GoogleHomePage;

public class WebTestGoogle extends TestInit{

    @Test
    public void RunGoogle(){
        goToGoogle();
        GoogleHomePage googleHomePage = new GoogleHomePage(driver);
        googleHomePage.getSearchField().sendKeys("warhammer");
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
    }
}
