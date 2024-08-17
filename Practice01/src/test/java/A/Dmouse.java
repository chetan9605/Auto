package A;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dmouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			driver.get("https://www.ebay.com/");
			
			Actions a=new Actions(driver);
			
			WebElement Mouse = driver.findElement(By.xpath("(//a[text()='Electronics'])[2]"));
			
			a.moveToElement(Mouse).perform();
			
			driver.findElement(By.xpath("//a[text()='Apple']")).click();
	}

}
