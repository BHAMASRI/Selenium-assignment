package testCases;

import pages.gridPage;

import seleniumAssignment.BaseClass;

public class TC_010_Grid extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		initialization("https://leafground.com/grid.xhtml");
		gridPage gridpage = new gridPage();
		gridpage.product();
		
	}

}
