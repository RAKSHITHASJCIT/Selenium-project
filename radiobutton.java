package seleniumTraning;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class radiobutton {

	public static void main(String[] args) throws InterruptedException {
	
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Rakshi\\eclipse-workspace\\selenium3\\drivers\\chromedriver.exe");      
	  ChromeOptions options = new ChromeOptions();     
      options.setBinary("C:\\Users\\Rakshi\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe"); 
	  WebDriver driver = new ChromeDriver(options);//create an object for Chrome driver  
	  
	  driver.get("https://www.singaporeair.com/en_UK/in/home#/book/bookflight");
	  
	  driver.manage().window().maximize();
	  
	  driver.findElement(By.xpath("//*[@id=\"sia-header\"]/sia-header/div[2]/sia-cookie/div/div/div/div[2]/button")).click();
	  
	  driver.findElement(By.xpath("//*[@id=\"hwidget\"]/div[2]/div/div[1]/li[2]/div/div/span")).click();
	  
	  WebElement radio = driver.findElement(By.id("eticketNumberRadio"));
	  radio.click();
	  System.out.println(radio.isSelected());
	  
	}
	}
