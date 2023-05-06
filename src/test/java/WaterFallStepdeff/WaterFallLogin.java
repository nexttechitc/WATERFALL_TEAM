package WaterFallStepdeff;

import WaterFallPageAction.WaterFallHomePageAction;
import WaterFallPageAction.LoginPageAction;
import WaterFallPageAction.ProfilePageAction;
import WtareFallUtility.WaterFallBase;
import WtareFallUtility.WaterFallUtility;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class WaterFallLogin extends WaterFallBase {
	WaterFallHomePageAction waterFallHomePageAction= new WaterFallHomePageAction();
	LoginPageAction loginPageAction= new LoginPageAction();
	ProfilePageAction profilePageAction = new 	ProfilePageAction();
	
	@Given("^Open Demoblaze \"([^\"]*)\" Application$")
	public void open_Demoblaze_Application(String URL) throws Throwable {
		waterfallURLL(URL);
		//driver.get("https://demoblaze.com/");
		WaterFallUtility.takeMyScreenshot(driver, "Home Page");
	}

	@Then("^Click Login$")
	public void click_Login() throws Throwable {
		waterFallHomePageAction.ClickLogin();
	}

	@Then("^Enter username and password and Click Login(\\d+)$")
	public void enter_username_and_password_and_Click_Login(int arg1) throws Throwable {
		loginPageAction.userCard(wpro.getProperty("Username"),wpro.getProperty("Password") );
	}

	@Then("^Verify user loin successfully$")
	public void verify_user_loin_successfully() throws Throwable {
		profilePageAction.Verifyuserloinsuccessfully();
	}



}
