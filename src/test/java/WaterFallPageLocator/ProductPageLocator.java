package WaterFallPageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import WtareFallUtility.WaterFallBase;

public class ProductPageLocator extends WaterFallBase{
	
	public ProductPageLocator() { // land
		PageFactory.initElements(driver, this);// factory
			
			
		}
	@FindBy(xpath="//a[text()='Add to cart']")
	public  WebElement AddToCart; 

}
