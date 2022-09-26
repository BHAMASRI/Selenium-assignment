package seleniumAssignment;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;


public class tables extends first {
	
	public void content()
	{
			WebElement con = driver.findElement(By.id("form:j_idt89_head"));
			String one = con.getText();
	        System.out.println(one);
	        
	        List<WebElement> row = driver.findElements(By.xpath("//tbody[@id='form:j_idt89_data']/tr"));
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
		WebElement con1 = driver.findElement(By.id("form:j_idt89_head"));
		String one1 = con1.getText();
		System.out.println("");
        System.out.println(one1);
        
        WebElement elem = driver.findElement(By.xpath("//tr[@data-ri='3']"));
        String e =elem.getText();
        System.out.println();
        System.out.println(e);
        
	}
	
	public void name()
	{
		WebElement n = driver.findElement(By.xpath("//th[@id='form:j_idt89:j_idt92']"));
		n.click();
	}
	
	public static void country(String name)
	{
		WebElement e = driver.findElement(By.xpath("//td[contains(text(),'"+name+"')]/following-sibling::td[1]/span[3]"));
		System.out.println(e.getText());
	}
	
	public static void representativeStatus(String name) {
		WebElement e = driver.findElement(By.xpath("//td[contains(text(),'"+name+"')]/following-sibling::td[2]/span[2]"));
		System.out.println(e.getText());
	}
	
	public static void joinDate(String name)
	{
		WebElement e = driver.findElement(By.xpath("//td[contains(text(),'"+name+"')]/following-sibling::td[3]"));
		System.out.println(e.getText());
	}
	
	public static void status(String name)
	{
		WebElement e= driver.findElement(By.xpath("//td[contains(text(),'"+name+"')]/following-sibling::td[4]/span[2]"));
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
