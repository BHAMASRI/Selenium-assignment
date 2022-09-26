package seleniumAssignment;

import pages.waitPage;

public class waitTextCase extends BaseClass{
	public static void main(String[] args) throws InterruptedException {
		initialization("https://leafground.com/waits.xhtml");
		waitPage waitpage = new waitPage();
		Thread.sleep(1000);
		}

}
