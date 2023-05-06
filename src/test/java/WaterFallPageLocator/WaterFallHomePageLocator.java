package WaterFallPageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import WtareFallUtility.WaterFallBase;

public class WaterFallHomePageLocator extends WaterFallBase {
	
public WaterFallHomePageLocator() { // land
	PageFactory.initElements(driver, this);// factory
		
		
	}

@FindBy(xpath="/html/body/nav/div[1]/ul/li[5]/a")
public  WebElement loginLink; 

@FindBy(id="cartur")
public  WebElement CartLink; 

@FindBy(xpath ="//a[text()='Nokia lumia 1520']")
public  WebElement Nokiaphone; 



 

}
