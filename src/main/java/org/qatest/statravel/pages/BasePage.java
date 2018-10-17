package org.qatest.statravel.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.qatest.statravel.utils.AutomationConstants;

import java.util.concurrent.TimeUnit;

public class BasePage {

    public static WebDriver driver;


    public BasePage(){
        PageFactory.initElements(driver, this);
    }

    public static void maximizeBrowser(){
        driver.manage().window().maximize();
    }
    public static void acceptCookies(){
       WebElement cookie= driver.findElement(By.id("sta-cookie-save-all-button"));
       if(cookie.isDisplayed()){
           cookie.click();
       }
    }
    public static void waitFor(){
        driver.manage().timeouts().pageLoadTimeout(AutomationConstants.timeOut, TimeUnit.SECONDS);
    }


    public static void closeBrowser(){
        if(driver!=null){
            driver.close();
            driver.quit();
        }
    }
}
