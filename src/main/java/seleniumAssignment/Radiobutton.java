package seleniumAssignment;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;


public class Radiobutton extends first {

	
	public void  favoritebrowser(){
		driver.findElement(By.cssSelector("label[for='j_idt87:console1:0']")).click();
		
	}
	
	public void unSelectable()
	{
		driver.findElement(By.cssSelector("label[for='j_idt87:city2:1']")).click();
	}
	
	public void defaultSelectButton()
	{
		WebElement button = driver.findElement(By.cssSelector("label[for='j_idt87:console2:2']"));
		System.out.println(button.getText());
		
	}
	
	public void selectOnlyIfNotSelect()
	{
		boolean str = driver.findElement(By.cssSelector("label[for='j_idt87:age:1']")).isSelected();
		if(!str)
			System.out.println("Radio Button is selected");
		else
			System.out.println("Radio Button is not selected");
		
	}
}
