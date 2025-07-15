package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MyAccountPage;

public class E2ETest extends BaseTest
{
    LoginPage loginPage;
    MyAccountPage myAccountPage;
    @Test
    public void e2e_test() {
        loginPage = new LoginPage(driver);
        driver.get("https://practicesoftwaretesting.com/auth/login");
        myAccountPage = loginPage.loginUser();
        myAccountPage.clickItem();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
