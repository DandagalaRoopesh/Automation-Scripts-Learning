package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NextConcept1 {

	public static String browser = "chrome";
	public static WebDriver driver;

	public static void main(String[] args) {

		if (browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		driver.get("http://heimdall3.ddns.net:3001/");
		WebElement password = driver.findElement(By.id("outlined-adornment-password"));
		driver.findElement(RelativeLocator.with(By.tagName("input")).above(password))
				.sendKeys("Fitness@connvertex.com");
		
		WebElement username = driver.findElement(By.tagName("input"));
		driver.findElement(RelativeLocator.with(By.id("outlined-adornment-password")).below(username))
				.sendKeys("Fitness@123");
		
		WebElement CheckIcon = driver.findElement(By.id("outlined-adornment-password"));
		driver.findElement(RelativeLocator.with(By.className("MuiSvgIcon-root")).toRightOf(CheckIcon)).click();
		
		WebElement RememberMe = driver.findElement(By.id("outlined-adornment-password"));
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(RememberMe)).click();
		
		WebElement button = driver.findElement(By.id("outlined-adornment-password"));
		driver.findElement(RelativeLocator.with(By.tagName("button")).below(button)).click();

	}

}
