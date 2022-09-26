package testCases;

import pages.radiobuttonPages;
import seleniumAssignment.BaseClass;

public class TC_005_RadioButton extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		initialization("https://leafground.com/radio.xhtml");
		radiobuttonPages radiobuttonpage = new radiobuttonPages();
		radiobuttonPages.favoritebrowser();
		radiobuttonPages.unSelectable();
		radiobuttonPages.defaultSelectButton();
		radiobuttonPages.selectOnlyIfNotSelect();
			}
}
