package recapPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import recapSteps.ButtonPages;

public class LoginPage {
	//llamado de una clase
	//private WebDriver driver;
	private ButtonPages buttonPages;
	
	@FindBy(how = How.NAME,using ="username")
	private WebElement Inputusername;
	
	@FindBy(how = How.NAME, using = "password")
	private WebElement inputPassword;
	
	


	//Constructor
	public  LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.buttonPages= new ButtonPages(driver);
	}

	
	//metodo
	public void llenardatos(String username, String password) {
		Inputusername.sendKeys(username);
        inputPassword.sendKeys(password);
        buttonPages.buttonLogin();
	}
}
