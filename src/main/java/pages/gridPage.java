package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import seleniumAssignment.BaseClass;
import utilities.GeneralMethods;

public class gridPage extends BaseClass {
	public static void clicked(String name)
	{
		GeneralMethods.xpath(OR.clicked.replace("{variable}",name)).click();
		
	}
	
	public static void product()
	{
		clicked("Bracelet");
		table("Bracelet");
		
	}
	
	public static void table(String name) {
		 List<WebElement> row = GeneralMethods.driver(OR.table.replace("{variable}",name));
	        for (int i = 0; i < row.size(); i++)
	        {
	        	List<WebElement> cell = row.get(i).findElements(By.xpath("./td"));
	        	for (int j = 0; j < cell.size(); j++)
	        	{
	        		System.out.println(cell.get(j).getText());
	        	}
	        	System.out.println();
	        	}
	}

}
