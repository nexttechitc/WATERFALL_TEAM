package WaterFallPageAction;

import WaterFallPageLocator.LoginPageLocator;
import WtareFallUtility.WaterFallBase;

public class LoginPageAction extends WaterFallBase{
	LoginPageLocator loginPageLocator=new LoginPageLocator();
	
	public void userCard(String u, String p) throws Exception {
	
		loginPageLocator.UserName.sendKeys(u);
		
		loginPageLocator.Password.sendKeys(p);
		loginPageLocator.LoginButton.click();
		Thread.sleep(3000);
	}

}
