package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Properties;

public class homePageElements {
    public WebDriver driver;
    Properties prop = new Properties();


    @FindBy(css="#navbar > div > div > div > ul > li:nth-child(2) > a")
    WebElement loginlink;


    @FindBy(id="user_email")
    WebElement usern;


    @FindBy(id="user_password")
    WebElement passw;

    @FindBy(name="commit")
    WebElement submitbtn;


    public void homePageElements(){
        PageFactory.initElements(driver, this);
    }

    public void login() throws InterruptedException {
        loginlink.click();
        Thread.sleep(4000);
        usern.sendKeys("menwoye@gmail.com");
        passw.sendKeys("gns10101");
        submitbtn.click();
    }

}
