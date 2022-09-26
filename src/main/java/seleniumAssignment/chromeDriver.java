package seleniumAssignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromeDriver {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://www.google.com");
	    driver.get("https://www.flipkart.com/");
	    driver.manage().window().maximize();
	    
	    WebElement Cancel = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	    Cancel.click();
	    
	    driver.findElement(By.name("q")).sendKeys("iphone"+Keys.ENTER);
	    Thread.sleep(5000);
	    WebElement image =  driver.findElement(By.xpath("//img[@class='_396cs4 _3exPp9']"));
	    image.click();
	   
	    Set<String> windowHandles = driver.getWindowHandles();
        List<String> windowHandlesList = new ArrayList<String>(windowHandles);
        
       // System.out.println("Total window number: " + windowHandlesList.size() + "\n");

	     
        driver.switchTo().window(windowHandlesList.get(1));
        
        String text = driver.findElement(By.xpath("//span[@class='B_NuCI']")).getText();
        
        System.out.println(text);


	    
	    
	    
	    

	}

}
