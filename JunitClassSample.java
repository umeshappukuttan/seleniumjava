import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitClassSample {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("This is Before Class");
	}
	
	@Before
	public  void Before() {
		System.out.println("This is Before");
	}
	
	@After
	public  void After1 () {
		System.out.println("This is After");
	}
	
	@Test
	public void StartingTest() {
		System.out.println("This is Test Class");
	}
	
	@After
	public  void After() {
		System.out.println("This is After");
	}
	
	@AfterClass
	public static void AfterClass() {
		System.out.println("This is After Class");
	}

}
