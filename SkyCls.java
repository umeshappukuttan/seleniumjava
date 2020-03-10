 import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SkyCls {

	WebDriver driver = null;
		
		@Before
		public void Setup()
		{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\LSA\\Tools\\Selenium\\Drivers\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skyid.sky.com/signup/skycom");
		}
		
		@Test
		public void SkySignUp()
		{	
		//Title
		WebElement titleDropDown = driver.findElement(By.xpath("//*[@id='title']"));
		Select titledd = new Select(titleDropDown);
		titledd.selectByValue("Mr");
		// Find Element Firstname and enter detils
		driver.findElement(By.xpath(".//input[@id='firstname']")).sendKeys("Umesh");
		// Find Element Lastname and enter detils
		driver.findElement(By.xpath(".//input[@name='lastname']")).sendKeys("A");
		// Find Element Email address and enter detils
		driver.findElement(By.xpath(".//input[@id='email']")).sendKeys("A@umesh.com");
		// Find Element Confirm email address and enter detils
		driver.findElement(By.xpath(".//input[@id='confirmEmail']")).sendKeys("A@umesh.com");
		// Find Element password address and enter detils
		driver.findElement(By.xpath(".//input[@id='password']")).sendKeys("password123");
		// Find Element Confirm password address and enter detils
		driver.findElement(By.xpath(".//input[@id='confirmPassword']")).sendKeys("password123");
		// Find Element First checkbox and enter detils
		driver.findElement(By.xpath(".//input[@name='termsAndConditions']")).click();
		// Find Element Second Checkbox and select
		driver.findElement(By.xpath(".//input[@name='marketingOptOut']")).click();
		// Find Element Second Checkbox and enter detils
		driver.findElement(By.className("cancelLink")).click();
		String hp = driver.getTitle();
		String hpc = "Sky TV, Broadband & Mobile | News, Sports & Movies | Sky.com";
		WebDriverWait wait = new WebDriverWait (driver, 20);
		wait.until(ExpectedConditions.ci)
		WebDriver wait = new WebDriverwait(driver,20);
		
		assertEquals(hp,hpc);
		
		/*if(hp.equals(hpc))
		{
			System.out.println("Test is Passed");
		}
		else
		{
			System.out.println("Test Is Failed");
		}*/
	}
		@After
		public void teardown()
		{
		driver.quit();
		}
}