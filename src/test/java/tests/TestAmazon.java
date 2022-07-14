package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObj.AmazonHomePage;
import pageObj.AmazonSearchResultsPage;

public class TestAmazon extends TestInit{

   @Test
    public void checkHeader(){
       AmazonHomePage amazonHomePage = new AmazonHomePage(driver);
       amazonHomePage.navigateToAmazon();

       amazonHomePage.getSearchField().sendKeys("hat");
       amazonHomePage.getSearchImageBtn().click();
       sleep(1);
       AmazonSearchResultsPage amazonSearchResultsPage = new AmazonSearchResultsPage(driver);
       Assert.assertTrue(amazonSearchResultsPage.getResultsField().isDisplayed());

   }

    @Test
    public void checkSearchPen(){
        AmazonHomePage amazonHomePage = new AmazonHomePage(driver);
        amazonHomePage.navigateToAmazon();

        amazonHomePage.getSearchField().sendKeys("pen");
        amazonHomePage.getSearchImageBtn().click();
        sleep(1);
        AmazonSearchResultsPage amazonSearchResultsPage = new AmazonSearchResultsPage(driver);
        Assert.assertTrue(amazonSearchResultsPage.getResultsField().isDisplayed());
        Assert.assertTrue(amazonSearchResultsPage.getElementsWithPen().size() > 10);

    }
}
