package WtareFallUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class WaterFallBase {
	
	// 1 Constructor 
	// Will have method for browser
	// will have metod for url
	// Properties class - Java
	// fileinputstreem - Apache POI - It is a Interface --
	 //fileinputstreem is responsible to read a file  
	//Properties  class will bring all we need 
	public static WebDriver driver;
	public static Properties wpro;
	
	public WaterFallBase() {
		
		try {
			FileInputStream waterfallFlile = new FileInputStream(System.getProperty("user.dir")+ "\\src\\test\\java\\WaterFallConfig\\WaterFallCongigFile.Properties");
			wpro= new Properties();
			wpro.load(waterfallFlile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Please check your code");
			e.printStackTrace();
		}
		
	}
	public void waterFallBrowser() {
		
		String Browser=  wpro.getProperty("WaterFallBrowser1");
		
		if(Browser.equalsIgnoreCase("Chrome")) {
			//System.setProperty("webdriver.http.factory", "jdk-http-client");
			System.setProperty( "webdriver.chrome.driver",(System.getProperty("user.dir")+ "//WaterFallDriver//chromedriver.exe"));
			//System.setProperty( "webdriver.edge.driver",(System.getProperty("user.dir")+ "\\WaterFallDriverIE\\msedgedriver.exe"));
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
			//driver = new ChromeDriver();
			//driver = new EdgeDriver();
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaterFallTestData.implicitlyWait));
			//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(WaterFallTestData.pageLoadTimeout));
			 driver.manage().window().maximize();// maximizing or window
			 driver.manage().deleteAllCookies();// Deleting all history 
		   	
			
			
		}
		else if (Browser.equalsIgnoreCase("FF"));
		
	}
	public static void waterfallURLL(String URL) {
		//driver.get(wpro.getProperty("URLQA"));
		driver.get(wpro.getProperty("URLQA1"));
	}

}
