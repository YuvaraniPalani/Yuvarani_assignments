package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		//added implicit wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Enter the username and password. 
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click on the Login button. 
		driver.findElement(By.className("decorativeSubmit")).click();
		// Click on the CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		// Click on the Contacts button.
		driver.findElement(By.linkText("Contacts")).click();
		// Click on Merge Contacts.
		driver.findElement(By.linkText("Merge Contacts")).click();
		
		// WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		// wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//img[@id='ext-gen614']"))));
		
		// Click on the widget of the "From Contact". 
		driver.findElement(By.xpath("//a[contains(@href,'partyIdFrom')]")).click();
		//wait till all the windows opened
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		Set<String> windows = driver.getWindowHandles();
        //collected all windowhandles in list
		List<String> windowhandle = new ArrayList<String>(windows);
		String parent = windowhandle.get(0);
		String child = windowhandle.get(1);
		driver.switchTo().window(child);//switch to child 
		//Click on the first resulting contact. 
		String firstcontact = driver.findElement(By.xpath("(//table[@class='x-grid3-row-table'])[1]")).getText();
		System.out.println("First contact from clicking contacts (from contact):" + firstcontact);
		System.out.println(driver.getTitle());
		driver.close();	
		
		driver.switchTo().window(parent);		
		System.out.println(driver.getTitle());
		
		//Click on the widget of the "To Contact". 
		driver.findElement(By.xpath("//a[contains(@href,'partyIdTo')]")).click();
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		Set<String> windows1 = driver.getWindowHandles();
		List<String> windowhandle1 = new ArrayList<String>(windows1);
		String parent1 = windowhandle1.get(0);
		String child1 = windowhandle1.get(1);
		driver.switchTo().window(child1);
		//Click on the second resulting contact.
		String secondcontact = driver.findElement(By.xpath("(//table[@class='x-grid3-row-table'])[2]")).getText();
		System.out.println("Second contact from clicking contacts (To contact):" + secondcontact);
		
		// By clicking on merge and accepting alert
		driver.switchTo().window(parent);
        driver.findElement(By.linkText("Merge")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        System.out.println(driver.getTitle());
	}

}
