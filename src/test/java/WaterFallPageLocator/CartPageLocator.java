package WaterFallPageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import WtareFallUtility.WaterFallBase;

public class CartPageLocator extends WaterFallBase{
	
	
	public CartPageLocator() { // land
		PageFactory.initElements(driver, this);// factory
			
			
		}
	@FindBy(xpath ="//td[text()='Nokia lumia 1520']")
	public  WebElement CartPage; 

}
