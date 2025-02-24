package Pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
WebDriver driver;
@FindBy(xpath="/html/body/main/div/div/div/div/div/div[2]/div[1]/form/p[1]/input")
WebElement email;
@FindBy(xpath="/html/body/main/div/div/div/div/div/div[2]/div[1]/form/p[2]/input")
WebElement password;

@FindBy(xpath="/html/body/main/div/div/div/div/div/div[2]/div[1]/form/p[3]/button")
WebElement login;


public loginpage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);

}
public void setValues(String mail,String pword)
{
	email.clear();
	email.sendKeys(mail);
	password.clear();
	password.sendKeys(pword);
}
public void login()
{
	login.click();
}
}
