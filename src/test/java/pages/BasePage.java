package pages;

import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/************************Base class for common actions*********************************/

public class BasePage {

	
		protected WebDriver driver;
	    String[] typeText =  new String[3];
		public BasePage(WebDriver driver) {
			this.driver=driver;
		}
		//Click Method
				protected void click (By element) {
			
				driver.findElement(element).click();	
			
		}

	protected List<WebElement> getArrayOfElements(By item) {
		return	driver.findElements(item);
	}
	protected String[] getArrayOfElementTexts(By item){
		List<WebElement> l = getArrayOfElements(item);
		for (int i = 0; i < l.size(); i++) {
			typeText[i] = l.get(i).getText();
		}
		return typeText;
	}
				
	}


