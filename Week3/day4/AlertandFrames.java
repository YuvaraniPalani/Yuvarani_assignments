package Week3.day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertandFrames {

	public static void main(String[] args) {
		String name="Yuvarani";
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		//Added an implicit wait to ensure the webpage elements are fully loaded 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		// webelement for frame
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@name='iframeResult']"));
		//switching driver focus to frame by using Webelement from webpage
		driver.switchTo().frame(frameElement);
		
		// just to verify if there is anything before accepting the alert
		  System.out.println(driver.findElement(By.xpath("//p[@id='demo']")).getText());
		
		//to click on button for alert popup
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		// switching focus to alert from webpage
		Alert alert = driver.switchTo().alert();
		// sending values to alert
		alert.sendKeys(name);
		//accepting alert
		alert.accept();	
		//text to verify after accepting alert
		System.out.println(driver.findElement(By.xpath("//p[@id='demo']")).getText());
		String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		if(text.contains(name)) {
			System.out.println("verified the text ");
		}
		else{
			System.out.println("Text is not verified");
		}
		
	}


}
