package WaterFallPageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import WtareFallUtility.WaterFallBase;

public class LoginPageLocator extends WaterFallBase{
	
	public LoginPageLocator() { // land
		PageFactory.initElements(driver, this);// factory
			
			
		}
	@FindBy(id  ="loginusername")
	public  WebElement UserName; 
	@FindBy(id  ="loginpassword")
	public  WebElement Password; 
	
	@FindBy(xpath  ="//button[text()='Log in']")
	public  WebElement LoginButton ; 
	
	

}
