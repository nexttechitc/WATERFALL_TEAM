package WaterFallPageAction;

import WaterFallPageLocator.WaterFallHomePageLocator;
import WtareFallUtility.WaterFallBase;

public class WaterFallHomePageAction extends WaterFallBase{
	WaterFallHomePageLocator waterFallHomePageLocator = new WaterFallHomePageLocator();
	
	public void ClickLogin() {
		
		waterFallHomePageLocator.loginLink.click();
	}
	public void ClickNoliaphonee() {
		
		waterFallHomePageLocator.Nokiaphone.click();
		
	}
	public void ClickCarttlinkk() {
		waterFallHomePageLocator.CartLink.click();
		
	}
	

}
