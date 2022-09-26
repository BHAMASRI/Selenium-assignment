package testCases;

import pages.TextBoxPage;
import seleniumAssignment.BaseClass;

public class TC_001_TextBoxPositive extends BaseClass{
	public static void main(String[] args) {
		initialization("https://leafground.com/input.xhtml");
		TextBoxPage textBoxPage = new TextBoxPage();
		textBoxPage.typeYourName("Bhama sri");
		textBoxPage.appendCountryToThisCity(" India");
		textBoxPage.verifyIfTextBoxIsDisabled();
		textBoxPage.clearTheTypedText();
		textBoxPage.retrieveTheTypedText();
	}
}
