package Test;

import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AmazonApp {
	AppiumDriver<MobileElement> driver;

	@BeforeTest
	public void setup() throws Exception {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Redmi Y2");
		cap.setCapability("platformName", "Android");
		cap.setCapability("udid", "3b264f1");
		cap.setCapability("platformVersion", "9.0.0");
		cap.setCapability("appPackage", "com.amazon.mShop.android.shopping");
		cap.setCapability("appActivity", "");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url, cap);
	}

	@AfterTest
	public void teardown() {
		driver.close();
		driver.quit();
	}
}
