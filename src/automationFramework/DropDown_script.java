package automationFramework;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_script {

	public static void main(String[] args) throws InterruptedException {
		// Create a new instance of the chrome driver
		
				System.setProperty("webdriver.chrome.driver","C:\\Selenuim\\chromedriver_win32\\chromedriver.exe");
			    WebDriver driver = new ChromeDriver();
			    
			    driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
			    
			    WebElement drpDwn = driver.findElement(By.id("continents"));
			    @SuppressWarnings("unused")
				Select oSelect = new Select(drpDwn);
			    
			    oSelect.selectByVisibleText("Europe");
			    
			    Thread.sleep(3000);
			    
			    
			    List<WebElement> brpBox = oSelect.getOptions();
			    
			    int oSize = brpBox.size();
			    
			    
			    for ( int i=0;i<oSize;i++){
			    	
			    	String sValue = oSelect.getOptions().get(i).getText();
			    	
			    	if(sValue.equals("Africa")){
			    		
			    		oSelect.selectByIndex(i);
			    		break;
			    		
			    	}
			    		
			    	
			    }
			    Thread.sleep(3000);
			    
			    

			  //  Launch new Browser
			//    Open “http://toolsqa.wpengine.com/automation-practice-form/”
			 //   Select ‘Selenium Commands’ Multiple selection box ( Use Name locator to identify the element )
			 //   Select option ‘Browser Commands’  and then deselect it (Use selectByIndex and deselectByIndex)
			 //   Select option ‘Navigation Commands’  and then deselect it (Use selectByVisibleText and deselectByVisibleText)
			 //   Print and select all the options for the selected Multiple selection list.
			 //   Deselect all options
			 //   Close the browser

			    
			    Select dSelect = new Select(driver.findElement(By.name("selenium_commands")));
			    
			    dSelect.selectByIndex(0);
			    
			    dSelect.deselectByIndex(0);
			    
                dSelect.selectByVisibleText("Browser Commands");
			    
			    dSelect.deselectByVisibleText("Browser Commands");
			    
			    List<WebElement> dList = dSelect.getOptions();
			    
			    int dSize = dList.size();
			    
			    for (int i=0;i<dSize;i++){
			    	
			    	String dValue = dSelect.getOptions().get(i).getText();
			    	
			    	System.out.println("Option are: " + dValue);
			    	
			    	dSelect.selectByIndex(i);
			    }
			    
			    driver.quit();
			    
			    

	}

}
