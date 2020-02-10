import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SkyClsDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\LSA\\Tools\\Selenium\\Drivers\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skyid.sky.com/signup/skycom");
		driver.findElement(By.cssSelector("select#formField selectFormField"));
		WebElement titleDropDown = driver.findElement(By.xpath("//*[@id='title']"));
		Select titledd = new Select(titleDropDown);
		titledd.selectByValue("Mr");
		titledd.selectByIndex(3);
	    titledd.selectByVisibleText("Rev");
	}

}
