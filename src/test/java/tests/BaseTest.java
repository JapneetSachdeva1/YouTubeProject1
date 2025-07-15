package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.Configuration;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseTest
{
    WebDriver driver;
    private static final String SELENIUM_HUB_URL = "http://localhost:4441/wd/hub";
    @BeforeMethod
    public void setup()
    {
        if(Configuration.platform.equalsIgnoreCase("local")) {
            if (Configuration.browserName.equalsIgnoreCase("chrome"))
            {
                driver = new ChromeDriver();
            }
            else if(Configuration.browserName.equalsIgnoreCase("firefox"))
            {
                driver = new FirefoxDriver();
            }

            else{
                System.out.println("Browser not supported!!!!");
            }

        }

        else if(Configuration.platform.equalsIgnoreCase("docker")) {
            if (Configuration.browserName.equalsIgnoreCase("chrome")) {
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--disable-dev-shm_usage");
                try {
                    driver = new RemoteWebDriver(new URL(SELENIUM_HUB_URL), chromeOptions);
                } catch (MalformedURLException e) {
                    throw new RuntimeException(e);
                }
            }

           else if (Configuration.browserName.equalsIgnoreCase("firefox")) {
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.addArguments("--disable-dev-shm_usage");
                try {
                    driver = new RemoteWebDriver(new URL(SELENIUM_HUB_URL), firefoxOptions);
                } catch (MalformedURLException e) {
                    throw new RuntimeException(e);
                }
            }

            else{
                System.out.println("Browser not supported!!!!");
            }
        }
        else {
            System.out.println("Platform not supported!!!");
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown()
    {

    }
}
