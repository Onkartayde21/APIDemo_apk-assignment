import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ActivityPage {
    WebDriver driver;

    public ActivityPage(WebDriver driver)
    {
        this.driver = driver;
    }

    By customTitle = AppiumBy.accessibilityId("Custom Title");

    public CustomTitlePage clickCustomTitle(){
        driver.findElement(customTitle).click();
        return new CustomTitlePage(driver);
    }
}
