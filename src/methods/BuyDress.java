package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BuyDress {
	
	
	public static final String Printed_dress = "//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line last-line first-item-of-tablet-line first-item-of-mobile-line last-mobile-line']//img[@class='replace-2x img-responsive']";
	public static final String QUANTITY_XPATH = "//a[@class='btn btn-default button-plus product_quantity_up']//span";
	public static final String SIZE_DROP_XPATH = "//select[@id='group_1']";
	public static final String SIZE_M = "//option[contains(text(),'M')]";
	public static final String COLOR_BLUE = "//a[@id='color_14']";
	public static final String ADD_CART = "//span[contains(text(),'Add to cart')]";
	public static final String PROCEED_CHECKOUT1 = "//span[contains(text(),'Proceed to checkout')]";
	public static final String PROCEED_CHECKOUT2 = "//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]";
	
	//metoda za stavljanje proizvoda u korpu
	
	public static void addToCart(WebDriver driver) {
		driver.findElement(By.xpath(Printed_dress)).click();
		driver.findElement(By.xpath(QUANTITY_XPATH)).click();
		driver.findElement(By.xpath(SIZE_DROP_XPATH)).click();
		driver.findElement(By.xpath(SIZE_M)).click();
		driver.findElement(By.xpath(COLOR_BLUE)).click();
		driver.findElement(By.xpath(ADD_CART)).click();
	}
	
	public static void proceedToCheckOut(WebDriver driver) {
		driver.findElement(By.xpath(PROCEED_CHECKOUT1)).click();
		driver.findElement(By.xpath(PROCEED_CHECKOUT2)).click();
	}
	
	
	
	
}
