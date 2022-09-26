package testCases;

import pages.checkboxPage;
import pages.dropdownPage;
import seleniumAssignment.BaseClass;

public class TC_004_CheckBox extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		initialization("https://leafground.com/checkbox.xhtml");
		checkboxPage checkboxPage = new checkboxPage();
		checkboxPage.favoriteUIAutomationTool();
		checkboxPage.notification();
		checkboxPage.checkBoxIsDisabled();
    	checkboxPage.toggle();
			}

}
