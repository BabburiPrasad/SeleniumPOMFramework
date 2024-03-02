package com.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.Base.BrowserSetup;

public class SearchProductPage extends BrowserSetup
{
	By searchtextboxloc = By.xpath("//input[@placeholder='Search']");
	By searchbuttonloc = By.xpath("//button[@class='btn btn-default btn-lg']");
	By getproductloc = By.xpath("//a[text()='MacBook Pro']");
	By addtocartloc = By.xpath("//button[@id='button-cart']");
	By cartitemsloc = By.xpath("//span[@id='cart-total']");
	By viewcartloc = By.xpath("//strong[text()=' View Cart']");
	By checkoutloc = By.xpath("//a[text()='Checkout']");
	
	
	public SearchProductPage(WebDriver driver)
	{
		BrowserSetup.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void entersearchInput(String SearchInput)
	{
		driver.findElement(searchtextboxloc).sendKeys(SearchInput);
	}
	
	public void clickOnSearch()
	{
		driver.findElement(searchbuttonloc).click();
	}

	public void selectProduct()
	{
		driver.findElement(getproductloc).click();
	}
	
	public void addproducttocart()
	{
		driver.findElement(addtocartloc).click();
	}
	
	public void viewCart() throws InterruptedException
	{
		driver.findElement(cartitemsloc).click();
		Thread.sleep(1500);
		driver.findElement(viewcartloc).click();
	}
	
	public void clickonCheckout()
	{
		driver.findElement(checkoutloc).click();
	}
}
