package marathon;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class PvrCinemas {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		//String Moviename ="MAAREESAN";
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		//Added an implicit wait to ensure the webpage elements are fully loaded 
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.findElement(By.xpath("(//h6[@class='cities-name pointer'])[6]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//span[contains(text(),'Cinema')])[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Select Cinema')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'PVR Sathyam Royapettah Chennai')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Tomorrow')]")).click();
		//used for each to select movie name from list of movies list
		Thread.sleep(2000);
		List<WebElement> movienames = driver.findElements(By.className("p-dropdown-item"));
		
		for(WebElement moviename:movienames) {
			String movie = moviename.getText();
			if(movie.equalsIgnoreCase("MAAREESAN")) {
				moviename.click();
			}			 
		}		
		Thread.sleep(2000);
		//time selecting
		driver.findElement(By.xpath("//span[contains(text(),'10:20 PM')]")).click();	
		driver.findElement(By.xpath("//button[@aria-label='Submit']")).click();
		//to accept terms and conditions
		driver.findElement(By.xpath("//button[@class='sc-dkBYrC cNsERm reject-terms']")).click();
		Thread.sleep(3000);
		//seat booking
		driver.findElement(By.xpath("//span[@id='PR.PREMIUM|M:10']")).click();
		//to print seat info
		System.out.println("seat info:"+ driver.findElement(By.className("seat-number")).getText());
		//to print price
		System.out.println("price:"+ driver.findElement(By.className("grand-prices")).getText());
		driver.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click();
	//	System.out.println(driver.findElement(By.className("grand-tota col-md-3")).getText());
		
		driver.findElement(By.className("fb-added-btndesk")).click();
		driver.findElement(By.xpath("(//div[@class='cross-icon mx-2'])[2]")).click();
		System.out.println("Title Name :" + driver.getTitle());
		
	//	System.out.println(driver.findElement(By.className("grand-tota col-md-3")).getText());
		
		
		
		
	}

}
