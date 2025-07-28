package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Windows {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		//Added an implicit wait to ensure the webpage elements are fully loaded 
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	    driver.findElement(By.linkText("FLIGHTS")).click();
	    Set<String> windows = driver.getWindowHandles();
	    List<String> windowhandle= new ArrayList<String> (windows);
	    String parent = windowhandle.get(0);
	    String child = windowhandle.get(1);
	    driver.switchTo().window(child);
	    System.out.println(driver.getTitle());
	    driver.switchTo().window(parent);
	    driver.close();
	    
	}

}
