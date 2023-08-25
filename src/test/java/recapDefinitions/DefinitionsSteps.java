package recapDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import recapPages.LeavePage;
import recapPages.LoginPage;
import recapPages.PimPage;
import recapPages.TimePages;
import recapSteps.Conexion;

public class DefinitionsSteps {
	
	private WebDriver driver;
	private Conexion conexion = new Conexion();
	private LoginPage loginPage = new LoginPage(driver);
	private PimPage pimPage = new PimPage(driver);
	private LeavePage leavePage = new LeavePage(driver);
	private TimePages timePages = new TimePages(driver);
	
	@Given("^abrir el navegador$")
	public void abrir_navegador()  {
		this.conexion=new Conexion();
		this.driver=this.conexion.abrirElNavegador();
	}
	
	@And("^llenar campo usuario(.*) y password(.*)$")
	public void loquearte(String userName, String pass) {
		this.loginPage = new LoginPage(driver);
		this.loginPage.llenardatos(userName, pass);
	}
	
	@And("^llegar a la opcion agregar empleado$")
	public void llegarAddEmployee() {
		this.pimPage= new PimPage(driver);
		this.pimPage.llegarPim();
	}
	
	
	
	@And("^llenar nombre(.*) y lastName(.*)$")
	public void llenarNombre(String myName, String lastName) {
		this.pimPage= new PimPage(driver);
		this.pimPage.AddEmployee(myName, lastName);
	}
	
	@And("^llegar leavePage(.*)$")	
	public void llegarleavePage(String employee) {
		this.leavePage= new LeavePage(driver);
		this.leavePage.llegarleavePage(employee);
	}
	
	@And("^llegar TimePage$")
	public void llegartimePage() {
	this.timePages=new TimePages(driver);
	this.timePages.llegarTimePage();
	}
	
	
}

