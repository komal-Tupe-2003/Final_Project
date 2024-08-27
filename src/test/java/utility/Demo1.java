package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo1 {
	
	public static ChromeDriver driver ;
    
	public static  void browserLaunch(String key , String path1)
	{
		
		String value = key;
		String path = path1;
		System.setProperty(value, path);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	public static void openApllication(String url1)
	{
	  String url = url1;
	  
	  driver.navigate().to(url);
	}
	public static void sentTextOnUi(String locator1,String data1)
	{
		String xpath = locator1;
		
		String data = data1; 
		
		driver.findElementByXPath(xpath).sendKeys(data);
		}
	public static void Click(String xpath1)
	{
		String xpath = xpath1;
		
		driver.findElementByXPath(xpath).click();
	}
	public static void dropDown ( String k , String h)
	{
    	String path = k;
    	String place = h;
    	Select location = new Select(driver.findElementByXPath(path)) ;
		location.selectByValue(h);
	}
	
		
	}
	



