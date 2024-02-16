package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
public class KongaSignUp extends BaseTest{
	
	@Test(dataProvider="testdata")
	public static void LoginTest(String firstname, String lastname, String emailaddress, String phoneNumber, String password) throws InterruptedException 
	{
		//Invalid Login
		Thread.sleep(5000);
		driver.findElement(By.xpath(Loc.getProperty("login_signupBtn"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(Loc.getProperty("dont_have_acc_signUp"))).click();
		Thread.sleep(17000);
		driver.findElement(By.cssSelector(Loc.getProperty("first_name_fld"))).sendKeys(firstname); //locators --properties
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(Loc.getProperty("last_name_fld"))).sendKeys(lastname); //locators --properties
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(Loc.getProperty("email_address_fld"))).sendKeys(emailaddress); //locators --properties
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(Loc.getProperty("phone_nmb_fld"))).sendKeys(phoneNumber); //locators --properties
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(Loc.getProperty("signup_pwd_fld"))).sendKeys(password);
		Thread.sleep(4000);
		driver.findElement(By.cssSelector(Loc.getProperty("create_an_acc_btn"))).click();
		Thread.sleep(8000); 

	}
	
	@DataProvider(name="testdata")
	public Object [][]tData()
	{
		return new Object[][]
		{
			{"Ibukun", "Popoola", "ibkpopoola12@gmail.co", "08096886371", "Micheal@me1"},
		};
		
		

}
}