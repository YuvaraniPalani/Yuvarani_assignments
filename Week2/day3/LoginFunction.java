package Week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginFunction {

	public static void main(String[] args) {
        ChromeOptions options = new  ChromeOptions();
        options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vineeth");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajendran");
		WebElement sourceElement = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select option = new Select(sourceElement);
		option.selectByValue("LEAD_EXISTCUST");
		driver.findElement(By.name("submitButton")).click();

	}

}
