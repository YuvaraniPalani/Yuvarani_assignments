package Week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Buttons {
	
	public static void main(String[] args) throws InterruptedException {
		String expected = "Dashboard";
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id ='j_idt88:j_idt90']")).click();
        String actual = driver.getTitle();
        
        if(actual.equals(expected))
        {
        	System.out.println("Verified :"+ actual );
        }
        driver.navigate().back();   
       
        boolean disabled = driver.findElement(By.id("j_idt88:j_idt92")).isEnabled();
        System.out.println("enabled:" +disabled);
       
		
	    Point position = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt94'] /span[@class='ui-button-text ui-c']")).getLocation();
		//xpath locator : parent to child traverse
	    System.out.println("The location of submit button: " +position);
	    //element.getCssValue("background-color"); used this syntax to get backround colour
	    String Color = driver.findElement(By.id("j_idt88:j_idt96")).getCssValue("background-color");
		System.out.println("Background color :"+ Color);
        Dimension heightandweidth = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt98']")).getSize();
        System.out.println("heightandweidth :"+ heightandweidth);
        
        
	}

}
