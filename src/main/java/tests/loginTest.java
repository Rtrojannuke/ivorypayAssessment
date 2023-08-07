package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseContainer.TestBase;
import pages.loginPage;

public class loginTest extends TestBase{
	loginPage actn = new loginPage(driver);
	@Test
	public void validLogin(String email, String password) throws Exception {
		actn.inputEmail(email);
		actn.inputPassword(password);
		actn.clickLogin();
	}
	
	public void navigateToSignUp() {
		loginPage actn = new loginPage(driver);
		actn.NaviatetoSignUp();
	}
	
	@DataProvider(name = "LoginData")
    public Object[][] testData() throws Exception
    {
        return new Object[][]
                {
        				{"email", "password"},
        				
                };
    }

}
