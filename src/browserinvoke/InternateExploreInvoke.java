package browserinvoke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class InternateExploreInvoke {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.ie.driver","C:\\Users\\telkaraj\\Desktop\\AllData_18June\\Mydocs\\TechBodhi\\File\\IEDriver\\IEDriverServer_x64_3.12.0\\IEDriverServer.exe");
		//DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		//capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		//capabilities.setCapability("initialBrowserUrl", "https://my-page:9443");
		WebDriver driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		Thread.sleep(5000);
	    driver.quit();	
	}

}
