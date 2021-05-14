package com.selenium.pagobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Blaze extends TestBase {

	@FindBy(name = "fromPort")
	public WebElement dropDownfromPort;

	@FindBy(name = "toPort")
	public WebElement dropDowntoPort;

	@FindBy(xpath = "//input[@value='Find Flights']")
	public WebElement btnFindFlights;

	@FindBy(css = "input[value='Choose This Flight']")
	public WebElement btChooseThisFlight;

	public void openApp(String url) {
		w.get(url);

	}

	public void exportPageObjectElement_Blaze() {

		PageFactory.initElements(w, this);
	}

}
