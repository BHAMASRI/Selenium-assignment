package seleniumAssignment;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;


public class checkBox extends first{
  
	
	public checkBox()
	{
		WebElement check = driver.findElement(By.xpath("//span[@class='ui-chkbox-label']"));
		check.click();
    }
	
	public void notification()
	{
		WebElement notify = driver.findElement(By.xpath("//span[text()='Ajax']"));
	    notify.click();
	    boolean status = notify.isSelected();
	    if(status)
	    {
	        System.out.println("Checked");
	    }
	    else
	    {
	    	System.out.println("Unchecked");
	    }
	    	
	}
	
	public void favoriteLanguage()
	{
		driver.findElement(By.cssSelector("label[for='j_idt87:basic:0']")).click();
		driver.findElement(By.cssSelector("label[for='j_idt87:basic:1']")).click();
		driver.findElement(By.cssSelector("label[for='j_idt87:basic:3']")).click();
	}
	
	public void  checkBoxIsDisabled()
	{

        Boolean checkBox = driver.findElement(By.id("j_idt87:j_idt102")).isEnabled();
        if (!checkBox) {
	          System.out.println("Check box is enabled");
        }
        else
        {
        	System.out.println("Check box is disabled");
        }
	}
	
	public void toggle()
	{
		WebElement tog = driver.findElement(By.id("j_idt87:j_idt100"));
		tog.click();
	}

	public void checkBox1() {
		// TODO Auto-generated method stub
		System.out.println("");
		
	}


}
