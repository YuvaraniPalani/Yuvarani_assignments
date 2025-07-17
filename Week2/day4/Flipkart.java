package Week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Flipkart {

	public static void main(String[] args) {
		
	ChromeOptions options = new ChromeOptions();
	options.addArguments("guest");
	ChromeDriver driver = new ChromeDriver(options);
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	//driver.findElement(By.xpath("(//a[@title='Login'])[1])")).click();
	driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("Mens shirt");
	
	driver.findElement(By.xpath("(//div[@class='hCKiGj'])[2]")).click();
	}

}
