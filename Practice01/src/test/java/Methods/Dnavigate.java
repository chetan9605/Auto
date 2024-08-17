package Methods;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dnavigate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			driver.get("https://www.flipkart.com/");
			
			driver.navigate().to("https://www.amazon.in/");
			
			driver.navigate().back();
			
			driver.navigate().forward();
			
			driver.navigate().refresh();

	}

}
