package pages;



import org.openqa.selenium.WebElement;

import seleniumAssignment.BaseClass;
import utilities.GeneralMethods;

public class TextBoxPage extends BaseClass{
	
	public void typeYourName(String name) {
		GeneralMethods.typeInTextBox(OR.typeYourName, name);
	}
	
	public void appendCountryToThisCity(String country)
	{
		/*
		 * WebElement appendBox = driver.findElement(By.id("j_idt88:j_idt91"));
		 * appendBox.sendKeys(country); 
		 */
		GeneralMethods.typeInTextBox(OR.appendCountry, country);
	}
	
	public void verifyIfTextBoxIsDisabled()
	{
		GeneralMethods.verifyTextBox(OR.verifyIfTextBox);
		//Boolean textBox = driver.findElement(OR.verifyIfTextBox).isEnabled();
		
	}
    public void clearTheTypedText()
    {
    	WebElement data = GeneralMethods.xpath(OR.clearText);
    	data.clear();
    }
    
	public void retrieveTheTypedText()
    {
    	String data = GeneralMethods.xpath(OR.retrieveText).getAttribute("value");
    	System.out.println(data);
    	
    }
}
