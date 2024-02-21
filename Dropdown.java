package seleniumTraning;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
	
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Rakshi\\eclipse-workspace\\selenium3\\drivers\\chromedriver.exe");      
	  ChromeOptions options = new ChromeOptions();     
      options.setBinary("C:\\Users\\Rakshi\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe"); 
	  WebDriver driver = new ChromeDriver(options);//create an object for Chrome driver  
	  
	  /*webdriver methods*/
	  
	 // driver.get("https:\\www.ebay.com"); //used to open the page that is given in the url
	  
	  driver.get(null);
	  driver.manage().window().maximize(); //used to maximize the webpage	  
	  String title = driver.getTitle();//used to print title of the page
	  System.out.println(title);  
	  String crtURl = driver.getCurrentUrl();//used to print url of the page
	  System.out.println(crtURl);

	 try {

  	  //dropdown
  	  
  	  WebElement x = driver.findElement(By.xpath("//*[@id=\"gh-cat\"]"));
	  
  	  Select select = new Select(x);
  	  
  	  select.selectByIndex(2);Thread.sleep(1000);  	  
  	  select.selectByVisibleText("Baby");Thread.sleep(1000);
  	  select.selectByValue("12576");
	 }	 
      
	 /*from multiple selection 
	 
	 webElement f= driver .findElement(By.xpath(crtURl));
	 Select sel = new select(f);
	 sel.selectByIndex(0);
	 sel.selectByValue("");
	 List<webElement> all = sel.getAllSelectedOptions();*/
	  
	 
	 catch(Exception e) 
	  {
    	System.out.println("fail");
    
	  } 
	 // driver.navigate().back(); used navigate back to previous page
	  //Thread.sleep(5000);
	  //driver.close();
      
	 
	}
}


