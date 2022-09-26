package seleniumAssignment;


import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;

public class hyperLink  extends first{

	public void  link()
	{
		driver.get("https://leafground.com/link.xhtml");
	}
	public void takeToDashboard() {
		WebElement dash = driver.findElement(By.xpath("//a[text()='Go to Dashboard']"));
		dash.click();
		driver.get("https://leafground.com/dashboard.xhtml");
		
	}
	
	public void findMyDestination()
	{
		WebElement destination = driver.findElement(By.xpath("//a[text()='Find the URL without clicking me.']"));
		destination.click();
		driver.get("https://leafground.com/grid.xhtml");
	}
	
	public void duplicateLink() {
		WebElement dash = driver.findElement(By.xpath("//a[text()='Go to Dashboard']"));
		dash.click();
		driver.get("https://leafground.com/dashboard.xhtml");
		
	}
	
	public void brokenLink()
	{
		WebElement broke = driver.findElement(By.xpath("//a[text()='Broken?']"));
		broke.click();
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
	
	public void countLinks()
	{
		WebElement count = driver.findElement(By.xpath("//a[text()='How many links in this page?']"));
		count.click();
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links are "+links.size());
	}

}
