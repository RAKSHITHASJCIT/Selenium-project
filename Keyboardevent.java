package seleniumTraning;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Keyboardevent {

	public static void main(String[] args) throws InterruptedException {
	
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Rakshi\\eclipse-workspace\\selenium3\\drivers\\chromedriver.exe");      
	  ChromeOptions options = new ChromeOptions();     
      options.setBinary("C:\\Users\\Rakshi\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe"); 
	  WebDriver driver = new ChromeDriver(options);//create an object for Chrome driver  
	  
	  driver.get("https://extendsclass.com/text-compare.html");
	  
	  driver.manage().window().maximize();
	  
	 //WebElement textcopy = driver.findElement(By.xpath("//*[@id=\"dropZone\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[7]/pre/span"));
	 
	 Actions action = new Actions(driver);
	 
	 //action.keyDown(textcopy, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();//used to copy the text and paste on other side .build is used to send multiple keys
	 
	 //Thread.sleep(2000);

	 //WebElement textpaste = driver.findElement(By.xpath("//*[@id=\"dropZone2\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[5]/pre/span"));
	 
	 //action.keyDown(textpaste, Keys.CONTROL).sendKeys("a").sendKeys("v").perform();
	 
	 WebElement ele = driver.findElement(By.xpath("//*[@id=\"dropZone\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[14]/pre/span"));
	 
	 action.keyUp(ele, Keys.ARROW_DOWN).sendKeys("hi hello").sendKeys(Keys.SPACE).perform();
	}
	}
