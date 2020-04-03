package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import methods.BuyDress;
import methods.WomanDresses;

public class HomePageTest {
	private static WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "/home/neda/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
	}

	// testiram da li ako misem stanem na karticu "woman" i odabirom "summer
	// dresses" dolazim do stranice "summer dresses"
	@Test
	public void WomanDressesPageURL1() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(WomanDresses.HOME_URL);

		WomanDresses.clickWmnBtn(driver);
		String current = driver.getCurrentUrl();
		String expected = "http://automationpractice.com/index.php?id_category=11&controller=category";
		Assert.assertEquals(current, expected);

	}

	// testiram da li ako misem stanem na karticu "dresses" i odabirom "summer
	// dresses" dolazim do stranice "summer dresses"
	@Test
	public void WomanDressesPageURL2() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(WomanDresses.HOME_URL);

		WomanDresses.clickDrsBtn(driver);
		String current1 = driver.getCurrentUrl();
		String expected1 = "http://automationpractice.com/index.php?id_category=11&controller=category";
		Assert.assertEquals(current1, expected1);

	}

	// test da li se na oba gore pisana nacina dolazi do iste stranice "summer
	// dresses" - test uspesan
	@Test
	public void leadSameURL() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(WomanDresses.HOME_URL);
		String currentw = WomanDresses.clickWmnBtn(driver);
		driver.get(WomanDresses.HOME_URL);
		String currentd = WomanDresses.clickDrsBtn(driver);

		SoftAssert sa = new SoftAssert();
		sa.assertEquals(currentw, currentd);

	}

	@AfterClass
	public void closeChrome() {
		driver.close();
	}

}
