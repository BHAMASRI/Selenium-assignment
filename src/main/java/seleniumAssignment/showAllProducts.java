package seleniumAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class showAllProducts {
	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
	   System.setProperty("webdriver.chrome.driver","chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("http://www.google.com");
       driver.get("https://www.flipkart.com/");
      
    
       WebElement Cancel = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
       Cancel.click();
    
       driver.findElement(By.name("q")).sendKeys("iphone"+Keys.ENTER);
       Thread.sleep(5000);
       List<WebElement> phoneNameList = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
       
       List<WebElement> pricelist = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
       
       {
       for (int i=0; i<phoneNameList.size();i++)
       {
    	   System.out.println(phoneNameList.get(i).getText()+" - "+pricelist.get(i).getText());
       }
     

}
}
}