import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Scrolling extends StartupTest {

    @Test
    public void testScrolling() {
        // Navigate to Graphics , scaleToFit and click on it and check If it's scrolled and clicked or not

        new Setup(driver)
                .clickGraphics()
                .enterScaleToFit();
        Assert.assertEquals(driver.findElement(By.xpath("//android.widget.TextView[@text=\"Graphics/ScaleToFit\"]")).getText(),"Graphics/ScaleToFit");
    }
}
