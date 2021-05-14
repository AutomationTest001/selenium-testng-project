package com.selenium.pagobject;

import java.io.File;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FixedDeposit extends TestBase {

	
	@FindBy(id = "principal")
	public WebElement txtPrincipal;

	@FindBy(name = "interest")
	public WebElement txtInterest;

	@FindBy(css = "input#tenure")
	public WebElement txtTenure;

	@FindBy(name = "tenurePeriod")
	public WebElement dropDrownTenurePeriod;

	@FindBy(id = "frequency")
	public WebElement dropDrownFrequency;

	@FindBy(xpath = "//*[@id=\"fdMatVal\"]/div[2]/a[1]/img")
	public WebElement btnCalculate;

	@FindBy(xpath = "//*[@id=\"resp_matval\"]/strong")
	public WebElement maturityValue;

	
	

	public void exportPageObjectElement() {

		PageFactory.initElements(w, this);
	}

}
