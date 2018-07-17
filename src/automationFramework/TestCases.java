package automationFramework;

     import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


     // Import package pageObject.*

     import pageObjects.LoginPage;
     import pageObjects.Home_Page;

public class TestCases {

    
   public static void main(String[] args) throws InterruptedException {


       System.setProperty("webdriver.chrome.driver","C:\\Selenuim\\chromedriver_win32\\chromedriver.exe");
       
       WebDriver driver = new ChromeDriver();
       driver.get("https://interact.qa1.responsys.net/authentication/login/LoginPage");

     // Use page Object library now
     Thread.sleep(3000);
     LoginPage.txtbx_UserName(driver).sendKeys("chdwbqa");
     
     LoginPage.txtbx_Password(driver).sendKeys("Welcome12345!");
         
     LoginPage.btn_LogIn(driver).click();
     	
     Thread.sleep(5000);
     // Home_Page.hamburger_menu(driver).click();
     Thread.sleep(5000);
     
     Home_Page.LogOut_Btn(driver).click();
     
     
     
     String Url = "https://interact.qa1.responsys.net/suite/c#!home/";
     driver.get(Url);
     String actualUrl = driver.getCurrentUrl();
     
     if (actualUrl.equals(Url)){
			System.out.println("Verification Successful - The correct Url is opened.");
		}
     
     else {
			System.out.println("Verification Failed - An incorrect Url is opened.");
			//In case of Fail, you like to print the actual and expected URL for the record purpose
			System.out.println("Actual URL is : " + actualUrl);
			System.out.println("Expected URL is : " + Url);
		}
    	 
     driver.close();

     }

}