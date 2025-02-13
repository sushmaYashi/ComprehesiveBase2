package library;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment4 {


	public static void main(String[] args) throws InterruptedException {
		
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
	
//			driver.findElements(By
//					.xpath("//ul[@class='coh-menu-list-container coh-unordered-list menu-level-1 coh-ce-646fa54d']/li"))
//					.get(i).click();
//			System.out.println(driver.getTitle());
		//	driver.navigate().back();

		}
		driver.close();

	}

}
