package seleniumAssignment;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class displayGivenImage {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.get("https://www.flipkart.com/");

		WebElement Cancel = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		Cancel.click();

		driver.findElement(By.name("q")).sendKeys("iphone" + Keys.ENTER);
		Thread.sleep(5000);
		String phoneName = "APPLE iPhone 13 (Starlight, 128 GB)";
		//List<WebElement> phoneNameList = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		driver.findElement(By.xpath("//div[text()='"+phoneName+"']")).click();
		//CharSequence "name";
		driver.findElement(By.xpath("")).sendKeys("name");
		typeYourName("Azar");
		
		/*
		 * for (int i = 0; i < phoneNameList.size(); i++) {
		 * //System.out.println(phoneNameList.get(i).getText());
		 * if(phoneNameList.get(i).getText().
		 * equals("APPLE iPhone 13 (Starlight, 128 GB)")) {
		 * phoneNameList.get(i).click(); } }
		 */
	}
	
	public static void typeYourName(String name) {
		driver.findElement(By.xpath("")).sendKeys(name);
	}
}
