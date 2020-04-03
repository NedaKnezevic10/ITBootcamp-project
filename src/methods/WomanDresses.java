package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WomanDresses {

	public static final String HOME_URL = "http://automationpractice.com/index.php";
	public static final String WOMAN_HOVER_XPATH = "//a[@class='sf-with-ul'][contains(text(),'Women')]";
	public static final String WOMAN_BTN_XPATH = "//ul[@class='submenu-container clearfix first-in-line-xs']//ul//li//a[contains(text(),'Summer Dresses')]";
	public static final String DRESSES_HOVER_XPATH = "//*[@id=\"block_top_menu\"]/ul/li[2]/a";;
	public static final String DRESSES_BTN_XPATH = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/ul/li[3]/a";

	
	//metoda da se misem stane na zeljeno polje, a zatim klikne na opciju koja dovodi do zeljene stranice "summer dresses"
	
	public static String clickWmnBtn(WebDriver driver) {
		Actions action = new Actions(driver);
		WebElement elem = driver.findElement(By.xpath(WOMAN_HOVER_XPATH));
		action.moveToElement(elem).perform();
		WebElement wmnBtn = driver.findElement(By.xpath(WOMAN_BTN_XPATH));
		wmnBtn.click();
		String currentWmn = driver.getCurrentUrl();
		return currentWmn;
	}

	public static String clickDrsBtn(WebDriver driver) {
		Actions action = new Actions(driver);
		WebElement elem = driver.findElement(By.xpath(DRESSES_HOVER_XPATH));
		action.moveToElement(elem).perform();
		WebElement wmnBtn = driver.findElement(By.xpath(DRESSES_BTN_XPATH));
		wmnBtn.click();
		String currentDrs = driver.getCurrentUrl();
		return currentDrs;

	}

}
