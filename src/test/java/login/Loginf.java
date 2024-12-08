package login;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;


import io.github.bonigarcia.wdm.WebDriverManager;
import pompages.Loginpom;

public class Loginf extends Base {
	Loginpom lppom;

	
	
	 WebDriverWait wt;
	
	@Test
	
	public void t1() {
		
		
		lppom.enterid();
		lppom.enterpass();
		Object utils;
		utils.clickelement();
		lppom.click();
		lppom.getmasg();
		
		/* d.findElement(By.id("nav-link-accountList")).click();
		
		d.findElement(By.name("email")).sendKeys("9420282540");
		
		d.findElement(By.xpath("//*[@type='submit']")).click();
		
		d.findElement(By.id("ap_password")).sendKeys("Ankita99@");
		
		d.findElement(By.xpath("//*[@type='submit']")).click();*/
		
		
		

		//WebDriverWait wt=new WebDriverWait(d,10);
		
		//wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("auth-error-message-box"))));
		
		
		
		String h=d.findElement(By.xpath("//*[@class='a-list-item']")).getText();
		
		System.out.println(h);
		Assert.assertEquals( h,"Your password is incorrect");
		
		d.findElement(By.id("ap_password")).sendKeys("Ajay314121");
		d.findElement(By.xpath("//*[@type='submit']")).click();
		
	}
	
	@Test(dependsOnMethods="t1")
	
	public void t2() throws InterruptedException {
		
		
		//d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 WebDriverWait wt=new WebDriverWait(d,15);
		
		wt.until(ExpectedConditions.elementToBeClickable(d.findElement(By.xpath("//*[@class='nav-a nav-hasArrow']/span[contains(text(),'Furniture')]"))));
		
		
		WebElement u=d.findElement(By.xpath("//*[@data-nav-key=\"aj:https://m.media-amazon.com/images/G/31/img16/furniture/megamenu/subnavjan18.json:subnav-sl-megamenu-4:0\"]"));
		
	Actions act=new Actions(d)	;
		act.moveToElement(u).build().perform();
		
		wt.until(ExpectedConditions.elementToBeClickable(d.findElement(By.xpath("//*[contains(text(),'Sofa Beds')]"))));
		
				WebElement y=d.findElement(By.xpath("//*[contains(text(),'Sofa Beds')]"));
		 
		y.click();
		
		
	}
	
	@Test(dependsOnMethods="t2")
	
	public void t3() {
		
  Boolean k =d.findElement(By.xpath("//*[contains(text(),'Adorn India')]")).isSelected();
		if( k=true) {
			
			d.findElement(By.xpath("//*[contains(text(),'Adorn India')]")).click();
		 
			
		}
		
	}
	
	@Test(dependsOnMethods="t3")
	
	public void t4() {
		
		
		String p=d.getWindowHandle();
		
		System.out.println(p);
		

		d.switchTo().window(p);
		
	///d.close();
		
		
		
		
		
		Set<String>L1=d.getWindowHandles();
		
		System.out.println(L1);
		
		Iterator<String>it=  L1.iterator();
		
		while(it.hasNext())
		
		{
			
			
			String c=it.next();

			if(!p.equals(c)) {
				
				d.switchTo().window(c);
				
				
				
				d.switchTo().window(p);
				
			}	}
		}
	
	
	@Test(dependsOnMethods="t4")
	
	
	public void t5()
	{		JavascriptExecutor jse=(JavascriptExecutor)d;
	
	/*WebElement y=d.findElement(By.xpath("//*[@class='nav-search-scope nav-sprite']"));
	jse.executeScript("arguments[0].scrollIntoView();",y);
		 wt=new WebDriverWait(d,15);
		Select sel=new Select(d.findElement(By.xpath("//*[@title='Search in']")));
		
		sel.selectByVisibleText("Books");*/
		
		

		
		
	//	wt.until(ExpectedConditions.visibilityOf(d.findElement(By.xpath("//*[@alt='Royal enfield']"))));
		

		
	jse.executeScript("arguments[0].scrollIntoView();",d.findElement(By.xpath("//*[@id='navBackToTop']")));
		
		
	}	
		
		
		
	
	@Test(dependsOnMethods="t5")
	
	public void t6() throws AWTException {
		
		JavascriptExecutor jse=(JavascriptExecutor)d;
		//jse.executeScript("arguments[0].scrollIntoView();",d.findElement(By.xpath("//iframe[@id='ape_Search_auto-bottom-advertising-0_portal-batch-fast-btf-loom_5e2a1dbc-cc75-4ce7-98e9-eb28afcad5aa_iframe']")));
		
		String j=d.switchTo().frame(0).getTitle();
		
		System.out.println(j);
		
		Robot rt=new Robot();
		
		
		rt.keyPress(KeyEvent.VK_UP);
		rt.keyRelease(KeyEvent.VK_UP);
		
		
	
		
	}
	
	
	
	
	
	
	
	
	@AfterSuite

	public void test1(){
		
		
		
	}
	
	
	
	
	
	
	
	

	}


