package com.selenium.pagobject_test;

import org.testng.annotations.Test;

import com.selenium.pagobject.FixedDeposit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;



public class FixedDepositTestCase {

	FixedDeposit fd;

	@BeforeTest
	public void beforeTest() {

		fd = new FixedDeposit();
		fd.openBrowser("chrome");
		fd.exportPageObjectElement();

	}

	@Test(priority = 0, description = "Test case to verify fixed deposit for '100000'",groups="Fixed Deposit")
	public void fd_100000() throws Exception {

		fd.openApplication(fd.readdataPropertiesFile("url_fd"));

		fd.handleTextBox(fd.txtPrincipal, "100000");
		fd.handleTextBox(fd.txtInterest, "8");
		fd.handleTextBox(fd.txtTenure, "2");

		fd.handleDropDown(fd.dropDrownTenurePeriod, "year(s)");
		fd.handleDropDown(fd.dropDrownFrequency, "Simple Interest");

		fd.handleClickEvent(fd.btnCalculate);

		fd.waitSec(2);

	//	System.out.println("Maturity Value : " + fd.getTextWebElement(fd.maturityValue));
//		System.out.println("Page Title is : " + fd.getCurrentPageTitle());

		
		
		
	}

	@Test(priority = 1, description = "Test case to verify fixed deposit for '200000'",groups="Fixed Deposit")
	public void fd_200000() throws Exception {

		fd.openApplication(fd.readdataPropertiesFile("url_fd"));

		fd.handleTextBox(fd.txtPrincipal, "200000");
		fd.handleTextBox(fd.txtInterest, "9");
		fd.handleTextBox(fd.txtTenure, "4");

		fd.handleDropDown(fd.dropDrownTenurePeriod, "year(s)");
		fd.handleDropDown(fd.dropDrownFrequency, "Simple Interest");

		fd.handleClickEvent(fd.btnCalculate);

		fd.waitSec(2);

		System.out.println("Maturity Value : " + fd.getTextWebElement(fd.maturityValue));

		
	}
	
	
	@Test(priority = 2, description = "Test case to verify fixed deposit for '300000'",groups="Fixed Deposit")
	public void fd_300000() throws Exception {

		fd.openApplication(fd.readdataPropertiesFile("url_fd"));

		fd.handleTextBox(fd.txtPrincipal, "300000");
		fd.handleTextBox(fd.txtInterest, "8.5");
		fd.handleTextBox(fd.txtTenure, "3");

		fd.handleDropDown(fd.dropDrownTenurePeriod, "year(s)");
		fd.handleDropDown(fd.dropDrownFrequency, "Simple Interest");

		fd.handleClickEvent(fd.btnCalculate);

		fd.waitSec(2);

		System.out.println("Maturity Value : " + fd.getTextWebElement(fd.maturityValue));

		
	}


	@AfterTest
	public void afterTest() {

		//fd.closeBrowser();
	}

}
