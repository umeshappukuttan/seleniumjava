 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelnDemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\LSA\\Tools\\Selenium\\Drivers\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String Titles = driver.getTitle();
		String urls = driver.getCurrentUrl();
		String pgsrc = driver.getPageSource();
		System.out.println("The Web Page Title :" + Titles);
		System.out.println("The Web Page Url :" + urls);
		System.out.println("The Web Page pgsrc :" + driver.getClass());
		if(Titles.equals("Facebook – log in or sign up"))
		{
			System.out.println("Test Case Got Passed - The Web Page Title :" + Titles);
		}
		else
		{
			System.out.println("Test Case Got Failed");
		}
		//Locator By ID
		driver.findElement(By.id("email")).sendKeys("aumesh@gmail.com");
		Thread.sleep(5000);
		//Locator by Name
		driver.findElement(By.name("pass")).sendKeys("Password");
		Thread.sleep(5000);
		//Locator By Partial Test
		driver.findElement(By.partialLinkText("Forgotten")).click();
		Thread.sleep(5000);
		System.out.println(""+driver.getTitle());
		driver.quit();
		driver.close(); 
		
	}

}
