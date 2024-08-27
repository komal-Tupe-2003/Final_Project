package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumOperations {
	
	public static WebDriver driver = null ;
    
	public static  void browserLaunch(Object[]inputParameters)
	{
		try
		{
		
		String browsername = (String) inputParameters[0];
		    if(browsername.equalsIgnoreCase(browsername))
		    {
		    	System.setProperty("webdriver.chrome.driver", "D:\\AUTOMATION SUPPORT\\chromedriver.exe");
		    	driver = new ChromeDriver();
		    	driver.manage().window().maximize();
		    	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		    }
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}
		
	
	public static void openApllication(Object[]inputparameters)
	{
		try
		{
	  String url = (String) inputparameters[0];
	  
	  driver.navigate().to(url);
	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static void sentTextOnUi(Object[]inputParameters)
	{
		try
		{
		String path = (String) inputParameters[0];
		
		String data = (String) inputParameters[1];
		
		driver.findElement(By.xpath(path)).sendKeys(data);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
		
	public static void Click(Object[]inputParameters)
	{
		try
		{
		String xpath = (String)  inputParameters[0];
		
		driver.findElement(By.xpath(xpath)).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void dropDown ( Object[]inputParameters)
	{
		try
		{
    	String path = (String) inputParameters[0];
    	int place =   (Integer) inputParameters[1];
    	Select location = new Select(driver.findElement(By.xpath(path)));
		location.selectByIndex(place);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}catch(Exception e)
		{
			System.out.println(e);
		}

	}
	
	
	public static void validation(Object[]inputParameters)
	{
		
		String  givenText = (String) inputParameters[0];
		String locator = (String) inputParameters[1];
		
	String capuredText =driver.findElement(By.xpath(locator)).getText();
		
	   if(givenText.equalsIgnoreCase(capuredText))
	      {
		System.out.println("Test Case Pass");
	      }
	    else
	     {
		       System.out.println("Test Case Fail");
	     }
		
	
   }
	
	public static void validationInvalid(Object[]inputparameters)
	{
		
		String givenText = (String) inputparameters[0];
		      Alert handle =  driver.switchTo().alert();
		      String captureText = handle.getText();
		       handle.dismiss();
		       
		       if(givenText.contentEquals(captureText))
		       {
		    	   System.out.println("Test case pass");
		    	   
		       }
		       else
		       {
		    	   System.out.println("Test case Fail");
		       }
		
		
	}
	
	
 


}
	



