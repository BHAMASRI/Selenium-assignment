package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import seleniumAssignment.BaseClass;
import utilities.GeneralMethods;

public class tablePage extends BaseClass {
	public void content()
	{
			WebElement con = GeneralMethods.xpath(OR.content);
			String one = con.getText();
	        System.out.println(one);
	        
	        List<WebElement> row = GeneralMethods.driver(OR.contents);
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
	
	public void given()
	{
		WebElement con1 = GeneralMethods.xpath(OR.given);
		String one1 = con1.getText();
		System.out.println("");
        System.out.println(one1);
        
        WebElement elem = GeneralMethods.xpath(OR.gives);
        String e =elem.getText();
        System.out.println();
        System.out.println(e);
        
	}
	
	public void name()
	{
		WebElement n = GeneralMethods.xpath(OR.names);
		n.click();
	}
	
	public static void country(String name)
	{
		WebElement e = GeneralMethods.xpath(OR.country.replace("{variable}",name));
		System.out.println(e.getText());
	}
	
	public static void representativeStatus(String name) {
		WebElement e = GeneralMethods.xpath(OR.representativeStatus.replace("{variable}",name));
		System.out.println(e.getText());
	}
	
	public static void joinDate(String name)
	{
		WebElement e = GeneralMethods.xpath(OR.joinDate.replace("{variable}",name));
		System.out.println(e.getText());
	}
	
	public static void status(String name)
	{
		WebElement e= GeneralMethods.xpath(OR.status.replace("{variable}",name));;
	    System.out.println(e.getText());
	}
	
	public void printDetails()
	{
		name();
		System.out.println();
		country("Aruna");
		representativeStatus("Aruna");
		joinDate("Aruna");
		status("Aruna");
		
		
	}

}
