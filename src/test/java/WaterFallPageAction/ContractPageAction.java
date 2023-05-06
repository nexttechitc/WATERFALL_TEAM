package WaterFallPageAction;

import org.testng.Assert;

import WaterFallPageLocator.ContractPageLocator;
import WtareFallUtility.WaterFallBase;
import WtareFallUtility.WaterFallTestData;


public class ContractPageAction extends WaterFallBase{
	ContractPageLocator contractPageLocator = new ContractPageLocator();
	public void Clickcntractt() {
		contractPageLocator.ContractLink.click();
		
	}
	public void Entercontractemail() {
		contractPageLocator.ContractEmail.sendKeys(WaterFallTestData.ContractEmail);
		
	}
	public void Entercontractname() {
		contractPageLocator.ContractName.sendKeys(WaterFallTestData.ContractnName);
		
		
	}
	public void Entercontractmessage() {
		contractPageLocator.ContractMessage.sendKeys(WaterFallTestData.ContractMessage);
	}
	public void Clicksendcontract() {
		contractPageLocator.SendMessage.click();
	}
	public void Verifyusercancontractbysendingmessage() throws InterruptedException {
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		Thread.sleep(300);
		boolean veledateContract = contractPageLocator.ContractMessageVelidation.isDisplayed();
		Assert.assertTrue(veledateContract);
	}

}
