package seleniumAssignment;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;


public class waits extends first {
    
    
	public void waitForVisibility() throws InterruptedException
	{
		WebElement visible = driver.findElement(By.id("j_idt87:j_idt89"));
		visible.click();
		Thread.sleep(10000);
	}
	
	public void waitForInvisibility() throws InterruptedException
	{
		WebElement invisible = driver.findElement(By.id("j_idt87:j_idt92"));
		invisible.click();
		Thread.sleep(10000);
	}
	
	public void waitForTextChange() throws InterruptedException {
		WebElement text = driver.findElement(By.id("j_idt87:j_idt98"));
		text.click();
		Thread.sleep(10000);
	}
	
	public void waitForClickability() throws InterruptedException {
		WebElement wait = driver.findElement(By.id("j_idt87:j_idt95"));
		Thread.sleep(10000);
		wait.click();
		
	}
}
