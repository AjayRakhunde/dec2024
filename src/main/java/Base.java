import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import io.github.bonigarcia.wdm.WebDriverManager;
import utility.Seleniumutility;

public class Base {
	public Seleniumutility utils=new Seleniumutility();
	public WebDriver driver;
	@Parameters	("browser")
	
	
@BeforeClass
	public void brl(String browser) {
		
		if(browser.equalsIgnoreCase("Chrome"))
		{
		WebDriverManager.chromedriver().setup();
		
		 driver=new ChromeDriver();
		
		
		driver.get("https://www.amazon.in/home");
		
	}
		if(browser.equalsIgnoreCase("Edge"))		
 {
		
		WebDriverManager.chromedriver().setup();
		
		driver=new EdgeDriver();
		
		
		driver.get("https://www.amazon.in/home");
		
	}
	
		if(browser.equalsIgnoreCase("Firefox")) {
	
	WebDriverManager.chromedriver().setup();
	
   driver=new FirefoxDriver();
	
	
	driver.get("https://www.amazon.in/home");
	
}		
			
		
	
	
	
	
	}}
