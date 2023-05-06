package WaterFallPageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import WtareFallUtility.WaterFallBase;

public class ProfilePageLocator extends WaterFallBase{
	
	public ProfilePageLocator() { // land
		PageFactory.initElements(driver, this);// factory
			
			
		}
	@FindBy(id="nameofuser")
	public  WebElement Profile ; 

}
//