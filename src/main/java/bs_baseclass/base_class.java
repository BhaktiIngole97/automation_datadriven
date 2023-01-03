package bs_baseclass;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class base_class {
	
	public ExtentReports extent = new ExtentReports();
	public ExtentSparkReporter spark = new ExtentSparkReporter("Extent_reports/ExtentReport.html");
	ExtentTest test;

	public static WebDriver driver;
	public static Properties prop;
	public static FileInputStream ip;

	public base_class() {
		try {
			prop = new Properties();

			FileInputStream ip = new FileInputStream(
					"C:\\Users\\Dell\\eclipse-workspace\\facebook_test\\src\\main\\java\\com\\fb\\qa\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();

		}

	}

	public void intialization() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("title of the web page: " + title);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public void takeScreenShot(String name) {
		TakesScreenshot takeScreenshot = (TakesScreenshot) driver;
		Date date = new Date();
		String currentDate = date.toString().replaceAll(":", "_");
		File file =takeScreenshot.getScreenshotAs(OutputType.FILE);
		File filesave = new File(".//fb_screenshot//" + currentDate + " " + name + ".png");
		try {
			FileHandler.copy(file, filesave);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
