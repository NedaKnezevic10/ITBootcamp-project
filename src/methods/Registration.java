package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Registration {

	public static final String RegURL = "http://automationpractice.com/index.php?controller=authentication&multi-shipping=0&display_guest_checkout=0&back=http%3A%2F%2Fautomationpractice.com%2Findex.php%3Fcontroller%3Dorder%26step%3D1%26multi-shipping%3D0";
	public static final String EMAIL_ADDRESS_PATH = "//input[@id='email_create']";
	public static final String EMAIL_ADDRESS2_PATH = "//input[@id='email']";
	public static final String REG_BUTTON_XPATH = "//span[contains(text(),'Register')]";
	public static final String SIGNOUT_XPATH = "//a[@class='logout']";
	public static final String SIGN_IN = "//p[@class='submit']//span[1]";
	
	// metode za popunjavanje polja za registraciju korisnika, kao i za kliktanje na potrebna polja da si se registrovalo ili ulogovalo

	public static void clickEmail1(WebDriver driver, String email) {
		driver.findElement(By.xpath(EMAIL_ADDRESS_PATH)).sendKeys(email);
		driver.findElement(By.id("SubmitCreate")).click();

	}

	public static void addName(WebDriver driver, String name) {
		driver.findElement(By.id("customer_firstname")).sendKeys(name);
	}

	public static void regBtn(WebDriver driver) {
		driver.findElement(By.xpath(REG_BUTTON_XPATH)).click();
	}

	public static void signOut(WebDriver driver) {
		driver.findElement(By.xpath(SIGNOUT_XPATH)).click();
	}

	public static void addLastName(WebDriver driver, String last_name) {
		driver.findElement(By.id("customer_lastname")).sendKeys(last_name);
	}

	public static void addPass(WebDriver driver, String pass) {
		driver.findElement(By.id("passwd")).sendKeys(pass);
	}

	public static void addAddress(WebDriver driver, String adr1) {
		driver.findElement(By.name("address1")).sendKeys(adr1);
	}

	public static void addCity(WebDriver driver, String city) {
		driver.findElement(By.name("city")).sendKeys(city);
	}

	public static void addZip(WebDriver driver, String zip) {
		driver.findElement(By.id("postcode")).sendKeys(zip);
	}

	public static void addMob(WebDriver driver, String mob) {
		driver.findElement(By.id("phone_mobile")).sendKeys(mob);
	}

	public static void addAddress2(WebDriver driver, String adr2) {
		driver.findElement(By.id("alias")).sendKeys(adr2);
	}

	public static void addState(WebDriver driver, String state) {
		driver.findElement(By.id("id_state")).sendKeys(state);
	}

	public static void signIn1(WebDriver driver) {
		driver.findElement(By.linkText("Sign in")).click();
	}

	public static void email2(WebDriver driver, String email2) {
		driver.findElement(By.xpath(EMAIL_ADDRESS2_PATH)).sendKeys(email2);
	}

	public static void submit(WebDriver driver) {
		driver.findElement(By.id("SubmitCreate")).click();
	}

	public static void signIn2(WebDriver driver) {
		driver.findElement(By.xpath(SIGN_IN)).click();
	}

	// driver.findElement(By.id("passwd")).sendKeys(pass);

}
