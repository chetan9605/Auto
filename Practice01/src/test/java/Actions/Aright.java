package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Aright {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demoqa.com/buttons");
		
		WebElement Right = driver.findElement(By.id("rightClickBtn"));
		
		Actions a=new Actions(driver);
		
		a.contextClick(Right).perform();
		
	
		
		
		

	}

}
