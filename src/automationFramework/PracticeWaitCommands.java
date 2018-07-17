package automationFramework;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@SuppressWarnings("unused")
public class PracticeWaitCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenuim\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	 // Put an Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
	    
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    
	    driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
	    
	    
	    driver.findElement(By.xpath("//button[@id='timingAlert']")).click();
	    
	    
        System.out.println("Timer JavaScript Alert is triggered but it is not yet opened");
        
        
        // Create new WebDriver wait
        
        WebDriverWait wait  = new WebDriverWait(driver,10);
        
        Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());
        
        System.out.println("Either Pop Up is displayed or it is Timed Out");
        
        myAlert.accept();
        
        System.out.println("Alert Accepted");

        // Close the main window

        driver.close();
        
        
	    
	    
	    

	}

}
