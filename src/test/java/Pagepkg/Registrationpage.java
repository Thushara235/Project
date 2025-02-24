package Pagepkg;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registrationpage {
	WebDriver driver;
	
	@FindBy(xpath="/html/body/header/div[1]/div/div/div[2]/div[1]/div[1]/ul/li[5]/a")
	WebElement Registration;
	@FindBy(xpath="/html/body/main/div/div/div/div/div/div[2]/div[2]/form/p[1]/input")
	WebElement Fullname;
	@FindBy(xpath="/html/body/main/div/div/div/div/div/div[2]/div[2]/form/p[2]/input")
	WebElement email;
	
	@FindBy(xpath="/html/body/main/div/div/div/div/div/div[2]/div[2]/form/p[3]/input")
	WebElement password;
	@FindBy(xpath="/html/body/main/div/div/div/div/div/div[2]/div[2]/form/p[4]/button")
	WebElement submit;
	
	
	
	
		
	public Registrationpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void regclick()
	{
		Registration.click();
	}
	
	public void setValues(String fname,String mail, String pword)
	{
		Fullname.sendKeys(fname);
		
		email.sendKeys(mail);
		password.sendKeys(pword);
	}
	public void submit()
	{
		submit.click();
	}
	
}
