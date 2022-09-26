package testCases;


import pages.dropdownPage;
import seleniumAssignment.BaseClass;

public class TC_003_DropDown extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		initialization("https://leafground.com/select.xhtml");
		dropdownPage dropdownPage = new dropdownPage();
		dropdownPage.favoriteUIAutomationTool();
		dropdownPage.chooseTheCountry();
		dropdownPage.chooseTheCities();
		dropdownPage.chooseLanguage();
		dropdownPage.chooseTwo();
	}
}
