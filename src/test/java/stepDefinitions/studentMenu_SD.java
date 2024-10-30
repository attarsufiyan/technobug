package stepDefinitions;

import io.cucumber.java.en.And;
import pageObjects.studentMenu_PO;
import utils.Variables;

public class studentMenu_SD {

	Variables variables;

	studentMenu_PO studentmenu;

	public studentMenu_SD(Variables variables) {

		this.variables = variables;
		this.studentmenu = variables.pageObjectManager.getstudentMenu();
	}
	
	@And("click on Dasboard")
	public void clickOnDashbaord() throws InterruptedException {
		
		studentmenu.clickDashboard();
		Thread.sleep(2000);
		
	}
	

}
