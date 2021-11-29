package radiobutton;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonExample {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\telkaraj\\Desktop\\AllData_18June\\Mydocs\\TechBodhi\\File\\Chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    driver.get("http://omayo.blogspot.com/");
	    
	  //  boolean CarRadioButtonSelected = driver.findElement(By.xpath("//input[@value='Car']")).isSelected();
		//System.out.println(CarRadioButtonSelected);
	    
	   boolean RadioButtonSelected = driver.findElement(By.xpath("//input[@value='Bike']")).isSelected();
	   System.out.println(RadioButtonSelected);
	   
	   
	   
	   if(RadioButtonSelected == false)
	   {
		   driver.findElement(By.xpath("//input[@value='Bike']")).click();
	   }
	   
	 //  boolean RadioButtonSelected = driver.findElement(By.xpath("//input[@value='Bike']")).isSelected();
	//   System.out.println(RadioButtonSelected);
	   //https://www.globalsqa.com/demo-site/select-elements/#Multiple%20Selection
	   //http://omayo.blogspot.com/
	   List<WebElement> RadioButtons=driver.findElements(By.name(("vehicle")));
	   
	   System.out.println(RadioButtons.size());
	   
	   driver.close();
	}

}
