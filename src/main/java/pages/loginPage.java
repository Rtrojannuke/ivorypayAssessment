package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import baseContainer.TestBase;
import utilites.utility;


public class loginPage extends TestBase{
	
	utility utils = new utility();
	
    String emailField = OR.getProperty("emailInputField_ID");

    String passwordField = OR.getProperty("passwordField_ID");

    String loginBtn = OR.getProperty("loginBtn_XPATH");
    
    String closeModalFrame = OR.getProperty("CloseModalFrame");
    
    String closeModal = OR.getProperty("closeModalBtn");
    
    public loginPage(WebDriver driver) {
        TestBase.driver = driver;
        PageFactory.initElements(TestBase.driver, this);
    }
    
    
    public void inputEmail(String username) throws Exception {
    	driver.findElement(By.id(emailField)).click();
    	driver.findElement(By.id(emailField)).sendKeys(utils.fetchData(username));
    }
    
    public void inputPassword(String password) throws Exception {
    	driver.findElement(By.id(passwordField)).click();
    	driver.findElement(By.id(passwordField)).sendKeys(utils.fetchData(password));
    }
    
    public void clickLogin() throws InterruptedException {
    	Thread.sleep(500);
    	driver.findElement(By.xpath(loginBtn)).click();
    }
    
    public void clearEmailField() {
    	driver.findElement(By.id(emailField)).clear();
    }
    
    public void clearPswdField() {
    	driver.findElement(By.id(passwordField)).clear();
    }
    
    public void closeModal() {
    	//driver.switchTo().frame(4);
    	driver.findElement(By.xpath(closeModalFrame)).click();
    	driver.findElement(By.xpath(closeModal)).click();
    }

}
