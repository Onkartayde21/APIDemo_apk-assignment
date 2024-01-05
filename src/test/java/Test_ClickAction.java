import io.appium.java_client.AppiumBy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_ClickAction extends StartupTest {
    @Test
    public void testClickAction() {
        new Setup(driver).clickAccessi_bility();
        Assert.assertEquals(driver.findElement(new AppiumBy.ByAccessibilityId("Accessibility Node Provider")).getText(), "Accessibility Node Provider");
    }
}
