package testCases;

import pages.alertPage;
import seleniumAssignment.BaseClass;

public class TC_008_Alert extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException {
		initialization("https://leafground.com/alert.xhtml;jsessionid=node0jo7knr2gl60o184y1hxd7y04t338914.node0");
		alertPage alertpage = new alertPage();
		alertpage.alertSimpleDialog();
		alertpage.alertConfirmDialog();
		alertpage.sweetAlertSimpleDialog();
	}

}
