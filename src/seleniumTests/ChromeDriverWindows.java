package seleniumTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class ChromeDriverWindows {
	WebDriver driver;
	String baseUrl;
	static Logger log = Logger.getLogger(ChromeDriverWindows.class);
	
	@BeforeClass
	public void setUp() throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\George\\workspace\\selenium-demo\\libs\\chromedriver.exe");
		driver = new ChromeDriver();
		baseUrl = "https://demostore.x-cart.com/";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test(groups = {"search", "checkout"})
	public void search() {
		driver.get(baseUrl);
		driver.findElement(By.xpath("//div[@id='search']//input[@id='substring-default']")).sendKeys("Iron Man");
		driver.findElement(By.xpath("//div[@id='search']//input[@id='substring-default']//parent::span//parent::div/following-sibling::button")).click();
		WebElement productPhoto = driver.findElement(By.xpath("//ul[@class='products-grid grid-list']//div[@class='product-photo']"));
		Actions action = new Actions(driver);
		// move mouse cursor over photo to bring up pop-up menu
		action.moveToElement(productPhoto).perform();
	}
	
	@Test
	public void checkout(){
		
	}
	@AfterClass
	public void tearDown() throws Exception{
		driver.quit();
	}

}
