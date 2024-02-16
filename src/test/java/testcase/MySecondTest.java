package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
public class MySecondTest extends BaseTest{
	
	@Test(dataProvider="testdata")
	public static void LoginTest(String phoneNumber, String pin) throws InterruptedException 
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath(Loc.getProperty("phone_number_field"))).sendKeys(phoneNumber); //locators --properties
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(Loc.getProperty("pwd_field"))).sendKeys(pin);
		Thread.sleep(3000);
		driver.findElement(By.id(Loc.getProperty("sign_up_btn"))).click();
		Thread.sleep(5000);

	}
	
	@DataProvider(name="testdata")
	public Object [][]tData()
	{
		return new Object[][]
		{
			{"00842230", "6262"},
			{"08130842234230", "62622"},
			{"081308422307484", "626262"},
			{"08130842230", "626262"},
		};
		
		

}
}