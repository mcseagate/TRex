package browserStack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class browserFactory {
    public static WebDriver driver;



    public static WebDriver browserSetup(String browserName, String url) throws IOException {

        Properties prop = new Properties();
        FileInputStream ip = new FileInputStream("/Users/mcseagate/IdeaProjects/TRex/src/test/java/util.properties");
        prop.load(ip);


        if(browserName.equalsIgnoreCase("Firefox")){
            System.setProperty("webdriver.gecko.driver" , "/Users/mcseagate/Documents/geckodriver");
            driver = new FirefoxDriver();
        }

        else if(browserName.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver", "/Users/mcseagate/Documents/chromedriver");
            driver = new ChromeDriver();
        }

        else if(browserName.equalsIgnoreCase("IE")){
            driver = new InternetExplorerDriver();
        }

        else{

            System.out.println("Browser Match Not Found");
        }


        driver.get(url);
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        String title = driver.getTitle();
        System.out.println(title);
        return driver;
    }

}
