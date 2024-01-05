import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Checkbox extends StartupTest {
    @Test
    public void testCheckBox() {
        // Navigate to Access'ibility , Accessibility Node Querying , click on any checkbox and validate that the checkbox is checked
        new Setup(driver).clickAccessi_bility()
                .enterAccessibility_Node_Querying()
                .clickCheckBox();
        Assert.assertTrue(driver.findElement(By.xpath("(//android.widget.CheckBox[@resource-id=\"io.appium.android.apis:id/tasklist_finished\"])[5]")).isEnabled());
    }
}
