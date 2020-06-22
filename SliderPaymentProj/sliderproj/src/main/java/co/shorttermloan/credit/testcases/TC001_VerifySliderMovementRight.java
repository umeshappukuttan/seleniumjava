package co.shorttermloan.credit.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import co.shorttermloan.credit.pages.ShortTermLoanPage;
import co.shorttermloan.credit.testng.api.base.ProjectSpecificMethods;

public class TC001_VerifySliderMovementRight extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setValues() {
		testCaseName = "Verify Slider Movement Right";
		testDescription = "Launch Short Term Loan Url to verify Slider Movement Right";
		nodes = "Slider Panel";
		authors = "Umesh";
		category = "Smoke";
		dataSheetName = "TC001";
		
	}
	
	@Test(dataProvider = "fetchData")
	public void VerifySliderMove(String xaxis, String yaxis) throws Exception {
		new ShortTermLoanPage(driver, node, test)
		.draganddropright(xaxis,yaxis)
		.getLoanAmount();
	}

}
