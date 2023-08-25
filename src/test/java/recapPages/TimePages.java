package recapPages;

import org.openqa.selenium.WebDriver;

import recapSteps.ButtonPages;

public class TimePages {
	private ButtonPages buttonPages;
	
	//constructor
	public TimePages(WebDriver driver) {
		this.buttonPages= new ButtonPages(driver);
	}
	
	public void llegarTimePage() {
		buttonPages.Timebutton();
	
	}
	
}