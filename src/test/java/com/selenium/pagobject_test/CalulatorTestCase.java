package com.selenium.pagobject_test;

import org.testng.annotations.Test;

import com.selenium.pagobject.Calculator;
import com.selenium.pagobject.FixedDeposit;
import com.selenium.pagobject.TestBase;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class CalulatorTestCase  {

	Calculator c;
	FixedDeposit fd;

	@BeforeTest
	public void beforeTest() throws Exception {

		fd = new FixedDeposit();
		c = new Calculator();
		c.openBrowser(c.readdataPropertiesFile("browser"));
		c.exportPageObjectElement_Calculator();
	}

	@Test(priority = 0, description = "Test case to verify Addition ", groups = "Calculator")
	public void Addition() throws Exception {

		c.openApp(c.readdataPropertiesFile("url_calculator"));

		c.handleTextBox(c.txtFirstNumber, "5");
		c.handleDropDown(c.dropDownOperator, "+");
		c.handleTextBox(c.txtSecondNumber, "5");
		c.handleClickEvent(c.btnGO);

		Thread.sleep(2000);

	}

	@Test(priority = 1, description = "Test case to verify Subtraction ", groups = "Calculator")
	public void Subtraction() throws Exception {

		c.handleTextBox(c.txtFirstNumber, "4");
		c.handleDropDown(c.dropDownOperator, "-");
		c.handleTextBox(c.txtSecondNumber, "2");
		c.handleClickEvent(c.btnGO);

		Thread.sleep(2000);

	}
	
	@Test(priority = 2, description = "Test case to verify Multiplication ", groups = "Calculator")
	public void Multiplication() throws Exception {

		c.handleTextBox(c.txtFirstNumber, "3");
		c.handleDropDown(c.dropDownOperator, "*");
		c.handleTextBox(c.txtSecondNumber, "3");
		c.handleClickEvent(c.btnGO);

		Thread.sleep(2000);

	}
	
	
	@Test(priority = 3, description = "Test case to verify Division ", groups = "Calculator")
	public void Division() throws Exception {

		c.handleTextBox(c.txtFirstNumber, "10");
		c.handleDropDown(c.dropDownOperator, "/");
		c.handleTextBox(c.txtSecondNumber, "2");
		c.handleClickEvent(c.btnGO);

		Thread.sleep(2000);

	}

	@AfterTest
	public void afterTest() {
	}

}
