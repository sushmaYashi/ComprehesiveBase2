
	
	package library;
	import java.time.Duration;
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class Question4 {

		public static void main(String[] args) {

	System.setProperty("webdriver.edge.driver", "E:\\Selenium Projects\\msedgedriver.exe");
	System.setProperty("webdriver.http.factory", "jdk-http-client");

	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();

	//driver.manage().deleteAllCookies();

	driver.get("https://www.automationanywhere.com/");
	
	WebElement category_Product = driver.findElement(By.xpath("//a[normalize-space()='Products']"));
	WebElement page_Product = driver.findElement(By.xpath("//h4[normalize-space()='Platform']"));

	WebElement category_Solutions = driver.findElement(By.xpath("//a[normalize-space()='Solutions']"));
	WebElement page_Solutions = driver.findElement(By.xpath("//h1[normalize-space()='Automation Anywhere Solutions']"));

	WebElement category_Resources = driver.findElement(By.xpath("//a[normalize-space()='Resources']"));
	WebElement page_Resources = driver.findElement(By.xpath("//h1[normalize-space()='AI + Automation Resources']"));

	WebElement category_Customers = driver.findElement(By.xpath("//span[@class='coh-link nav-head-link js-coh-menu-item-link no-link-nav']"));

	WebElement category_Company = driver.findElement(By.xpath("//a[normalize-space()='Company']"));
	WebElement page_Company = driver.findElement(By.xpath("//h2[normalize-space()='We define the future of work.']"));

	
	//WebElement cookieAccept = driver.findElement(By.xpath("//button[text()='onetrust-accept-btn-handler']"));

	WebElement cookieAccept = driver.findElement(By.xpath("//*[@id='onetrust-accept-btn-handler']"));

	// Explicit Wait
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

	wait.until(ExpectedConditions.visibilityOf(cookieAccept));

	wait.until(ExpectedConditions.elementToBeClickable(cookieAccept));

	cookieAccept.click();

	
	wait.until(ExpectedConditions.visibilityOf(category_Product));

	wait.until(ExpectedConditions.elementToBeClickable(category_Product));

	category_Product.click();
	

//wait.until(ExpectedConditions.visibilityOf(page_Product));
	
	wait.until(ExpectedConditions.visibilityOf(category_Solutions));

	wait.until(ExpectedConditions.elementToBeClickable(category_Solutions));

	category_Solutions.click();
	wait.until(ExpectedConditions.visibilityOf(page_Solutions));
	
	wait.until(ExpectedConditions.visibilityOf(category_Resources));

	wait.until(ExpectedConditions.elementToBeClickable(category_Resources));

	category_Resources.click();
	wait.until(ExpectedConditions.visibilityOf(page_Resources));
	
	
	wait.until(ExpectedConditions.visibilityOf(category_Customers));

	wait.until(ExpectedConditions.elementToBeClickable(category_Customers));

	category_Customers.click();
	
	wait.until(ExpectedConditions.visibilityOf(category_Company));

	wait.until(ExpectedConditions.elementToBeClickable(category_Company));

	category_Company.click();
	
	wait.until(ExpectedConditions.visibilityOf(page_Company));


		}

	}

