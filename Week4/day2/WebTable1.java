package week4.day2;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class WebTable1 {
	
	public static void main(String[] args) throws InterruptedException {
		//String fromStation = "MAS";
		//String toStation  = "MDU";
		ChromeOptions options = new ChromeOptions();
	//	options.addArguments("guest");
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		// added implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// //input[@id='txtStationFrom'] 
		// //table/tbody/tr/td/input[@id='txtStationTo']
		WebElement location = driver.findElement(By.xpath("//table/tbody/tr/td"));
	
		location.findElement(By.xpath("//input[@id='txtStationFrom']")).clear();
		location.findElement(By.xpath("//input[@id='txtStationFrom']")).sendKeys("MAS");
				
		location.findElement(By.xpath("//input[@id='txtStationTo']")).clear();
		location.findElement(By.xpath("//input[@id='txtStationTo']")).sendKeys("MDU");
		Thread.sleep(2000);
		
		location.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		List<WebElement> trainNames = driver.findElements(By.xpath("//table[contains(@class,'TrainListHeader ')]/tbody/tr/td[2]"));
		//here i have created set to maintain unique and duplicate values
		Set<String> unique= new HashSet<>();
		Set<String> dup= new HashSet<>();
		//System.out.println("Train names are : ");
		
        for(int i= 0;i<trainNames.size();i++) {
	    	String trainName = trainNames.get(i).getText();
	    	
	    	//System.out.println(trainName);
	    	if(!unique.add(trainName))
	    		//here i will checking whether the value 
	    		//which i'm going to store in a set is already present or not 
	    		//if it is present add that in duplicate set else i will add it in unique set itself   {
	    		dup.add(trainName);  		
	    	}   	
	    
    	System.out.println("unique : " + unique);
		System.out.println("dup : " + dup);
	}

}
