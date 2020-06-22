package co.shorttermloan.credit.testng.api.base;

import java.io.IOException;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import co.shorttermloan.credit.api.base.SeleniumBase;

import utils.DataLibrary;

public class ProjectSpecificMethods extends SeleniumBase {
	
	public String dataSheetName;		

	@DataProvider(name = "fetchData")
	public Object[][] fetchData() throws IOException {
		return DataLibrary.readExcelData(dataSheetName);
	}	

	@BeforeMethod
	public void beforeMethod() {
		driver = startApp("chrome", "https://www.auden.co.uk/Credit/ShortTermLoan");
		node = test.createNode(testCaseName);
	}

	@AfterMethod
	public void afterMethod() throws Exception {
		Thread.sleep(1000);
		close();
	}

}
