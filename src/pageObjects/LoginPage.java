package pageObjects;

import org.openqa.selenium.*;

public class LoginPage {

			
		private static WebElement element = null;
		 
	    public static WebElement txtbx_UserName(WebDriver driver){
	 
	         element = driver.findElement(By.id("txtUserName"));
	 
	         return element;
	 
	         }
	 
	     public static WebElement txtbx_Password(WebDriver driver){
	 
	         element = driver.findElement(By.id("txtPassword"));
	 
	         return element;
	 
	         }
	 
	     public static WebElement btn_LogIn(WebDriver driver){
	 
	         element =  driver.findElement(By.xpath("(//button[@id='signIn'])[2]"));
	 
	         return element;
	 
	         }
	     
	     
	     
	 
	     
	}
		

