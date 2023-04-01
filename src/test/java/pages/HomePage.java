package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class HomePage {
	BasePage basePage;

	public HomePage(WebDriver driver) {
		basePage = new BasePage(driver);
	}

	/************************Locators*********************************/

	By Type = By.xpath("//strong[@class='plan-title']");
	By Price = By.xpath("//div[contains(@id,'currency')]/b");
	By Currency = By.xpath("//div[contains(@id,'currency')]/i");
	By CountryDropDown = By.id("country");

	public String[] getTypes() {
		return basePage.getArrayOfElementTexts(Type);
	}

	public String[] getPrices() {
		return basePage.getArrayOfElementTexts(Price);
	}

	public String[] getCurrency() {
		return basePage.getArrayOfElementTexts(Currency);
	}

	public void clickCountry() {
		basePage.click(CountryDropDown);
	}
	public void selectCountry(String text) {
		basePage.click(By.id(""+text+"-contry-lable"));
	}
	public boolean compareArray(String[] actual,String [] expcted) {
		boolean flag=false;
		for (int i=0;i<actual.length;i++){
			if (actual[i].contains(expcted[i])){
				flag=true;
			}
			else{
				flag=false;
				return flag;
			}
		}
		return flag;
	}

}
