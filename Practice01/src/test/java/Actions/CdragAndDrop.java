package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CdragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			driver.get("http://www.dhtmlgoodies.com/packages/dhtml-suite-for-applications/demos/demo-drag-drop-3.html");
			
			Actions a=new Actions(driver);
			
			WebElement Drag = driver.findElement(By.id("box3"));
			
			WebElement Drop = driver.findElement(By.id("box103"));
			
			a.dragAndDrop(Drag, Drop).perform();
			
			
	}

}
