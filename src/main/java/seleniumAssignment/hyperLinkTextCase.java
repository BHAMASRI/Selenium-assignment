package seleniumAssignment;

import pages.hyperlinkPage;

public class hyperLinkTextCase extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		initialization("https://leafground.com/link.xhtml");
		hyperlinkPage hyperlinkpage = new hyperlinkPage();
		Thread.sleep(1000);
		}

}
