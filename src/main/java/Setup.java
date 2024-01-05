import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Setup {
    WebDriver driver;

    public Setup(WebDriver driver)
    {
        this.driver = driver;
    }

    By access_ibility = AppiumBy.accessibilityId("Access'ibility");
    By app = AppiumBy.accessibilityId("App");
    By graphics = AppiumBy.accessibilityId("Graphics");
    By views = AppiumBy.accessibilityId("Views");


    public Accessi_BilityPage clickAccessi_bility(){
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(d -> driver.findElement(access_ibility).isDisplayed());
        driver.findElement(access_ibility).click();
        return new Accessi_BilityPage(driver);
    }

    public AppPage clickApp(){
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(d -> driver.findElement(app).isDisplayed());
        driver.findElement(app).click();
        return new AppPage(driver);
    }

    public GraphicsPage clickGraphics(){
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(d -> driver.findElement(graphics).isDisplayed());
        driver.findElement(graphics).click();
        return new GraphicsPage(driver);
    }
    public ViewsPage clickViews(){
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(d -> driver.findElement(views).isDisplayed());
        driver.findElement(views).click();
        return new ViewsPage(driver);
    }

}
