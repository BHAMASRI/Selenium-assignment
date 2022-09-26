package pages;


import org.openqa.selenium.WebElement;

import seleniumAssignment.BaseClass;
import utilities.GeneralMethods;

public class checkboxPage extends BaseClass {
	

		public static void favoriteUIAutomationTool()
		{
			WebElement check = GeneralMethods.xpath(OR.checkBox);
			check.click();
	    }
		
		public static void notification()
		{
			WebElement notify = GeneralMethods.xpath(OR.notification);
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
			GeneralMethods.css(OR.fav1).click();
			GeneralMethods.css(OR.fav2).click();
			GeneralMethods.css(OR.fav3).click();
		}
		
		public static void  checkBoxIsDisabled()
		{

	        Boolean checkBox = GeneralMethods.xpath(OR.checkBoxIsDisabled).isEnabled();
	        if (!checkBox) {
		          System.out.println("Check box is enabled");
	        }
	        else
	        {
	        	System.out.println("Check box is disabled");
	        }
		}
		
		public static void toggle()
		{
			WebElement tog = GeneralMethods.xpath(OR.toggle);
			tog.click();
		}
	}

