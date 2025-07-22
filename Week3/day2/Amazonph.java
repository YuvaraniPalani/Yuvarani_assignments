package Week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazonph {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.className("a-button-text")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones");
		Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
		List<WebElement> pricelist = driver.findElements(By.className("a-price-whole"));
		List<Integer> numlist = new ArrayList<>();
		for(int i=0;i<pricelist.size();i++) {
			String values = pricelist.get(i).getText().replace(",", "");
			//System.out.println(values);
				
			if (!values.isEmpty()) {
				int price = Integer.parseInt(values);
                numlist.add(price);
			}
			
			
		
		}
		Collections.sort(numlist);
		System.out.println(numlist);
		System.out.println("Lowest price is: " +numlist.get(0));
	}

}
