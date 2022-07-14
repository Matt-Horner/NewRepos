package pageObj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AmazonSearchResultsPage extends BasePage{
    public AmazonSearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getResultsField(){
        return driver.findElement(By.xpath("//span[text()='RESULTS']"));
    }

    public List<WebElement> getElementsWithPen(){
        return driver.findElements(By.xpath("//*[contains(text(), 'pen')]"));
    }
}
