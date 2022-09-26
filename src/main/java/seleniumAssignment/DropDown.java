package seleniumAssignment;


import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;

public class DropDown extends first{

	
	public void favoriteUIAutomationToo()
	{
		Select dropd = new Select(driver.findElement(By.xpath("//select[@class='ui-selectonemenu']")));
	    dropd.selectByIndex(1);
	   // dropd.selectByIndex(2);
	}
	
	public void clickOptions(String option) throws InterruptedException
	{
		
		driver.findElement(By.xpath("//li[text()='"+option+"']")).click();
		Thread.sleep(100);
	}
	public void chooseTheCountry() throws InterruptedException
	{
		WebElement drop = driver.findElement(By.id("j_idt87:country_label"));
		drop.click();
		clickOptions("India");
		
	}
	
	public void chooseTheCities() throws InterruptedException
	{
		WebElement drop1 = driver.findElement(By.id("j_idt87:city_label"));
		drop1.click();
		clickOptions("Chennai");
	}
	
	public void chooseLanguage() throws InterruptedException
	{
		WebElement drop2 = driver.findElement(By.id("j_idt87:lang_label"));
		drop2.click();
		clickOptions("English");
	}
	
	public void chooseTwo() throws InterruptedException
	{
		WebElement drop3 = driver.findElement(By.id("j_idt87:value_label"));
		drop3.click();
		clickOptions("Two");
	}

}
