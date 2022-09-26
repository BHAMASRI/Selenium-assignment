package testCases;

import pages.tablePage;
import seleniumAssignment.BaseClass;

public class TC_009_Table extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		initialization("https://leafground.com/table.xhtml;jsessionid=node0efwove2iiufeco8no1d2d4ho339093.node0");
		tablePage tablepage = new tablePage();
		tablepage.content();
		tablepage.given();
		tablepage.printDetails();
		
	}

}
