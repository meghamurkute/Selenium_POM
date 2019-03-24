package Tests;

import static org.testng.Assert.assertTrue;


import org.testng.annotations.Test;

import UI_Components.RadioButtonComponent;

public class LoginTests extends AbstractTest{

	

@Test(description="Verify Login")
	public void VerifyLogin()
	{
	   loginComponent.login();
		assertTrue(loginComponent.verifyLoginFunc(), "Verify Login");
	}

@Test(description="verify radio button")
	public void VerifyRadio()
	{
	
	radioButtonComponent.ClickRadioButton();
	radioButtonComponent.SizeOfRadio();
	assertTrue(radioButtonComponent.VerifySizeOfRadioButton(), "verify size of radio");
	assertTrue(radioButtonComponent.VerifyClickedRadioButton(),"verift clicked radio button");
	}

@Test(description="verify dropdown")
public void VerifyDropdown()
{
	dropdownComponent.toPortValues();
	dropdownComponent.fromPortValues();
	assertTrue(dropdownComponent.verifySelectedValue(),"selected dropdown of toPort");
	
}
	
}
