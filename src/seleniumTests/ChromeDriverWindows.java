package seleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverWindows {

	public static void main(String[] args) {
		String baseURL = "http://letskodeit.teachable.com/p/practice";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\George\\workspace\\selenium-demo\\libs\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(baseURL);
		System.out.println(driver.findElement(By.xpath(".//*[@id='product']/tbody/tr[3]/td[2]/following-sibling::td")).getText());
	}

}

