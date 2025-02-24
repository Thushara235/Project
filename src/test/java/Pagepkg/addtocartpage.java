package Pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addtocartpage {
	WebDriver driver;
	
	@FindBy(xpath="/html/body/header/div[1]/div/div/div[2]/div[1]/div[1]/ul/li[2]/a")
	WebElement shop;
	
	@FindBy(xpath="/html/body/div[4]/div/div/div/div/div/div[1]/div/h3/a")
	WebElement shopselect;
	@FindBy(xpath="/html/body/div[5]/div/div/div/div[2]/ul/li[1]/div/div[2]/h3/a")
	WebElement dress;
	@FindBy(xpath="//*[@id=\"product-27\"]/div[1]/div/div[2]/form/div/div[4]/button")
	WebElement addtocart;
	
	@FindBy(xpath="/html/body/header/div[1]/div/div/div[2]/div[1]/div[1]/ul/li[5]/a")
	WebElement logout;
	
	
	public addtocartpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);


}
	public void shop()
	{
		shop.click();
	}
	public void shopselct()
	{
		shopselect.click();
	}
	public void dress()
	{
		dress.click();
		
	}
	public void addtocart()
	{
		addtocart.click();
	}
	public void logout()
	{
		logout.click();
	}
}