package org.qatest.statravel.stepDefs;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.qatest.statravel.pages.BasePage;
import org.qatest.statravel.utils.BrowserFactory;

import java.io.File;
import java.io.IOException;

import static org.qatest.statravel.utils.BrowserFactory.startBrowser;

public class Hooks extends BasePage {

    Scenario scenario;
    @Before
    public static void setUp(){
        startBrowser();
        waitFor();
        maximizeBrowser();
        acceptCookies();
    }

    @After
    public static void tearDown(Scenario scenario){
        scenario.write("Closing Scenario");
        if(scenario.isFailed()){
            File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(src, new File("C:\\work\\Screenshots"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
       closeBrowser();
    }
}
