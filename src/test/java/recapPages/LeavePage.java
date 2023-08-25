package recapPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import recapSteps.ButtonPages;
import recapSteps.Questions;

public class LeavePage {
	
	private ButtonPages buttonPages;
	private Questions questions;
	
	
	//constructor
	public LeavePage(WebDriver driver) {
		this.buttonPages =  new ButtonPages(driver);
		this.questions = new Questions(driver);
	}
	
	public void llegarleavePage(String employee) {
		buttonPages.Leavebutton();
		questions.searchScroll(employee);
		questions.aceptarEmpleado();
	}
	
	
		
}
