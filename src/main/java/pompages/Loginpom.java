package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

public class Loginpom extends Base {
	
	WebDriver ldriver;
	
	public Loginpom(WebDriver rdriver)
{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy (how=How.ID ,using="nav-link-accountList") private WebElement userid;
	
	@FindBy (how=How.NAME ,using="email") private WebElement password;
	@FindBy (how=How.XPATH ,using="//*[@type='submit']") private WebElement submitbutton;

	
	@FindBy (how=How.XPATH ,using="//*[@class='a-list-item']")private WebElement errormsg;
	
	
	public void enterid()
	{
		utils.clickelement();
		
	}
	
	public void enterpass()
	{}
	
	public void click() {
		
		
	}
	
	public void getmasg()
{
		
}
	

}
