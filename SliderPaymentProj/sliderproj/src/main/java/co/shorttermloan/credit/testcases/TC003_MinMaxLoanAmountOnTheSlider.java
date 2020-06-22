package co.shorttermloan.credit.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import co.shorttermloan.credit.pages.ShortTermLoanPage;
import co.shorttermloan.credit.testng.api.base.ProjectSpecificMethods;

public class TC003_MinMaxLoanAmountOnTheSlider extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setValues() {
		testCaseName = "Minimum and Maximum Slider Loan Amount Verification";
		testDescription = "Minimum and Maximum Slider Loan Amount";
		nodes = "Slider Panel";
		authors = "Umesh";
		category = "Smoke";
		dataSheetName = "TC003";
		
	}
	
	@Test(dataProvider = "fetchData")
	public void VerifySliderMove(String xaxis, String yaxis) throws Exception {
		new ShortTermLoanPage(driver, node, test)
		.getLoanAmount() // Min Loan value
		.draganddropleft(xaxis,yaxis)
		.getLoanAmount(); // Max Loan value
	}

}
