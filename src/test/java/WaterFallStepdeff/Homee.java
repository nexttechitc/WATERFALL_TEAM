package WaterFallStepdeff;

import WaterFallPageAction.ProductPageAction;
import WaterFallPageAction.WaterFallHomePageAction;
import WtareFallUtility.WaterFallBase;
import cucumber.api.java.en.Then;

public class Homee extends WaterFallBase{
	WaterFallHomePageAction waterFallHomePageAction = new WaterFallHomePageAction();
	ProductPageAction productPageAction = new ProductPageAction();
	
	
	@Then("^Click Nolia phonee$")
	public void click_Nolia_phonee() throws Throwable {
		waterFallHomePageAction.ClickNoliaphonee();
	}

	@Then("^Click AddToCart$")
	public void click_AddToCart() throws Throwable {
		productPageAction.ClickAddToCart();
	}

	@Then("^Click Cartt linkk$")
	public void click_Cartt_linkk() throws Throwable {
		waterFallHomePageAction.ClickCarttlinkk();
	}

}
