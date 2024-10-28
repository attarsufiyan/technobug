package stepDefinitions;

import io.cucumber.java.en.Then;
import pageObjects.educatorRegistration_PO;
import utils.Variables;

public class educatorRegistration_SD {

	Variables variables;

	educatorRegistration_PO educatorregister;

	public educatorRegistration_SD(Variables variables) {

		this.variables = variables;
		this.educatorregister = variables.pageObjectManager.geteducatorRegister();
	}

	@Then("^user enter the phoneNumber (.+) and password (.+)$")
	public void user_enter_the_phoneNumber_and_password(String phone, String pwd) {

		educatorregister.enterPhoneno(phone);
		educatorregister.enterpassword(pwd);

	}

	@Then("^user enter the name (.+) email (.+) phoneNumber (.+) feild (.+) subject (.+) Passwsord (.+) and Confrimpassword (.+)$")
	public void educatorRegister(String Name, String email, String contact, String field, String subject,
			String password, String confirmpwd) {

		educatorregister.entername(Name);
		educatorregister.enterEmail(email);
		educatorregister.enterPhoneno(contact);
		educatorregister.enterteachingfield(field);
		educatorregister.enterSubject(subject);
		educatorregister.enterpassword(password);
		educatorregister.enterConfirmed(confirmpwd);

	}

}
