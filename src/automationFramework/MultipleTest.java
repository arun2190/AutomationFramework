package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.base.Function;
@SuppressWarnings("unused")

public class MultipleTest {
	 
	  @Test (groups = { "Car" })
	 
	  public void Car1() {
	 
		  System.out.println("Batch Car - Test car 1");
	 
	  }
	 
	  @Test (groups = { "Car" })
	 
	  public void Car2() {
	 
		  System.out.println("Batch Car - Test car 2");
	 
	  }
	 
	  @Test (groups = { "Scooter" })
	 
	  public void Scooter1() {
	 
		  System.out.println("Batch Scooter - Test scooter 1");
	 
	  }
	 
	  @Test (groups = { "Scooter" })
	 
	  public void Scooter2() {
	 
		  System.out.println("Batch Scooter - Test scooter 2");
	 
	  }
	 
	  @Test (groups = { "Car", "Sedan Car" })
	 
	  public void Sedan1() {
	 
		  System.out.println("Batch Sedan Car - Test sedan 1");
	 
	  }
	 
	}