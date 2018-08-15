package testcases;

import browserStack.browserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import webpages.homePageElements;

import java.io.IOException;

public class homePageTest{

    public static WebDriver driver;



    @Test
    public void loginTest() throws IOException, InterruptedException {
        WebDriver driver = browserFactory.browserSetup("firefox", "https://learn.letskodeit.com/");
        homePageElements hpe = PageFactory.initElements(driver, homePageElements.class);
        hpe.login();
    }
}
