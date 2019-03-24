package UI_Components;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class RadioButtonComponent {

	@FindBy(name="servClass")
	static List<WebElement> ServiceClass;
	
    public void SizeOfRadio()
    {
    	System.out.println("size of radio: "+ServiceClass.size());
    }
	
    public Boolean VerifySizeOfRadioButton()
    {
    	if(ServiceClass.size()==3)
    	{
    		return true;
    	}
    	else return false;
    }
	
    public void ClickRadioButton()
    {
    	for (WebElement current_radio:ServiceClass)
    	{
    		System.out.println(current_radio.getAttribute("value"));
    	}
    	for(int i=0;i<ServiceClass.size();i++)
    	{
    		if(ServiceClass.get(i).getAttribute("value").equalsIgnoreCase("Business"))
    		{
    			ServiceClass.get(i).click();
    		}
    			
    	}
    	
    }
	
    public Boolean VerifyClickedRadioButton()
    {
		for(WebElement SelectedRadio:ServiceClass)
		{
			
			if(SelectedRadio.isSelected())
			{
				
				return true;
			}
		}
		return false;
    
    }
    
    
    
}
