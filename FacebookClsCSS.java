import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class FacebookClsCSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\LSA\\Tools\\Selenium\\Drivers\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input#email")).sendKeys("aumesh@gmail.com");
		driver.findElement(By.cssSelector("input#u_0_a")).click();
		// Is Displayed
		Boolean bb = driver.findElement(By.cssSelector("input#pass")).isDisplayed();
		System.out.println("The element isdisplayed :"+bb);
		// size
		int ii = driver.findElements(By.cssSelector("input#pass")).size();
		System.out.println("The element SIZE IS :"+ii);
		// is Visible
		bb = driver.findElement(By.cssSelector("input#pass")).isEnabled();
		System.out.println("The element is Enabled :"+bb);
	/*	try{
		driver.findElement(By.cssSelector("input#passm")).isEnabled();
		}
		catch{
			System.out.println("The element is not displayed");
		}*/
	}

}
