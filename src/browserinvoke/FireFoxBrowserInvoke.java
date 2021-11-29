package browserinvoke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowserInvoke {
	public static void main(String[] args) throws InterruptedException {
		
	
	
	System.setProperty("webdriver.gecko.driver","C:\\Users\\telkaraj\\Desktop\\AllData_18June\\Mydocs\\TechBodhi\\File\\Geckodriver\\geckodriver-v0.21.0-win64\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	Thread.sleep(5000);
	driver.close();


	}		
	

}
