package seleniumAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class grid extends first{
	
	
	public static void clicked(String name)
	{
		driver.findElement(By.xpath("(//td[text()='"+name+"']/preceding-sibling::td)[2]")).click();
		
	}
	
	public void product()
	{
		clicked("Bracelet");
		table("Bracelet");
		
	}
	
	public static void table(String name) {
		 List<WebElement> row = driver.findElements(By.xpath("//td[text()='"+name+"']/parent::tr/following::tr[1]/child::td//descendant::div[3]//descendant::tbody/tr"));
	        for (int i = 0; i < row.size(); i++)
	        {
	        	List<WebElement> cell = row.get(i).findElements(By.xpath("./td"));
	        	for (int j = 0; j < cell.size(); j++)
	        	{
	        		System.out.println(cell.get(j).getText());
	        	}
	        	System.out.println();
	        	}

		//driver.findElement(By.xpath("//td[text()='\'"+name+"']/parent::tr/following::tr[1]/child::td//descendant::div[3]//descendant::tbody/tr"));
	}
}
