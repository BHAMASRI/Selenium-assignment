package seleniumAssignment;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;


public class alert extends first{
	
	public void alertSimpleDialog()
	{
		WebElement simple = driver.findElement(By.id("j_idt88:j_idt91"));
		simple.click();
		driver.switchTo().alert().accept();
	}
	
	public void alertConfirmDialog() throws InterruptedException
	{
		WebElement confirm = driver.findElement(By.id("j_idt88:j_idt93"));
		confirm.click();
		driver.switchTo().alert().accept();
		Thread.sleep(10000);
		confirm.click();
		driver.switchTo().alert().dismiss();
	}
	
	public void sweetAlertSimpleDialog()
	{
		WebElement sweet = driver.findElement(By.id("j_idt88:j_idt95"));
		sweet.click();
		driver.switchTo();
	}

	
		
	

}
