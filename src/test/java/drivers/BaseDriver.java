package drivers;

import io.appium.java_client.android.AndroidDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;


public class BaseDriver {
    public AndroidDriver driver;
    @BeforeTest
    public void setDevice() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("appium:deviceName", "Pixel_8a_API_35");
        desiredCapabilities.setCapability("platformName", "android");
        desiredCapabilities.setCapability("appium:automationName", "Uiautomator2");
        desiredCapabilities.setCapability("appium:udid", "emulator-5554");
        desiredCapabilities.setCapability("appium:appPackage", "com.google.android.dialer");
        desiredCapabilities.setCapability("appium:appActivity", "com.google.android.dialer.extensions.GoogleDialtactsActivity");
        URL remoteUrl = new URL("http://127.0.0.1:4723");
        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
    }
    @Test
    public void test() throws InterruptedException {
        System.out.println("Hello");
        driver.findElement(By.xpath(
                "//android.widget.ImageButton[@content-desc=\"key pad\"]")).click();
        Thread.sleep(2000);
        //android.widget.FrameLayout[@content-desc="0"]
        driver.findElement(By.xpath(
                "//android.widget.FrameLayout[@content-desc=\"0\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(
                "//android.widget.TextView[@resource-id=\"com.google.android.dialer:id/dialpad_key_number\" and @text=\"1\"]\n")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(
                "//android.widget.TextView[@resource-id=\"com.google.android.dialer:id/dialpad_key_number\" and @text=\"6\"]\n")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(
                "//android.widget.TextView[@resource-id=\"com.google.android.dialer:id/dialpad_key_number\" and @text=\"2\"]\n")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(
                "//android.widget.TextView[@resource-id=\"com.google.android.dialer:id/dialpad_key_number\" and @text=\"8\"]\n")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(
                "//android.widget.TextView[@resource-id=\"com.google.android.dialer:id/dialpad_key_number\" and @text=\"9\"]\n")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(
                "//android.widget.TextView[@resource-id=\"com.google.android.dialer:id/dialpad_key_number\" and @text=\"4\"]\n")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(
                "//android.widget.TextView[@resource-id=\"com.google.android.dialer:id/dialpad_key_number\" and @text=\"2\"]\n")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(
                "//android.widget.TextView[@resource-id=\"com.google.android.dialer:id/dialpad_key_number\" and @text=\"0\"]\n")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(
                "//android.widget.TextView[@resource-id=\"com.google.android.dialer:id/dialpad_key_number\" and @text=\"9\"]\n")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(
                "//android.widget.TextView[@resource-id=\"com.google.android.dialer:id/dialpad_key_number\" and @text=\"1\"]\n")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(
                "//android.widget.Button[@content-desc=\"dial\"]")).click();
        Thread.sleep(5000);



    }

    }
