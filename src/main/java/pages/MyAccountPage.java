package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class MyAccountPage extends BasePage
{
    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    public void clickItem()
    {
       // driver.navigate().refresh();
        driver.findElement(By.xpath("//a[@data-test='nav-home']")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,100);");
    }
}
