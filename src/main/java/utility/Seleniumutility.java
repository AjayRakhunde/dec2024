package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Seleniumutility {
	
	public void clickelement(WebDriver ld, WebElement element) {
		

		 WebDriverWait wt=new WebDriverWait(ld,15);
			
		 wt.until(ExpectedConditions.elementToBeClickable((element)));
		 element.click();
}
	
	
	
		 
		
	}
	
		
	


