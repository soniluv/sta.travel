package org.qatest.statravel.utils;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.qatest.statravel.pages.BasePage;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserFactory extends BasePage{
    public static void startBrowser(){
        if(AutomationConstants.remoteDriver==true){
            DesiredCapabilities caps = DesiredCapabilities.firefox();
            caps.setCapability("platform", "Window 10");
            caps.setCapability("version","60.0");
            try {
                driver= new RemoteWebDriver(new URL("https://KrishnaPatel:fd91bd8b-eb7b-49ac-8818-37d7a6572a95@ondemand.saucelabs.com:80/wd/hub"),caps);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
        else {
            if(AutomationConstants.browserType.equalsIgnoreCase("chrome")){
                System.setProperty("webdriver.chrome.driver","src\\main\\resources\\chromedriver.exe");
                driver = new ChromeDriver();
            }
            else if(AutomationConstants.browserType.equalsIgnoreCase("firefox")){
                System.setProperty("webdriver.gecko.driver","src\\main\\resources\\geckodriver.exe");
            }
            else if(AutomationConstants.browserType.equalsIgnoreCase("IE")){
                System.setProperty("webdriver.ie.driver","src\\main\\resources\\MicrosoftWebDriver.exe");
            }
            driver.get(AutomationConstants.baseUrl);

        }
    }
}
