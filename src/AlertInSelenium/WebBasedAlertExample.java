package AlertInSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebBasedAlertExample {
	
		
		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\telkaraj\\Desktop\\AllData_18June\\Mydocs\\TechBodhi\\File\\Chromedriver\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		    
		    driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
		    
		    driver.findElement(By.id("confirmBox")).click();
		    
		    Alert al = driver.switchTo().alert();	
		    System.out.println(al.getText());
		   // al.dismiss();
		    al.accept();
		    
	}

}
