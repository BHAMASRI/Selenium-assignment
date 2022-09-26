package seleniumAssignment;



import org.openqa.selenium.By;
import org.openqa.selenium.Point;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;

public class Buttons extends first{
	
	
	public void clickAndConfirmTitle()
	{
		driver.findElement(By.name("j_idt88:j_idt90")).click();
		driver.get("https://leafground.com/");
		
	}
	
	public  void confirmIfTheButtonIsDisabled()
	{
		WebElement disable = driver.findElement(By.id("j_idt88:j_idt92"));
		if(!disable.isEnabled())
		{
			System.out.println("The button is Disabled");
		}
		else
			System.out.println("The button is enabled");
	}
    
    public void findThePositionOfTheSubmitButton()
    {
    	WebElement submit = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt94']"));
    	Point button = submit.getLocation();
    	int x = button.getX();
    	System.out.println("X coordinates: "+x);
    	int y = button.getY();
    	System.out.println("Y coordinates: "+y);
    }
    
    public void findTheSaveButtonColor()
    {
    	WebElement color = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt96']"));
    	String s = color.getCssValue("color");
    	System.out.println("The saved button color is : "+s);
    }
    
    public void findTheHeightAndWidthOfThisButton()
    {
    	WebElement find = driver.findElement(By.id("j_idt88:j_idt98"));
    	 int width = find.getSize().getWidth();
         System.out.println("Button width : "+width+" pixels");
                 
         int height = find.getSize().getHeight();        
         System.out.println("Button height : "+height+" pixels");
    }
    
    public void mouseOverAndConfirmTheColorChanged()
    {
    	WebElement mouse = driver.findElement(By.id("j_idt88:j_idt100"));
    	Actions a = new Actions(driver);
        a.moveToElement(mouse).perform();
        System.out.println(mouse.getText());
    }
    
  /*  public static void clickImageButtonAndClickOnAnyHiddenButton()
    {
    	driver.findElement(By.name("j_idt88:j_idt102")).click();
    }*/
    
   /* public static void numberOfRoundedButton() 
    {
    	List<WebElement> buttons = driver.findElements(By.xpath("//button[@role='button']"));
    	int buttonCount=0;
    	for(WebElement a : buttons){        
    	    if(a.getText().equals("buttonName")){
    	          buttonCount++;
    	        
    	}   
    	   System.out.println(buttonCount);
    	}
    }*/

}
