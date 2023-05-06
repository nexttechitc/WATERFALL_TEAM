package WaterFallStepdeff;

import WaterFallPageAction.ContractPageAction;
import WtareFallUtility.WaterFallBase;
import cucumber.api.java.en.Then;

public class Contract extends WaterFallBase{
	ContractPageAction contractPageAction = new ContractPageAction();
	@Then("^Click cntractt$")
	public void click_cntractt() throws Throwable {
		contractPageAction.Clickcntractt();
	}

	@Then("^Enter contract email$")
	public void enter_contract_email() throws Throwable {
		contractPageAction.Entercontractemail();
	}

	@Then("^Enter contract name$")
	public void enter_contract_name() throws Throwable {
		contractPageAction.Entercontractname();
	}

	@Then("^Enter contract message$")
	public void enter_contract_message() throws Throwable {
		contractPageAction.Entercontractmessage();
	}

	@Then("^Click send contract$")
	public void click_send_contract() throws Throwable {
		contractPageAction.Clicksendcontract();
	    
	}
	@Then("^Verify user can contract by sending message$")
	public void verify_user_can_contract_by_sending_message() throws Throwable {
		contractPageAction.Verifyusercancontractbysendingmessage();
	}




}
