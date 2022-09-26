package pages;

import org.openqa.selenium.WebElement;

import seleniumAssignment.BaseClass;
import utilities.GeneralMethods;

public class radiobuttonPages extends BaseClass {
	
	public static void  favoritebrowser(){
		GeneralMethods.css(OR.favoriteBrowser).click();
		
	}
	
	public static void unSelectable()
	{
		GeneralMethods.css(OR.unSelectable).click();
	}
	
	public static void defaultSelectButton()
	{
		WebElement button = GeneralMethods.css(OR.defaultSelectButton);
		System.out.println(button.getText());
		
	}
	
	public static void selectOnlyIfNotSelect()
	{
		boolean str = GeneralMethods.css(OR.selectOnlyIfNotSelect).isSelected();
		if(!str)
			System.out.println("Radio Button is selected");
		else
			System.out.println("Radio Button is not selected");
		
	}

}
