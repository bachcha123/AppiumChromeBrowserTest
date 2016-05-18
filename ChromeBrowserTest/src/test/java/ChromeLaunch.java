import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ChromeLaunch {
	WebDriver driver;
	FireboxBrowserTest fbtest=new FireboxBrowserTest();
	@BeforeMethod
	public void setUp() throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("browserName", "Firefox");
	//	dc.setCapability("browserName", "Chrome");
		dc.setCapability("platformName", "Android");
		dc.setCapability("deviceName", "1215fc20ae852605");
		dc.setCapability("plateformVersion", "5.1.1");
	//	dc.setCapability("appPackage", "com.android.chrome");
		dc.setCapability("appPackage", "org.mozilla.firefox");
		
		// dc.setCapability("appActivity","com.google.android.apps.chrome.");
		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc);
		
		fbtest.testFirefox();
		
	}

	@Test
	public void chrome() {
		driver.get("http://www.yahoo.com");
	}

}
