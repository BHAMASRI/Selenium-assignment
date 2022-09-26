package testCases;


import pages.waitPage;
import seleniumAssignment.BaseClass;

public class TC_007_Wait extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException {
		initialization("https://leafground.com/waits.xhtml");
		waitPage waitpage = new waitPage();
		waitpage.waitForVisibility();
		waitpage.waitForInvisibility();
		waitpage.waitForTextChange();
		waitpage.waitForClickability();
			}

}
