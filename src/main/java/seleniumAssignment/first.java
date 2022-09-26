package seleniumAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class first 
{
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
	
	   System.setProperty("webdriver.chrome.driver","chromedriver.exe");
       driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("http://www.google.com");
       driver.get("https://leafground.com/");
       
       // textBox text = new textBox();
       
       driver.get("https://leafground.com/input.xhtml");
       Thread.sleep(400);
       
		 // text.typeYourName("BS");
		
		 //// text.appendCountryToThisCity(" India");
		
		 // text.verifyIfTextBoxIsDisabled();
		
		  //text.clearTheTypedText();
		
		  //text.retrieveTheTypedText();
		
		  Buttons button = new Buttons();
		
		  driver.get("https://leafground.com/button.xhtml;jsessionid=node010bdtwh54l5uw1ku3pra3a3cmi264173.node0");
	       
	       button.clickAndConfirmTitle();
	       
	       
	       driver.get("https://leafground.com/button.xhtml;jsessionid=node010bdtwh54l5uw1ku3pra3a3cmi264173.node0");
	       
	       button.confirmIfTheButtonIsDisabled();
	       
	       button.findThePositionOfTheSubmitButton();
	       
	       button.findTheSaveButtonColor();
	       
	       button.findTheHeightAndWidthOfThisButton();
	       
	       button.mouseOverAndConfirmTheColorChanged();
	       
	       DropDown dropdown = new DropDown();
	       
	       driver.get("https://leafground.com/select.xhtml");
	       
	       dropdown.favoriteUIAutomationToo();
	   
	       dropdown.chooseTheCountry();
	       
	       dropdown.chooseTheCities();
	       
	       dropdown.chooseLanguage();
	       
	       dropdown.chooseTwo();
	       
	       checkBox check = new checkBox();
	       
           driver.get("https://leafground.com/checkbox.xhtml");
	       
	       check.checkBox1();  
	       
	       check.notification();
	       
	       check.favoriteLanguage();
	       
	       check.checkBoxIsDisabled();
	       
	       check.toggle();
	       
	       Radiobutton radio = new Radiobutton();
	       
	       driver.get("https://leafground.com/radio.xhtml");
			 
		   Thread.sleep(1000);
			
			radio.favoritebrowser();
			
			radio.unSelectable();
			
			radio.defaultSelectButton();
			
			radio.selectOnlyIfNotSelect();
			
			driver.get("https://leafground.com/link.xhtml;jsessionid=node0162iy4u6l8f8lyzvch80b6jje331847.node0");
	       
			hyperLink hyper = new hyperLink();
			
			hyper.link();
			
			hyper.takeToDashboard();
			
			hyper.link();
			
			Thread.sleep(1000);
			
			hyper.findMyDestination();
			
			hyper.link();
			
			hyper.duplicateLink();
			
			hyper.link();
			
			hyper.brokenLink();
			
			hyper.link();
			
			hyper.countLinks();
			
			hyper.link();
			
			driver.get("https://leafground.com/waits.xhtml;jsessionid=node0mw7x0tdukejd1r38qhip1nv58326500.node0");
			
			waits wait = new waits();
			
			wait.waitForVisibility();
			
			wait.waitForInvisibility();
			
			wait.waitForTextChange();
			
			wait.waitForClickability();
			
			 driver.get("https://leafground.com/table.xhtml");
			 
			 tables table = new tables();
		       
		     table.content();
		       
		     table.given();
		       
		     table.printDetails();
		
		     driver.get("https://leafground.com/grid.xhtml");
		     
		     grid g = new grid();
		     
		     g.product();
		     
		     driver.get("https://leafground.com/alert.xhtml");
		    
		    alert a = new alert();
				
			a.alertSimpleDialog();
			Thread.sleep(1000);
				
			a.alertConfirmDialog();
			Thread.sleep(1000);
				
			a.sweetAlertSimpleDialog();
			
			System.out.println("complete");  
		
	}
	
	
}

	

