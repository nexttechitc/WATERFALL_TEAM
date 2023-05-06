package WaterFallPageAction;

import org.testng.Assert;

import WaterFallPageLocator.CartPageLocator;
import WtareFallUtility.WaterFallBase;

public class CartPageActions extends WaterFallBase {
	
	
CartPageLocator cartPageLocator = new CartPageLocator();
	
	public void VerifyusercanadditeminCarttt() throws Exception   {
		Thread.sleep(4000);
		boolean cartpageverify =  cartPageLocator.CartPage.isDisplayed();
		Assert.assertTrue(cartpageverify);
		
	}

}
