package com.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.Base.BrowserSetup;

public class CheckoutOrderPage extends BrowserSetup
{
	
	By userfirstname = By.xpath("//input[@id='input-payment-firstname']");
	By userlastname = By.xpath("//input[@id='input-payment-lastname']");
	By usercompanyname = By.xpath("//input[@id='input-payment-company']");
	By useraddress = By.xpath("//input[@id='input-payment-address-1']");
	By usercity = By.xpath("//input[@id='input-payment-city']");
	By userpostcode = By.xpath("//input[@id='input-payment-postcode']");
	By usercountrydropdown = By.xpath("//select[@id='input-payment-country']");
	By usercountryselect = By.xpath("//option[text()='India']");
	By userregion = By.xpath("//select[@id='input-payment-zone']");
	By selectbillinguserstate = By.xpath("//option[text()='Telangana']");
	By nextbutton = By.xpath("//input[@id='button-payment-address']");
	
	By iwanttouseexistingaddressrarioloc = By.xpath("(//div[@class='radio'])[1]");
	By billingcontinuebuttonloc = By.xpath("//input[@value='Continue']");
	
	
	public CheckoutOrderPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterbillinguserfirstname(String firstname)
	{
		driver.findElement(userfirstname).sendKeys(firstname);
		
	}
	
	public void enterbillinguserlastname(String lastname)
	{
		driver.findElement(userlastname).sendKeys(lastname);
	}
	
	public void enterbillingusercompanyname(String companyname)
	{
		driver.findElement(usercompanyname).sendKeys(companyname);
	}
	
	public void enterbillinguseraddress(String address)
	{
		driver.findElement(useraddress).sendKeys(address);
	}
	
	public void enterbillingusercity(String city)
	{
		driver.findElement(usercity).sendKeys(city);
	}
	
	public void enterbillinguserpostcode(String postcode)
	{
		driver.findElement(userpostcode).sendKeys(postcode);
	}
	
	public void selectbillingusercountry()
	{
		driver.findElement(usercountrydropdown).click();
		driver.findElement(usercountryselect).click();
	}
	
	public void enterbillinguserstate()
	{
		driver.findElement(userregion).click();
		driver.findElement(selectbillinguserstate).click();
	}
	
	public void clickonnextbuttoninbillingpage()
	{
		driver.findElement(nextbutton).click();
	}
	
	public void selectaddress()
	{
		driver.findElement(iwanttouseexistingaddressrarioloc).click();
	}
	
	public void clickoncontinuebutton2nd()
	{
		driver.findElement(billingcontinuebuttonloc).click();
	}

}
