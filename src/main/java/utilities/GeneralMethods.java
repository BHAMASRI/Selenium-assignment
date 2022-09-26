package utilities;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import seleniumAssignment.BaseClass;

public class GeneralMethods extends BaseClass{
	
	public static boolean typeInTextBox(String xpath, String value) {
		WebElement element = driver.findElement(By.xpath(xpath));
		element.sendKeys(value);
		return true;	
	}
	
	public static Boolean verifyTextBox(String xpath)
	{
		WebElement element = xpath(xpath);
		boolean check = element.isEnabled();
		if (!check) {
			System.out.println("Text Box is Disabled as expected");
		}else {
			System.out.println("Text Box is Enabled");
        }
		return true;
		}

	public static WebElement xpath(String xpath) {
		return driver.findElement(By.xpath(xpath));
	}
	
	public static WebElement css(String xpath)
	{
		return driver.findElement(By.cssSelector(xpath));
	}
	
	public static List<WebElement> driver(String xpath)
	{
		return driver.findElements(By.xpath(xpath));
	}
	
	
	
	
}
