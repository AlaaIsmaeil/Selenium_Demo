package tests;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import java.util.Arrays;

public class TvPackageTests extends TestBase {

	
    HomePage homePage;
    String[] types={"LITE","CLASSIC","PREMIUM"};
    String[] egyptPrices={"0.25","0.5","1"};
	String[] omanPrices={"5","10","15"};
	String[] uaePrices={"5.4","10.9","16.3"};
	String currency="USD/month";
   
	@BeforeMethod
	
	void initUtlities() {
		
		System.out.println("initUtlities()");
		homePage=new HomePage(driver);
			
	}

	/**I couldn't find countries mentioned in assigment so test done for egypt-oman-uae**/
	@Test(description ="Check values UAE", priority = 1)
	public void checkValueUAE() throws InterruptedException {
		homePage.clickCountry();
		homePage.selectCountry("ae");
		Thread.sleep(2000);
		String[] actualTypes=homePage.getTypes();
		Assert.assertEquals(homePage.compareArray(actualTypes,types) , true,"Types not same as expected");
		String[] actualPrices=homePage.getPrices();
		Assert.assertEquals(homePage.compareArray(actualPrices,uaePrices) , true,"UAE prices not same as expected");
		String[] actualCurrency=homePage.getCurrency();
		Assert.assertEquals(Arrays.asList(actualCurrency).contains(currency), true,"Currency not same as expected");

	}
	@Test(description ="Check values oman", priority = 1)
	public void checkValueOman() throws InterruptedException {
		homePage.clickCountry();
		homePage.selectCountry("om");
		Thread.sleep(2000);
		String[] actualTypes=homePage.getTypes();
		Assert.assertEquals(homePage.compareArray(actualTypes,types) , true,"Types not same as expected");
		String[] actualPrices=homePage.getPrices();
		Assert.assertEquals(homePage.compareArray(actualPrices,omanPrices) , true,"Oman prices not same as expected");
		String[] actualCurrency=homePage.getCurrency();
		Assert.assertEquals(Arrays.asList(actualCurrency).contains(currency), true,"Currency not same as expected");

	}
	@Test(description ="Check values egypt", priority = 1)
	public void checkValueEgypt() throws InterruptedException {
		homePage.clickCountry();
		homePage.selectCountry("eg");
		Thread.sleep(2000);
		String[] actualTypes=homePage.getTypes();
		Assert.assertEquals(homePage.compareArray(actualTypes,types) , true,"Types not same as expected");
		String[] actualPrices=homePage.getPrices();
		Assert.assertEquals(homePage.compareArray(actualPrices,egyptPrices) , true,"Egypt prices not same as expected");
		String[] actualCurrency=homePage.getCurrency();
		Assert.assertEquals(Arrays.asList(actualCurrency).contains(currency), true,"Currency not same as expected");

	}
	

}
