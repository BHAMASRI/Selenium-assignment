package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import seleniumAssignment.BaseClass;
import utilities.GeneralMethods;

public class dropdownPage extends BaseClass{

	public void favoriteUIAutomationTool()
	{
		Select dropd = new Select(GeneralMethods.xpath(OR.drop));
	    dropd.selectByIndex(1);
	   // dropd.selectByIndex(2);
	}
	
	public static void clickOptions(String option) throws InterruptedException
	{
		
		GeneralMethods.xpath(OR.options.replace("{variable}", option)).click();
		Thread.sleep(100);
	}
	public  void chooseTheCountry() throws InterruptedException
	{
		WebElement drop = GeneralMethods.xpath(OR.dropdownCountry);
		drop.click();
		clickOptions("India");
		
	}
	
	public void chooseTheCities() throws InterruptedException
	{
		WebElement drop1 = GeneralMethods.xpath(OR.dropdownCity);
		drop1.click();
		clickOptions("Chennai");
	}
	
	public void chooseLanguage() throws InterruptedException
	{
		WebElement drop2 = GeneralMethods.xpath(OR.dropdownLanguage);
		drop2.click();
		clickOptions("English");
	}
	
	public void chooseTwo() throws InterruptedException
	{
		WebElement drop3 = GeneralMethods.xpath(OR.dropdownValue);
		drop3.click();
		clickOptions("Two");
	}

}
