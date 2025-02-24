package Testpkg;

import org.testng.annotations.Test;

import Basepkg.Baseclass;
import Pagepkg.loginpage;
import Utilities.Utilities;

public class logintest extends Baseclass {
	@Test
	public void login() throws InterruptedException
	{
    loginpage ob = new loginpage(driver);
    
    
    String file = "C:\\Users\\LENOVO\\OneDrive\\Desktop\\Mizhi-excel.xlsx";
    String sheet = "Sheet1";

 
    int rowCount = Utilities.getRowCount(file, sheet);
    
    
    for (int i = 1; i <= rowCount; i++) 
    {
        String email = Utilities.getCellValue(file, sheet, i, 0);
        String password = Utilities.getCellValue(file, sheet, i, 1);

      
        System.out.println("username = " + email);
        System.out.println("password = " + password);

      Thread.sleep(100);
        ob.setValues(email, password);
        Thread.sleep(100);
      
        ob.login();
        String expctdurl="https://mizhiboutique.com/Dashboard";
        String actualurl=driver.getCurrentUrl();
        if (actualurl.equals(expctdurl))
        		{
        System.out.println("Pass");
        		}
        else
        	
        	{System.out.println("Fail");

        	}
    }
}}
