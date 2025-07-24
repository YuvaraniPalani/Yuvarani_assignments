package Week3.day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alert1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		//to click on button for alert popup
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt93']")).click();
		// switching focus to alert
		Alert alert = driver.switchTo().alert();
		//gettext from 
		System.out.println(alert.getText());
		alert.accept();
		

	}

}
