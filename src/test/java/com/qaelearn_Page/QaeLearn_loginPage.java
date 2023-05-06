package com.qaelearn_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class QaeLearn_loginPage {

	WebDriver driver;

	public QaeLearn_loginPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//input[@name='username']")
	private WebElement Email;

	public WebElement getEmail(String enterEmail) {
		Email.sendKeys(enterEmail);
		return Email;
	}

	@FindBy(how = How.XPATH, using = "//input[@name='password']")
	private WebElement Password;

	public WebElement getPassword(String enterPaassword) throws InterruptedException {
		Thread.sleep(2000);
		Password.sendKeys(enterPaassword);
		return Password;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"kt_login_signin_submit\"]")
	private WebElement SignIn;

	public WebElement getSignIn() throws InterruptedException {
		Thread.sleep(5000);
		SignIn.click();
		return SignIn;
	}

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div[1]/div[2]/div[1]/div[1]/div/ul/li[1]/a/span")
	private WebElement Invoice;

	public WebElement getNewInvoice() throws InterruptedException {
		Thread.sleep(5000);
		Invoice.click();
		return Invoice;
	}

	@FindBy(how = How.XPATH, using = "//a[@data-toggle='modal']")
	private WebElement NewCustomer;

	public WebElement getNewCustomer() {
		NewCustomer.click();
		return NewCustomer;
	}

	/*
	 * @FindBy(how = How.XPATH, using = "//*[@id='date']") private WebElement Date;
	 * 
	 * public WebElement getDate() { Date.click(); return Date; }
	 */

	@FindBy(how = How.XPATH, using = "//*[@id='name']")
	private WebElement Name;

	public WebElement getName(String enterName) throws InterruptedException {
		Thread.sleep(3000);
		Name.sendKeys(enterName);
		return Name;
	}

	@FindBy(how = How.XPATH, using = "//*[@id='mobile']")
	private WebElement Mobile;

	public WebElement getMobileNm(String entermobile) {
		Mobile.sendKeys(entermobile);
		return Mobile;
	}

	@FindBy(how = How.XPATH, using = "//*[@id='email']")
	private WebElement EmailAddress;

	public WebElement getEmailAddress(String enterEmailAddress) {
		EmailAddress.sendKeys(enterEmailAddress);
		return EmailAddress;
	}

	@FindBy(how = How.XPATH, using = "//*[@id='initial_val']")
	private WebElement Balance;

	public WebElement getBalance(String enterBalance) {
		Balance.sendKeys(enterBalance);
		return Balance;
	}

	@FindBy(how = How.XPATH, using = "//*[@id='address']")
	private WebElement Address;

	public WebElement getAddress(String enterAddress) {
		Address.sendKeys(enterAddress);
		return Address;
	}

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary save-customer']")
	private WebElement SaveButton;

	public WebElement getSaveButton() {
		SaveButton.click();
		return SaveButton;
	}

}
