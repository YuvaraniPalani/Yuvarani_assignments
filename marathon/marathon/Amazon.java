package marathon;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://www.amazon.in/");
		driver.manage().window().maximize();
		//Added an implicit wait to ensure the webpage elements are fully loaded 
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.findElement(By.className("a-button-text")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bags for boys");
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	    String resultsText = driver.findElement(By.xpath("//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']")).getText();
	    System.out.println(resultsText);
//      String[] splitted = resultsText.split("over ");
//	    String num = splitted[1];	 
//	    String[] splitted1 = num.split(" results");
//	    String result = splitted1[0];
//	    System.out.println(result);
	    driver.findElement(By.xpath("//span[@class='a-size-base a-color-base' and contains(text(),'Safari')]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//span[@class='a-size-base a-color-base' and contains(text(),'Skybags')]")).click();
	   
	    driver.findElement(By.className("a-dropdown-label")).click();
	    List<WebElement> sortoptions = driver.findElements(By.xpath("//li[@role='option']"));
	    for(WebElement options:sortoptions) {
	    	String sortop = options.getText();
	    	System.out.println(sortop);
	    	if(sortop.equalsIgnoreCase("Newest Arrivals")) {
	    		options.click();
	    	}
	    			 
		}
	    System.out.println("Name of the first product : "+ driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base'])[1]")).getText()); 
	    System.out.println("price : " +driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText());  
	    System.out.println(driver.getTitle());
	  
	}


}
