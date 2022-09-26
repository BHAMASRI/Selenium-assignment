package seleniumAssignment;

import pages.checkboxPage;

public class checkboxTextCase extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		initialization("https://leafground.com/checkbox.xhtml");
		checkboxPage checkboxpage = new checkboxPage();
		Thread.sleep(1000);
		}

}
