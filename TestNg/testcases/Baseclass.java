package testcases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class Baseclass {

	public ChromeDriver driver;
	public String filename;
	
    @Parameters({"url","username","password"}) 
	@BeforeMethod
	public void before(String url,String username,String Password) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		driver = new ChromeDriver(options);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(Password);
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("crmsfa")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
	}

	@AfterMethod
	public void after() {
		driver.close();
	}
	//added dataprovider as it was common in both classes
	@DataProvider(name="fetchdata")
	public String[][] data() throws IOException {
		String[][] data = ReadExcel.readData(filename);
		return data;
	}

}
