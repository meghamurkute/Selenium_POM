package UI_Components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import bds_Queries.servicesCall;

public class LoginComponent {

	
	@FindBy(name="userName")
	static WebElement userNameEditBox;
	
	@FindBy(name="password")
	static WebElement passwordEditBox;
	
	@FindBy(name="login")
	static WebElement loginButton;
	
	@FindBy(xpath=".//*[@src='/images/spacer.gif']//following::font")
	static WebElement LoginVerification;
	
	public void login()
	{
		userNameEditBox.sendKeys("batman");
		passwordEditBox.sendKeys("batman");
		loginButton.click();
	
	}
	public boolean verifyLoginFunc()
	{
		String actualText = LoginVerification.getText();
		String expectedText= servicesCall.getLoginVerificationText();
		if(actualText.equals(expectedText))
		{
			return true;
		}
		else
			return false;
	
	}
	
}
