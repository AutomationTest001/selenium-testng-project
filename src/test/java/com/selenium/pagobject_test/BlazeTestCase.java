package com.selenium.pagobject_test;

import org.testng.annotations.Test;

import com.selenium.pagobject.Blaze;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

@Listeners(com.selenium.pagobject.ListenersCode.class)

public class BlazeTestCase {

	Blaze b;

	@BeforeTest
	public void beforeTest() throws Exception {
		b = new Blaze();
		b.openBrowser(b.readdataPropertiesFile("browser"));
		b.exportPageObjectElement_Blaze();
	}

	@Test(priority = 0, description = "Test to select flight from and to functioanlity",groups="Blaze")
	public void Blazedemo_flight() throws Exception {

		b.openApp(b.readdataPropertiesFile("url_blaze"));

		b.handleDropDown(b.dropDownfromPort, "Boston");
		b.handleDropDown(b.dropDowntoPort, "London");
	}

	@Test(priority = 1, description = "Test to verify flight from and to - detail functioanlity",groups="Blaze")
	public void Blazedemo_flight_Info() throws Exception {

		b.handleClickEvent(b.btnFindFlights);
		b.waitSec(2);

	}

	@Test(priority = 2, description = "Test to verify flight price and tax with user info functioanlity",groups="Blaze")
	public void Blazedemo_userInfo() throws Exception {

		b.handleClickEvent(b.btChooseThisFlight);
		b.waitSec(2);
	//	Assert.assertEquals(actual, expected);

	}

	@AfterTest
	public void afterTest() {
	}

}
