package WaterFallPageAction;

import org.testng.Assert;

import WaterFallPageLocator.ProfilePageLocator;
import WtareFallUtility.WaterFallBase;

public class ProfilePageAction extends WaterFallBase{
	
	ProfilePageLocator profilePageLocator= new ProfilePageLocator();
	public void Verifyuserloinsuccessfully() {
		
		boolean profilevalidation=  profilePageLocator.Profile.isDisplayed();
		Assert.assertTrue(profilevalidation);
	}

}
