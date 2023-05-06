package WaterFallPageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import WtareFallUtility.WaterFallBase;

public class ContractPageLocator extends WaterFallBase{
	
	public ContractPageLocator() { // land
		PageFactory.initElements(driver, this);// factory
			
			
		}
	@FindBy(xpath ="//a[text()='Contact']")
	public  WebElement ContractLink; 
	@FindBy(id  ="recipient-email")
	public  WebElement ContractEmail; 
	@FindBy(id  ="recipient-name")
	public  WebElement ContractName; 
	@FindBy(id  ="message-text")
	public  WebElement ContractMessage; 
	@FindBy(id="cat")
	public  WebElement ContractMessageVelidation; 
	
	@FindBy(xpath ="//button[text()='Send message']")
	public  WebElement SendMessage; 
	

}
