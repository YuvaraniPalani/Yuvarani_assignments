package Week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.className("crmsfa")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//li[@id='ext-gen240__ext-gen254']")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("98127");
		driver.findElement(By.id("ext-gen334")).click();
		Thread.sleep(1000);
	    String id = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']")).getText(); 
	    System.out.println(id);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']")).click();
		driver.findElement(By.linkText(id)).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.name("id")).sendKeys(id);
		driver.findElement(By.id("ext-gen334")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.id("ext-gen437")).getText());
		System.out.println(id+ " is deleted");
		
		
	}

}
