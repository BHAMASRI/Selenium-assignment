package pages;


import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import seleniumAssignment.BaseClass;
import utilities.GeneralMethods;

public class buttonPage extends BaseClass{
	
	public void clickAndConfirmTitle() throws InterruptedException
	{
		 GeneralMethods.xpath(OR.click).click();
	 Thread.sleep(300);
	 
	driver.get(OR.button);
		
	}
	
public void confirmIfTheButtonIsDisabled()
	{
		WebElement disable = GeneralMethods.xpath(OR.ButtonIsDisabled);
		if(!disable.isEnabled())
		{
			System.out.println("The button is Disabled");
		}
		else
			System.out.println("The button is enabled");
	}
    
    public void findThePositionOfTheSubmitButton()
    {
    	WebElement submit = GeneralMethods.xpath(OR.PositionOfTheSubmitButton);
    	Point button = submit.getLocation();
    	int x = button.getX();
    	System.out.println("X coordinates: "+x);
    	int y = button.getY();
    	System.out.println("Y coordinates: "+y);
    }
    
    public void findTheSaveButtonColor()
    {
    	WebElement color = GeneralMethods.xpath(OR.ButtonColor);
    	String s = color.getCssValue("color");
    	System.out.println("The saved button color is : "+s);
    }
    
    public void findTheHeightAndWidthOfThisButton()
    {
    	WebElement find = GeneralMethods.xpath(OR.HeightAndWidthOfThisButton);
    	 int width = find.getSize().getWidth();
         System.out.println("Button width : "+width+" pixels");
                 
         int height = find.getSize().getHeight();        
         System.out.println("Button height : "+height+" pixels");
    }
    
    public void mouseOverAndConfirmTheColorChanged()
    {
    	WebElement mouse = GeneralMethods.xpath(OR.ConfirmTheColorChanged);
    	Actions a = new Actions(driver);
        a.moveToElement(mouse).perform();
        System.out.println(mouse.getText());
    }
    

}
