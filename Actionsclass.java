package seleniumTraning;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Actionsclass {

	public static void main(String[] args) throws InterruptedException {
	
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Rakshi\\eclipse-workspace\\selenium3\\drivers\\chromedriver.exe");      
	  ChromeOptions options = new ChromeOptions();     
      options.setBinary("C:\\Users\\Rakshi\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe"); 
	  WebDriver driver = new ChromeDriver(options);//create an object for Chrome driver  
	  
	 /* driver.get("https:\\www.ebay.com"); //used to open the page that is given in the url
	
	  driver.manage().window().maximize(); //used to maximize the webpage	  
	
      WebElement ele = driver.findElement(By.linkText("Electronics"));
      
      Actions action = new Actions(driver);
      
      action.moveToElement(ele).click().perform(); */
	  
	  /*driver.get("https://jqueryui.com/droppable/");
	  
	  driver.manage().window().maximize();
	  
	  WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
	  driver.switchTo().frame(frame);
	  
	  WebElement drag = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
	  WebElement drop = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
	  
	  Actions action = new Actions(driver);
	  action.dragAndDrop(drag, drop).perform(); */
	  
	  driver.get("https://jqueryui.com/addClass/");
	  
	  driver.manage().window().maximize();
	   
	  WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
	  
	  driver.switchTo().frame(frame);
	  
	  WebElement gg = driver.findElement(By.xpath("//*[@id=\"effect\"]"));
	  
	  Actions act = new Actions(driver);
	  
	  act.contextClick(gg).perform();

	 
	}
}


