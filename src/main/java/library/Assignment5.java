package library;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class Assignment5 {
	
	@Test(enabled = true)
	public void enableTrueCase() throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "E:\\Selenium Projects\\msedgedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.automationanywhere.com/");
		boolean cookies = driver.findElement(By.id("onetrust-accept-btn-handler")).isDisplayed();
		if (cookies == true) {
			driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		}
		boolean logName = driver
				.findElement(By.xpath("//img[@src='/sites/default/files/images/default-images/logo-aa-new.svg']"))
				.isDisplayed();
		System.out.println("logo is present  " + logName);
		boolean requestDemo = driver
				.findElement(By.xpath("//a[@class='coh-link coh-style-solid-orange-button btn-link']")).isDisplayed();
		System.out.println("Request Demo button is avalilable  " + requestDemo);
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(6));
		wt.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//a[@class='coh-link coh-style-solid-orange-button btn-link']")));
		driver.close();

	}

	@Test(priority = 1)
	public void priority1Case() throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "E:\\Selenium Projects\\msedgedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.automationanywhere.com/");
		boolean cookies = driver.findElement(By.id("onetrust-accept-btn-handler")).isDisplayed();
		if (cookies == true) {
			driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		}
		for (int i = 0; i <= 4; i++) {
			System.out.println(driver.findElements(By
					.xpath("//ul[@class='coh-menu-list-container coh-unordered-list menu-level-1 coh-ce-646fa54d']/li"))
					.get(i).getText());

		}
		driver.close();

	}

	@Test(timeOut = 5000)
	public void timeoutCase() throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "E:\\Selenium Projects\\msedgedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.automationanywhere.com/");
		boolean cookies = driver.findElement(By.id("onetrust-accept-btn-handler")).isDisplayed();
		if (cookies == true) {
			driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		}
		for (int i = 0; i <= 4; i++) {
			System.out.println(driver.findElements(By
					.xpath("//ul[@class='coh-menu-list-container coh-unordered-list menu-level-1 coh-ce-646fa54d']/li"))
					.get(i).getText());
			// String clickOnLink = Keys.chord(Keys.CONTROL,Keys.ENTER);
		

		}
		
		boolean requestDemo = driver
				.findElement(By.xpath("//a[@class='coh-link coh-style-solid-orange-button btn-link']")).isDisplayed();
		System.out.println("Request Demo button is avalilable  " + requestDemo);
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(6));
		wt.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//a[@class='coh-link coh-style-solid-orange-button btn-link']")));
		
		driver.close();

	}

	@Test(enabled = false)
	public void automationanywhere1() throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "E:\\Selenium Projects\\msedgedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.automationanywhere.com/");
		boolean cookies = driver.findElement(By.id("onetrust-accept-btn-handler")).isDisplayed();
		if (cookies == true) {
			driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		}
		boolean logName = driver
				.findElement(By.xpath("//img[@src='/sites/default/files/images/default-images/logo-aa-new.svg']"))
				.isDisplayed();
		System.out.println("logo is present  " + logName);
		boolean requestDemo = driver
				.findElement(By.xpath("//a[@class='coh-link coh-style-solid-orange-button btn-link']")).isDisplayed();
		System.out.println("Request Demo button is avalilable  " + requestDemo);
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(6));
		wt.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//a[@class='coh-link coh-style-solid-orange-button btn-link']")));
		driver.close();

	}

}