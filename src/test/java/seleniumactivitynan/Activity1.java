package seleniumactivitynan;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Activity1 {
	
	
	 public static void main(String[] args) { 
		 File file = new File("./src/main/resources/chromedriver.exe");
			String filePath = file.getAbsolutePath();
			System.out.println(filePath);
			System.setProperty("webdriver.chrome.driver", filePath);
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("start-maximized");
			WebDriver driver =  new ChromeDriver(chromeOptions);
			driver.navigate().to( "http://demo.guru99.com/test/newtours/register.php");
			
			Select drpCountry = new Select(driver.findElement(By.name("country")));
			drpCountry.selectByVisibleText("AUSTRALIA");

			//Selecting Items in a Multiple SELECT elements
			/*driver.get("http://jsbin.com/osebed/2");
			Select fruits = new Select(driver.findElement(By.id("fruits")));
			fruits.selectByVisibleText("Banana");
			fruits.selectByIndex(1);*/
	 }
	}


	


