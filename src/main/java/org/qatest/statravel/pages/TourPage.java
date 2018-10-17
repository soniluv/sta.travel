package org.qatest.statravel.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class TourPage extends BasePage {
    public TourPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[5]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[6]/form[1]/fieldset[1]/div[1]/div[1]/input[2]")
    private WebElement destinationBox;

    @FindBy(xpath = "//*[contains(@id,'ui-id')]")
    private List<WebElement> displayedDestinationOptions;

    @FindBy(xpath = "//p[@class='sta-contain']//button[@type='submit'][contains(text(),'Find A Tour')]")
    private WebElement findATourTab;

    @FindBy(id = "btnViewMore")
    private WebElement viewMoreTab;

    @FindBy(id = "sortSelect")
    private WebElement selectSortOrder;

    @FindBy(xpath = ".//*[@id='products']/div")
    private List<WebElement> totalTourResultsDisplayed;

    @FindBy(id = "lblTotalSearchResult")
    private WebElement displayedTextOfTotalResultsFound;


    public void selectDestination(String destination){
        destinationBox.sendKeys(destination);

        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int count =displayedDestinationOptions.size();
        List<WebElement> totalLinks = displayedDestinationOptions;
        System.out.println(count);
        for (WebElement links : totalLinks ){
            if(links.getText().equalsIgnoreCase("India")){
                links.click();
                break;
            }
        }
    }

    public void clickOnButton(String tabName){
        if(tabName.equalsIgnoreCase("Find A Tour")){
            findATourTab.click();}
        else if(tabName.equalsIgnoreCase("View More")){
            viewMoreTab.click();}
    }

    public void sortSearchOrder(){
        WebElement sort = selectSortOrder;
        Select select = new Select(sort);
        select.selectByVisibleText("Price (Low-High)");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void viewMoreResults(){
        List<WebElement> totalResultsDisplayed= totalTourResultsDisplayed;
        int countResultDisplayed= totalResultsDisplayed.size();
        System.out.println(countResultDisplayed);

        WebElement totalResultsFoundAfterMore = displayedTextOfTotalResultsFound;
        String value= totalResultsFoundAfterMore.getText();
        String value2 = "";
        int numberOfResultsFoundFromText;
        for(int i=0;i<value.length();i++){
            char charCheck = value.charAt(i);
            if(Character.isDigit(charCheck)){
                value2 = value2+charCheck;
            }
        }
        numberOfResultsFoundFromText = Integer.parseInt(value2);
        System.out.println(numberOfResultsFoundFromText);
        Assert.assertEquals(numberOfResultsFoundFromText,countResultDisplayed);
    }

}
