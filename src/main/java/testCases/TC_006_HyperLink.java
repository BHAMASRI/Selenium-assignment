package testCases;

import pages.hyperlinkPage;
import seleniumAssignment.BaseClass;

public class TC_006_HyperLink extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		initialization("https://leafground.com/link.xhtml");
		hyperlinkPage hyperlinkpage = new hyperlinkPage();
		hyperlinkPage.link();
		hyperlinkPage.takeToDashboard();
		hyperlinkPage.findMyDestination();
		hyperlinkPage.duplicateLink();
		hyperlinkPage.brokenLink();
		hyperlinkPage.countLinks();
		
			}

}
