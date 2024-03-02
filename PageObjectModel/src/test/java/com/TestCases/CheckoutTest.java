package com.TestCases;

import org.testng.annotations.Test;

import com.Base.BrowserSetup;
import com.POM.CheckoutOrderPage;

public class CheckoutTest extends BrowserSetup
{

	SearchProductTest spt;
	CheckoutOrderPage cop;
	
	@Test
	public void fillcheckoutdetails() throws InterruptedException
	{
		spt = new SearchProductTest();
		spt.searchProduct();
		
		cop = new CheckoutOrderPage(driver);
		
		cop.enterbillinguserfirstname("Test");
		Thread.sleep(2000);
		
		cop.enterbillinguserlastname("QA");
		Thread.sleep(2000);
		
		cop.enterbillingusercompanyname("Mark14");
		Thread.sleep(2000);
		
		cop.enterbillinguseraddress("1st Avenue CA");
		Thread.sleep(2000);
		
		cop.enterbillingusercity("Hyderabad");
		Thread.sleep(2000);
		
		cop.enterbillinguserpostcode("500001");
		Thread.sleep(2000);
		
		cop.selectbillingusercountry();
		Thread.sleep(2000);
		
		cop.enterbillinguserstate();
		Thread.sleep(2000);
		
		cop.clickonnextbuttoninbillingpage();
		Thread.sleep(2000);
		
		cop.selectaddress();
		Thread.sleep(2000);
		
		cop.clickoncontinuebutton2nd();
	}
}
