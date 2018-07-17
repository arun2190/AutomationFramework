package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_Page {
	
	private static WebElement element = null;
	
	
	// Logout menu 
	public static WebElement LogOut_Btn(WebDriver driver){
		 
        element =   driver.findElement(By.id("uifheaderaccountbutton-1070-btnIconEl"));

        return element;

        }


	// Hamburger Menu Options
	
	
	public static WebElement hamburger_menu(WebDriver driver){
		 
        element =   driver.findElement(By.xpath(".//*[@id='uifhamburgerbutton-1012-btnIconEl']"));
        		
        return element;

        }
	
	
	
	
}
