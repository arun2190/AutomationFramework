package automationFramework;


import java.util.List;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrap_Dropdown {
	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenuim\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();

        driver.get("http://jqueryui.com/resources/demos/droppable/default.html");	 
	    WebElement src =  driver.findElement(By.xpath("//div[@id='draggable']"));
	    WebElement dst = driver.findElement(By.xpath("//div[@id='droppable']"));
	    
	 //   Action.dragAndDrop(drag, drop).build().perform();
	  //  Actions.moveToElement(drag).clickAndHold(drag).moveToElement(drop).release(drop).build().perform();
//	    Action.clickAndHold(src).moveToElement(dst).release(src).build().perform();

	//    Actions.dragAndDrop(drag, drop);
	Thread.sleep(5000);
	  
		Actions builder=new Actions(driver);
		builder.dragAndDrop(src,dst).build().perform();
		
		Thread.sleep(5000);
		  
		driver.get("http://www.google.com");
		 
		driver.manage().window().maximize();
		 
		Actions act=new Actions(driver);
		 
		act.contextClick(driver.findElement(By.linkText("About"))).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		 
	    	    
		Thread.sleep(5000);
	    
	       driver.close();
	       
	}

}
