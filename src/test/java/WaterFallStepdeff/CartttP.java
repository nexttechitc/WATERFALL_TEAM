package WaterFallStepdeff;


import WaterFallPageAction.CartPageActions;
import WtareFallUtility.WaterFallBase;
import WtareFallUtility.WaterFallUtility;
import cucumber.api.java.en.Then;

public class CartttP extends WaterFallBase {
	
	CartPageActions cartPageActions = new CartPageActions();
	
	@Then("^Verify user can add item in Carttt$")
	public void verify_user_can_add_item_in_Carttt() throws Throwable {
		cartPageActions.VerifyusercanadditeminCarttt();
		WaterFallUtility.takeMyScreenshot(driver, "Cart Page");
	}

	
	

}
