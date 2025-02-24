package Testpkg;

import org.testng.annotations.Test;

import Basepkg.Baseclass;
import Pagepkg.Registrationpage;

public class Registrationtest extends Baseclass{
	
	@Test
	public void test() throws InterruptedException
	{
		
		Registrationpage ob=new Registrationpage(driver);
		ob.regclick();
		Thread.sleep(100);
		ob.setValues("Luminar", "Luminar1@gmail.com", "Luminartech");
		Thread.sleep(100);
		ob.submit();
	
		
	}

}
