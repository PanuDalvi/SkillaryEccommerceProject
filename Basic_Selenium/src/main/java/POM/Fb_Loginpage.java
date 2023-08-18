package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_Loginpage
{
	
	//declaration
	
	//address of email textfield
	@FindBy(xpath="//input[@id='email']")
	private WebElement emailTf;
	
	//password textfield
	@FindBy(xpath="//input[@id='pass']")
	private WebElement passwordTf;
	
	//address of login button
	@FindBy(xpath="//button[@id='u_0_5_3b']")
	private WebElement loginBtn;

	
	//Initialization
	public Fb_Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}

//getter and setter method
	
	public WebElement getEmailTf() {
		return emailTf;
	}


	public void setEmailTf(WebElement emailTf) {
		this.emailTf = emailTf;
	}


	public WebElement getPasswordTf() {
		return passwordTf;
	}


	public void setPasswordTf(WebElement passwordTf) {
		this.passwordTf = passwordTf;
	}


	public WebElement getLoginBtn() {
		return loginBtn;
	}


	public void setLoginBtn(WebElement loginBtn) {
		this.loginBtn = loginBtn;
	}
	
	
	//Utilization
	public void emailTextField(String data) {
	   emailTf.sendKeys(data);
	}
	   
    public void passwordTextField(String data) {
	    passwordTf.sendKeys(data);	
}
    public void loginButton() {
	    loginBtn.click();
    }
}


