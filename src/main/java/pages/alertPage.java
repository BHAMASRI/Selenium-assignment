package pages;


import org.openqa.selenium.WebElement;

import seleniumAssignment.BaseClass;
import utilities.GeneralMethods;

public class alertPage extends BaseClass {
	public void alertSimpleDialog()
	{
		WebElement simple = GeneralMethods.xpath(OR.alertSimpleDialog);
		simple.click();
		driver.switchTo().alert().accept();
	}
	
	public void alertConfirmDialog() throws InterruptedException
	{
		WebElement confirm = GeneralMethods.xpath(OR.alertConfirmDialog);
		confirm.click();
		driver.switchTo().alert().accept();
		Thread.sleep(10000);
		confirm.click();
		driver.switchTo().alert().dismiss();
	}
	
	public void sweetAlertSimpleDialog()
	{
		WebElement sweet = GeneralMethods.xpath(OR.sweetAlertSimpleDialog);
		sweet.click();
		driver.switchTo();
	}

}
