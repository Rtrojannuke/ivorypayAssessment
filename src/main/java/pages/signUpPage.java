package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import baseContainer.TestBase;
import utilites.utility;


public class signUpPage extends TestBase{
	
	utility utils = new utility();
	
	String fnameField = OR.getProperty("firstname");
	
	String lnamefield = OR.getProperty("lastname");
	
	String bnameField = OR.getProperty("businessName");
	
	String countryfield = OR.getProperty("countryfld");
	
    String emailField = OR.getProperty("emailaddressFld");
    
    String phoneNumField = OR.getProperty("phoneNumber");

    String passwordField = OR.getProperty("password");
    
    String confirmPasswordField = OR.getProperty("cPassword");
    
    String starterBusiness = OR.getProperty("strtBusness");
    
    String registeredBusiness = OR.getProperty("regBusiness");
    
    String DeveloperOption = OR.getProperty("ydeveloper");
    
    String notDeveloperOption = OR.getProperty("ndeveloper");
    
    String emailMarketing = OR.getProperty("emailMarketing");
    
    String termsAndConditions = OR.getProperty("terms");

    String signUpBtn = OR.getProperty("signUpbtn");
    
    
    
    public signUpPage(WebDriver driver) {
        TestBase.driver = driver;
        PageFactory.initElements(TestBase.driver, this);
    }
    
    public void inputFirstName(String firstName) throws Exception {
    	driver.findElement(By.id(fnameField)).click();
    	driver.findElement(By.id(fnameField)).sendKeys(utils.fetchData(firstName));
    }
    
    public void inputLastName(String lastName) throws Exception {
    	driver.findElement(By.id(lnamefield)).click();
    	driver.findElement(By.id(lnamefield)).sendKeys(utils.fetchData(lastName));
    }
    
    public void inputEmail(String username) throws Exception {
    	driver.findElement(By.id(emailField)).click();
    	driver.findElement(By.id(emailField)).sendKeys(utils.fetchData(username));
    }
    
    public void inputBisnName(String businessName) throws Exception {
    	driver.findElement(By.id(bnameField)).click();
    	driver.findElement(By.id(bnameField)).sendKeys(utils.fetchData(businessName));
    }
    
    public void selectCountry(String country) throws Exception {
    	driver.findElement(By.id(countryfield)).click();
    	new Select(driver.findElement(By.id(countryfield))).selectByVisibleText(country);;
    }
    
    public void inputPhoneNum(String phoneNum) throws Exception {
    	driver.findElement(By.xpath(phoneNumField)).click();
    	driver.findElement(By.xpath(phoneNumField)).sendKeys(utils.fetchData(phoneNum));
    }
    
    public void inputPassword(String password) throws Exception {
    	driver.findElement(By.id(passwordField)).click();
    	driver.findElement(By.id(passwordField)).sendKeys(utils.fetchData(password));
    }
    
    public void inputCPassword(String cPassword) throws Exception {
    	driver.findElement(By.id(passwordField)).click();
    	driver.findElement(By.id(passwordField)).sendKeys(utils.fetchData(cPassword));
    }
    
    public void chooseBusinesstype() throws Exception {
    	driver.findElement(By.xpath(starterBusiness)).click();
    }
    
    public void chooseDevelopertype() throws Exception {
    	driver.findElement(By.xpath(notDeveloperOption)).click();
    }
    
    public void acceptTermsnConditions() throws Exception {
    	driver.findElement(By.xpath(termsAndConditions)).click();
    }
    
    public void clickSignUp() throws InterruptedException {
    	Thread.sleep(500);
    	driver.findElement(By.xpath(signUpBtn)).click();
    }

}
