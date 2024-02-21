package seleniumTraning;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Firstscript {

	public static void main(String[] args) throws InterruptedException {
	
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Rakshi\\eclipse-workspace\\selenium3\\drivers\\chromedriver.exe");
      
	  ChromeOptions options = new ChromeOptions();
      
      options.setBinary("C:\\Users\\Rakshi\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
	  
	  WebDriver driver = new ChromeDriver(options);//create an object for Chrome driver
      
	  /*webdriver methods*/
	  
	  driver.get("https:\\www.ebay.com"); //used to open the page that is given in the url
	  
	  driver.manage().window().maximize(); //used to maximize the webpage
	  
	  String title = driver.getTitle();//used to print title of the page
	  System.out.println(title);
	  
	  String crtURl = driver.getCurrentUrl();//used to print url of the page
	  System.out.println(crtURl);
	  
	  //String pg = driver.getPageSource(); //recently modified source will be indentified
	  //System.out.println(pg);
	  
	  //Signin
	  
	  //driver.findElement(By.linkText("register")).click();
	  
	  
	 try {
  
	  driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("book");//xpath
	 
	  //driver.findElement(By.id("gh-btn")).click(); //id
      
	  driver.findElement(By.cssSelector("#gh-btn")).click(); //css selector
	  	  
	  driver.findElement(By.className("x-refine-toggle")).click();//class name
	  
	  driver.findElement(By.className("x-refine-toggle")).click();//class name
	  
	  WebElement m = driver.findElement(By.linkText("Books & Magazines"));	//anchor tag text should be given		  
      m.click();
      
  	  driver.findElement(By.partialLinkText("Collectible")).click();//anchor tag half text should be given
      
  	 /* WebElement checkbox= driver.findElement(By.xpath("//*[@id=\"x-refine__group_1__0\"]/ul/li[1]/div/a/div/span/input"));
	  checkbox.click();
	  System.out.println(checkbox.isSelected());
	  
	  WebElement go = driver.findElement(By.xpath("/html/body/div[5]/div[3]/ul/li[1]/ul/li[5]/div[1]/h3/div"));
	  Actions action = new Actions(driver);
	  action.moveToElement(go);
  	  
  	  WebElement radio = driver.findElement(By.xpath("//*[@id=\"x-refine__group__4\"]/ul/li[2]/div/a/div/span/input"));
	  radio.click();
	  System.out.println(radio.isSelected()); */
  	  
	 }	 
      
	  catch(Exception e) 
	  {
    	System.out.println("fail");
    
	  } 
	 // driver.navigate().back(); used navigate back to previous page
	  //Thread.sleep(5000);
	  //driver.close();
      
	 
	}
}


