package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Mouse {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get(" https://www.amazon.in/");
		driver.manage().window().maximize();
		// added implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.className("a-button-text")).click();
		WebElement account = driver.findElement(By.xpath("//span[normalize-space()='Account & Lists']"));
		
		WebElement down = driver.findElement(By.xpath("//span[@class='navFooterBackToTopText']"));
		Actions a= new Actions(driver);	
		a.scrollToElement(down).click().build().perform();
	//	a.moveToElement(account).perform();
		
	}
}
