package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
public class KongaCart extends BaseTest{
	
	@Test(dataProvider="testdata")
	public static void LoginTest(String phoneNumber, String password) throws InterruptedException 
	{
		//valid Login
		Thread.sleep(5000);
		driver.findElement(By.xpath(Loc.getProperty("login_signupBtn"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(Loc.getProperty("email_field"))).sendKeys(phoneNumber); //locators --properties
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(Loc.getProperty("kng_pwd_fld"))).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.xpath(Loc.getProperty("login_Btn"))).click();
		Thread.sleep(17000);
		driver.findElement(By.cssSelector(Loc.getProperty("mycart_btn"))).click();
		Thread.sleep(7000);

	}
	
	@DataProvider(name="testdata")
	public Object [][]tData()
	{
		return new Object[][]
		{
			{"08096886371", "Micheal@me1"},
		};
		
		

}
}