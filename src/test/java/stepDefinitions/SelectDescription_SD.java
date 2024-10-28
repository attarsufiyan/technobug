package stepDefinitions;

import io.cucumber.java.en.Then;
import pageObjects.SelectDescription_PO;
import utils.Variables;

public class SelectDescription_SD {

	Variables variables;
	SelectDescription_PO selectdescribe;

	public SelectDescription_SD(Variables variables) {

		this.variables = variables;
	}

	@Then("user will select on I am student")
	public void student_will_select_on_i_am_student() {

		SelectDescription_PO selectdescribe = variables.pageObjectManager.getSelectDescription();
		selectdescribe.clickAsStudent();

	}

	@Then("user will select on I am teacher")
	public void teacher_will_select_on_I_am_teacher() {

		SelectDescription_PO selectdescribe = variables.pageObjectManager.getSelectDescription();
		selectdescribe.clickAsTeacher();
		

	}

	@Then("user will select on I am Educational Institute")
	public void institute_will_select_on_I_am_Educational_Institute() {

		SelectDescription_PO selectdescribe = variables.pageObjectManager.getSelectDescription();
		selectdescribe.clickAsInstitute();

	}

}
