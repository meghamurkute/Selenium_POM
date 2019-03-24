package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

import UI_Components.DropdownComponent;
import UI_Components.LoginComponent;
import UI_Components.RadioButtonComponent;

public class AbstractTest {

	LoginComponent loginComponent;
    RadioButtonComponent radioButtonComponent;
    DropdownComponent dropdownComponent;
	WebDriver driver;

	public AbstractTest()

	{
		loginComponent = new LoginComponent();
        radioButtonComponent = new RadioButtonComponent();
        dropdownComponent = new DropdownComponent();
	}
	
	@BeforeTest
	public void EnvironmentSetup()
	{

		System.setProperty("webdriver.chrome.driver", "D:\\Megha_Ethans\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
       driver.get("http://www.newtours.demoaut.com");
       PageFactory.initElements(driver, loginComponent);
       PageFactory.initElements(driver, radioButtonComponent);
       PageFactory.initElements(driver, dropdownComponent);
	}
}
