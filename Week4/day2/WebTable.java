package week4.day2;

import java.time.Duration;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTable {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://leafground.com/table.xhtml");
		driver.manage().window().maximize();
		// added implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        List<WebElement> coloumn = driver.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr/td[2]"));
	    
        System.out.println("Country names are : ");
        for(int i= 0;i<coloumn.size();i++) {
	    	String countryname = coloumn.get(i).getText();
	    	System.out.println(countryname);
        }
        
	
	}

}
