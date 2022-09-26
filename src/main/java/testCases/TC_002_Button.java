package testCases;

import pages.buttonPage;
import seleniumAssignment.BaseClass;

public class TC_002_Button extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
	initialization("https://leafground.com/button.xhtml");
	buttonPage buttonPage = new buttonPage();
	buttonPage.clickAndConfirmTitle();
	buttonPage.confirmIfTheButtonIsDisabled();
	buttonPage.findThePositionOfTheSubmitButton();
	buttonPage.findTheSaveButtonColor();
	buttonPage.findTheHeightAndWidthOfThisButton();
	buttonPage.mouseOverAndConfirmTheColorChanged();
    
	
	}
	

}
