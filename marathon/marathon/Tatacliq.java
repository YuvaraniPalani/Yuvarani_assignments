package marathon.week2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Tatacliq {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.tatacliq.com/");
		driver.manage().window().maximize();
		// Added an implicit wait to ensure the webpage elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("moe-dontallow_button")).click();
		Actions a = new Actions(driver);
		WebElement brands = driver.findElement(By.xpath("(//div[@class='DesktopHeader__categoryAndBrand'])[2]"));
		a.moveToElement(brands).click().perform();
		driver.findElement(By.xpath("//div[contains(@aria-label,'Watches & Accessories')]")).click();
		driver.findElement(By.xpath("//div[@class='DesktopHeader__brandsDetails'][1]")).click();
		// New Arrivals
		WebElement sortbox = driver.findElement(By.className("SelectBoxDesktop__hideSelect"));
		Select sort = new Select(sortbox);
		sort.selectByVisibleText("New Arrivals");
		driver.findElement(By.xpath("(//div[@class='FilterDesktop__newFilName'])[1]")).click();
		Thread.sleep(3000);
		List<WebElement> pricelist = driver.findElements(By.className("ProductDescription__priceHolder"));
		String firstprice = pricelist.get(0).getText();
		System.out.println("Firstprice : " + firstprice);
		for (WebElement price : pricelist) {
			System.out.println(price.getText());
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='ProductModule__dummyDiv'])[1]")).click();
		Set<String> windows1 = driver.getWindowHandles();
		List<String> windowhandle1 = new ArrayList<String>(windows1);
		String parent1 = windowhandle1.get(0);
		String child1 = windowhandle1.get(1);
		driver.switchTo().window(child1);
		String priceofwatch = driver.findElement(By.xpath("//h3[contains(text(),'MRP:')]")).getText();
	    System.out.println(priceofwatch);
		if(priceofwatch.contains(firstprice)) {
			System.out.println("price matches successfully");
		}
		else {
			System.out.println("not match");
		}
		
		driver.findElement(By.xpath("//span[contains(text(),'ADD TO BAG')]")).click();
		String cartcount = driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).getText();
		System.out.println(cartcount);
		driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).click();
		Thread.sleep(1000);
		// Step1: Taking the Screenshot
		File sorurce = driver.getScreenshotAs(OutputType.FILE);

		// Step2: Setup the destination
		File destination = new File("./Screenshot/tatacliq.png");

		// Step3: Store the screenshot file in the destination
		FileUtils.copyFile(sorurce, destination);
		 Thread.sleep(1000);
		 driver.close();
		
	}

}
