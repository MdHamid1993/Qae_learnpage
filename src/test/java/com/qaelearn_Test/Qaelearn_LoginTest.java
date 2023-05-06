package com.qaelearn_Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.BaseTest.BaseTest;
import com.qaelearn_Page.QaeLearn_loginPage;

public class Qaelearn_LoginTest extends BaseTest {

	WebDriver driver;

	QaeLearn_loginPage q;

	@BeforeTest
	public void init() {
		driver = openChrome();
		// driver = openEdge();
		//driver = openFireFox();
	}

	@Test
	public void signinpage() throws InterruptedException {
		q = new QaeLearn_loginPage(driver);
		q.getEmail("admin");
		q.getPassword("admin_test");
		q.getSignIn();
		q.getNewInvoice();
		q.getNewCustomer();
		// q.getDate();
		q.getName("hamid");
		q.getMobileNm("0177254656");
		q.getEmailAddress("abc@gmail.com");
		q.getBalance("one lac taka");
		q.getAddress("uposhahor, Block-h,Road-02");
		q.getSaveButton();
	}

}
