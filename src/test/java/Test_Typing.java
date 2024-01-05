import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Typing extends StartupTest {

    @Test
    public void testTyping() {
        // Navigate to APP ,activity , custom title , type "Appium" and check If the text written or not
        new Setup(driver).clickApp()
                .clickActivity()
                .clickCustomTitle()
                .clickTitle();
        Assert.assertEquals(driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Left is best\"]")).getText(), "Appium");
    }
}
