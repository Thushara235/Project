package Testpkg;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Basepkg.Baseclass;
import Pagepkg.addtocartpage;

public class addtocarttest extends Baseclass {
	private static final String js = null;

	@Test
	public void addto() throws InterruptedException
	{
	
	addtocartpage ob=new addtocartpage(driver);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Thread.sleep(1000);
	ob.shop();
	Thread.sleep(100);
	ob.shopselct();
	Thread.sleep(100);
	
	
	
	js.executeScript("window.scrollBy(0,500)");
	ob.dress();
	Thread.sleep(100);
	ob.addtocart();
	Thread.sleep(100);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	ob.logout();
	

}}
