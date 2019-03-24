package UI_Components;




import java.util.List;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DropdownComponent {

	@FindBy(name="toPort")
	static WebElement ToPort;
	
	@FindBy(name="fromPort")
	static List <WebElement> FromPort;
	
	public void toPortValues()
	{
		

		Select toPort= new Select(ToPort);
		toPort.selectByVisibleText("New York");
	}
	
	public Boolean verifySelectedValue()
	{
		if(ToPort.getText().equalsIgnoreCase("New York"))
		{
			return true;
		}
		return false;
	
	}
	
	public void fromPortValues()
	{

		for(int i=0; i<FromPort.size();i++)
		{
		
		System.out.println(FromPort.get(i).getText());
		
		}
	}
}
