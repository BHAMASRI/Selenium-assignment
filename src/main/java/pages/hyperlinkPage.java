package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import seleniumAssignment.BaseClass;
import utilities.GeneralMethods;

public class hyperlinkPage extends BaseClass{
	

	public static void  link()
	{
		driver.get(OR.link);
	}
	
	public static void takeToDashboard() {
		WebElement dash = GeneralMethods.xpath(OR.takeToDashboard);
		dash.click();
		driver.get(OR.dashboard);
		driver.get(OR.link);
		
	}
	
	public static void findMyDestination()
	{
		WebElement destination = GeneralMethods.xpath(OR.findMyDestination);
		destination.click();
		driver.get(OR.grid);
		driver.get(OR.link);
	}
	
	public static void duplicateLink() {
		WebElement dash = GeneralMethods.xpath(OR.duplicateLink);
		dash.click();
		driver.get(OR.dashboard);
		driver.get(OR.link);
		
	}
	
	public static void brokenLink()
	{
		WebElement broke = GeneralMethods.xpath(OR.brokenLink);
		broke.click();
		driver.get(OR.link);
       /* List<WebElement> links = driver.findElements(By.tagName("a"));
        
        Iterator<WebElement> it = links.iterator();
        
        String url = "";
        while(it.hasNext()){
            
            url = it.next().getAttribute("href");
            
            System.out.println(url);
        
            if(url == null || url.isEmpty()){
System.out.println("URL is either not configured for anchor tag or it is empty");
                continue;
            }
        }*/
	}
	
	public static void countLinks()
	{
		WebElement count = GeneralMethods.xpath(OR.countLink);
		count.click();
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links are "+links.size());
	}


}
