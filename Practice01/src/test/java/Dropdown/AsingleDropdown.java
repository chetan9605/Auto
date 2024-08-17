package Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AsingleDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
			
			WebElement SingleDrop = driver.findElement(By.id("course"));
			
			Select s=new Select(SingleDrop);
			
			Thread.sleep(3000);

			
			s.selectByIndex(1);
			
			Thread.sleep(3000);
			
			s.selectByValue("net");
			
			Thread.sleep(3000);

			
			s.selectByVisibleText("Javascript");
			
			
			System.out.println("pass");
			

	}

}
