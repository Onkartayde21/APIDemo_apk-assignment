import org.testng.annotations.Test;

public class Test_Swiping extends StartupTest {

    @Test
    public void testSwiping() {
        // Navigate to Graphics , Vertices , Swipe right on the photo and then swipe left

        new Setup(driver).clickGraphics()
                .clickVertices();

    }
}
