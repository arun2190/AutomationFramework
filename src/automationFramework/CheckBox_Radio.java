package automationFramework;
 
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

 
@SuppressWarnings("unused")
public class CheckBox_Radio {
 
	public static void main(String[] args) throws InterruptedException {
		// Create a new instance of the chrome driver
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenuim\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
	    
	    List<WebElement> rdBtn_Sex = driver.findElements(By.name("sex"));
	    
        boolean bValue = false;
        
        bValue = rdBtn_Sex.get(0).isSelected();
        
        if(bValue == true){
        	
        	rdBtn_Sex.get(1).click();
        	
        } else {
        	
        	rdBtn_Sex.get(0).click();
        	
        }
        
        
        WebElement rdBtn_Exp = driver.findElement(By.id("exp-2"));
		rdBtn_Exp.click();
		
		List <WebElement> chkBx_Profession = driver.findElements(By.name("profession"));
		
		int iSize = chkBx_Profession.size();
		
		for ( int i=0;i<iSize;i++){
			
			String sValue = chkBx_Profession.get(i).getAttribute("value");
			
			if(sValue.equalsIgnoreCase("Automation Tester")){
				
				chkBx_Profession.get(i).click();
				
			}
			
		}
		
		// Step 6: Check the Check Box 'Selenium IDE' for category 'Automation Tool' (Use cssSelector)
				WebElement oCheck_Box = driver.findElement(By.cssSelector("input[value='Selenium IDE']"));
				oCheck_Box.click();
				
				Thread.sleep(5000);
				// Kill the browser
				driver.quit();
        
        
		
	}

}
