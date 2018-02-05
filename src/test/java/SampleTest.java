import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Arsbatyrov on 2018-02-04.
 */
public class SampleTest {
    RemoteWebDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("deviceName","Android Emulator");
            capabilities.setCapability("platformName","Android");
            capabilities.setCapability("platformVersion", "6.0");
            capabilities.setCapability("app", "/Users/abatyrov/Documents/java_appium/junit_appium/ultimate_converter.apk");
            capabilities.setCapability("appPackage:","com.physphil.android.unitconverterultimate");
            capabilities.setCapability("appActivity:","com.physphil.android.unitconverterultimate.MainActivity");

            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @Test
    public void appTest() {
        this.driver.findElementById("android:id/button1").click();
//        Assert.assertEquals("Title should be Google", "Google", driver.getTitle());
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
