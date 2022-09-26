package pages;


import org.openqa.selenium.WebElement;

import seleniumAssignment.BaseClass;
import utilities.GeneralMethods;

public class waitPage extends BaseClass{
	
	public void waitForVisibility() throws InterruptedException
	{
		WebElement visible = GeneralMethods.xpath(OR.visibility);
		visible.click();
		Thread.sleep(1000);
	}
	
	public void waitForInvisibility() throws InterruptedException
	{
		WebElement invisible = GeneralMethods.xpath(OR.invisibility);
		invisible.click();
		Thread.sleep(1000);
	}
	
		
	public void waitForClickability() throws InterruptedException {
		WebElement wait = GeneralMethods.xpath(OR.clickability);
		Thread.sleep(1000);
		wait.click();
		
	}
	
	public void waitForTextChange() throws InterruptedException {
		WebElement text = GeneralMethods.xpath(OR.waitForTextChange);
		text.click();
		Thread.sleep(1000);
	}

}
