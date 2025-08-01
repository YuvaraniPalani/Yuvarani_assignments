package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonAction {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://www.amazon.in/");
		driver.manage().window().maximize();
		// Added an implicit wait to ensure the webpage elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.className("a-button-text")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro 5+g");
		WebElement searchButton = driver.findElement(By.xpath("//input[@type='submit']"));
		Actions a = new Actions(driver);
		a.moveToElement(searchButton).click().perform();
		String price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		System.out.println("price for first mobile is : " + price);
		WebElement star = driver.findElement(By.xpath("(//i[@data-cy='reviews-ratings-slot'])[1]"));
		a.moveToElement(star).click().perform();

		String ratings = driver.findElement(By.xpath("//span[@data-hook='total-review-count']")).getText();
		System.out.println("Number of customer ratings is : " + ratings);

		driver.findElement(By.xpath("(//a[contains(@class,'s-line-clamp-2 s-line-clamp-3-for-col-12')])[1]")).click();
		// Step1: Taking the Screenshot
		File sorurce = driver.getScreenshotAs(OutputType.FILE);

		// Step2: Setup the destination
		File destination = new File("./Screenshot/Mobile.png");

		// Step3: Store the screenshot file in the destination
		FileUtils.copyFile(sorurce, destination);

		driver.findElement(
				By.xpath("(//span[contains(@class,'a-button a-spacing-small a-button-primary a-button-icon')])[2]"))
				.click();
		String subtotal = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		if (price.equals(subtotal)) {
			System.out.println(subtotal + " is Verified");
		}
		driver.close();
		
	}

}
