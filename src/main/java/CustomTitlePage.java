import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomTitlePage {
    WebDriver driver;

    public CustomTitlePage(WebDriver driver)
    {
        this.driver = driver;
    }

    By box = By.xpath("//android.widget.EditText[@content-desc=\"Left is best\"]");
    By changeLeft = AppiumBy.accessibilityId("Change Left");

    public void clickTitle(){
        driver.findElement(box).clear();
        driver.findElement(box).sendKeys("Appium");
        driver.findElement(changeLeft).click();
    }
}
