package library;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EdgeBrowserLaunch {

	public static void main(String[] args) {

System.setProperty("webdriver.edge.driver", "E:\\Selenium Projects\\msedgedriver.exe");
System.setProperty("webdriver.http.factory", "jdk-http-client");

WebDriver driver = new EdgeDriver();
driver.manage().window().maximize();

//driver.manage().deleteAllCookies();

driver.get("https://www.automationanywhere.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
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


//////////////////////////////////////////
//WebElement cookieAccept = driver.findElement(By.xpath("//*[@id='onetrust-accept-btn-handler']"));
//
//// Explicit Wait
//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
//
//wait.until(ExpectedConditions.visibilityOf(cookieAccept));
//
//wait.until(ExpectedConditions.elementToBeClickable(cookieAccept));
//
//cookieAccept.click();
//
//
//
//
//
////driver.findElement(By.linkText("https://www.automationanywhere.com/")); 
//////locator for Google search button
//WebElement searchIcon = driver.findElement(By.linkText("Request Demo"));
//searchIcon.click();


	}

}
