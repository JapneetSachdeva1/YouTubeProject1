package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage
{
    public LoginPage(WebDriver driver)
    {
        super(driver);
    }

    //structural page object model
//    public void enterEmail(String userEmail)
//    {
//        driver.findElement(By.id("email")).sendKeys("customer3@practicesoftwaretesting.com");
//    }

    //functional page object model
    public MyAccountPage loginUser()
    {
        driver.findElement(By.id("email")).sendKeys("customer3@practicesoftwaretesting.com");
        driver.findElement(By.id("password")).sendKeys("pass123");
        driver.findElement(By.xpath("//input[@data-test='login-submit']")).click();
        return new MyAccountPage(driver); //fluent interface

    }

}
