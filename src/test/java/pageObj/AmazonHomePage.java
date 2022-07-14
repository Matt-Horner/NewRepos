package pageObj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonHomePage extends BasePage{

    public AmazonHomePage(WebDriver driver) {
        super(driver);
    }
    public void navigateToAmazon(){
        driver.get("https://www.amazon.com/");
    }

    public WebElement getLogo(){
        return driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
    }

    public WebElement getDeliveryTo(){
        return driver.findElement(By.xpath("//div[@id='glow-ingress-block']"));
    }

    public WebElement getSearchField(){
        return driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
    }

    public WebElement getSearchImageBtn(){
        return driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
    }

}
