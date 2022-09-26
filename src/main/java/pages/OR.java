package pages;

public class OR {
	
	public static String leafground = "https://leafground.com/";
	public static String dashboard = "https://leafground.com/dashboard.xhtml";
	
	public static String typeYourName = "//input[@id='j_idt88:name']";
	public static String appendCountry = "//input[@id='j_idt88:j_idt91']";
	public static String verifyIfTextBox ="//input[@id='j_idt88:j_idt93']";
	public static String clearText = "//input[@id='j_idt88:j_idt95']";
	public static String retrieveText = "//input[@id='j_idt88:j_idt97']";
	
	public static String button = "https://leafground.com/button.xhtml";
	
	public static String click = "//button[@name='j_idt88:j_idt90']";
	public static String ButtonIsDisabled = "//button[@id='j_idt88:j_idt92']";
	public static String PositionOfTheSubmitButton = "//button[@id='j_idt88:j_idt94']";
	public static String ButtonColor = "//button[@id='j_idt88:j_idt96']";
	public static String HeightAndWidthOfThisButton = "//button[@id='j_idt88:j_idt98']";
	public static String ConfirmTheColorChanged = "//button[@id='j_idt88:j_idt100']";
	
	public static String checkBox = "//span[@class='ui-chkbox-label']";
	public static String notification = "//span[text()='Ajax']";
	public static String checkBoxIsDisabled = "//div[@id='j_idt87:j_idt102']";
	public static String toggle = "//div[@id='j_idt87:j_idt100']";
	
	public static String drop = "//select[@class='ui-selectonemenu']" ;
	public static String dropdownCountry = "//label[@id='j_idt87:country_label']";
	public static String dropdownCity = "//label[@id='j_idt87:city_label']";
	public static String dropdownLanguage = "//label[@id='j_idt87:lang_label']";
	public static String dropdownValue = "//label[@id='j_idt87:value_label']";
 
	public static String options = "//li[text()='{variable}']";
	
	public static String fav1 = "label[for='j_idt87:basic:0']";
	public static String fav2 = "label[for='j_idt87:basic:1']";
	public static String fav3 = "label[for='j_idt87:basic:2']";
	
	public static String favoriteBrowser = "label[for='j_idt87:console1:0']";
	public static String unSelectable = "label[for='j_idt87:city2:1']";
	public static String defaultSelectButton= "label[for='j_idt87:console2:2']";
	public static String selectOnlyIfNotSelect= "label[for='j_idt87:age:1']";
	
	public static String link = "https://leafground.com/link.xhtml";
	public static String takeToDashboard = "//a[text()='Go to Dashboard']";
	public static String findMyDestination = "//a[text()='Find the URL without clicking me.']";
	public static String duplicateLink = "//a[text()='Go to Dashboard']";
	public static String brokenLink = "//a[text()='Broken?']";
	public static String countLink = "//a[text()='How many links in this page?']";
	
	public static String grid = "https://leafground.com/grid.xhtml";
	
	public static String visibility = "//button[@id='j_idt87:j_idt89']";
	public static String invisibility = "//button[@id='j_idt87:j_idt92']";
	public static String clickability = "//button[@id='j_idt87:j_idt95']";
	public static String waitForTextChange = "//button[@id='j_idt87:j_idt98']";
	
	public static String alertSimpleDialog = "//button[@name='j_idt88:j_idt91']";
	public static String alertConfirmDialog = "//button[@name='j_idt88:j_idt93']";
	public static String sweetAlertSimpleDialog = "//button[@name='j_idt88:j_idt95']";
	
	public static String content = "//thead[@id='form:j_idt89_head']";
	public static String given = "//thead[@id='form:j_idt89_head']";
	public static String contents = "//tbody[@id='form:j_idt89_data']/tr";
	public static String gives = "//tr[@data-ri='3']";
	
	public static String names = "//th[@id='form:j_idt89:j_idt92']";
	public static String country = "//td[contains(text(),'{variable}')]/following-sibling::td[1]/span[3]";
	public static String representativeStatus = "//td[contains(text(),'{variable}')]/following-sibling::td[2]/span[2]";
	public static String joinDate = "//td[contains(text(),'{variable}')]/following-sibling::td[3]";
	public static String status = "//td[contains(text(),'{variable}')]/following-sibling::td[4]/span[2]";
	
	public static String clicked = "(//td[text()='{variable}']/preceding-sibling::td)[2]";
	public static String table = "//td[text()='{variable}']/parent::tr/following::tr[1]/child::td//descendant::div[3]//descendant::tbody/tr";
}

