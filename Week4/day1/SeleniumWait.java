package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWait {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml");
		driver.manage().window().maximize();
		//Added an implicit wait to ensure the webpage elements are fully loaded 
	    driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[4]")).click();
	    WebDriverWait wait = new   WebDriverWait(driver,Duration.ofSeconds(30));
	    Boolean opened = wait.until(ExpectedConditions.numberOfWindowsToBe(3));
	    System.out.println(opened);
	    Set<String> windows = driver.getWindowHandles();
	    List<String> windowhandle= new ArrayList<String> (windows);
	    String parent = windowhandle.get(0);
	    String child = windowhandle.get(1);
	    String child2 = windowhandle.get(2);
	    driver.switchTo().window(child);
	    System.out.println(driver.getTitle());
	    System.out.println("First name from webtable window : " + driver.findElement(By.xpath("(//td[@role='gridcell'])[1]")).getText());
	    driver.switchTo().window(child2);
	    System.out.println(driver.getTitle());
	    driver.quit();
	    
	    
	   

	}

}
