package co.shorttermloan.credit.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import co.shorttermloan.credit.pages.ShortTermLoanPage;
import co.shorttermloan.credit.testng.api.base.ProjectSpecificMethods;

public class TC004_VerifyRepaymentDateForWeekendDay  extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setValues() {
		testCaseName = "Verify Repayment Date is not weekend";
		testDescription = "Repayment Date is not weekend though the user select the repayment day as weekend";
		nodes = "Slider Panel";
		authors = "Umesh";
		category = "Smoke";
		dataSheetName = "TC004";
		
	}
	
	@Test(dataProvider = "fetchData")
	public void VerifyWeekendPayDate(String xaxis, String yaxis) throws Exception {
		new ShortTermLoanPage(driver, node, test)
		.draganddropleft(xaxis,yaxis)
		.getLoanAmount()
		.clickWeekEndDt()
		.getRepaymentDate()
		.weekendNoRepayValidation();
	}

}
