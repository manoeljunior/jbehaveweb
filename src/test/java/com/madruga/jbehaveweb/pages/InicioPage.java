package com.madruga.jbehaveweb.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InicioPage extends PageBase{

private final String HOMEPAGE = "http://localhost:8080/jbehaveweb/inicio.jsf";
	
	private final String FORM = "formInicio";

	@FindBy (id=FORM + ":calculadora")
	WebElement calculadora;
	
	CalculadoraPage calculadoraPage;
	
	public InicioPage() {
		super();
		getDriver().get(HOMEPAGE);
	}
	
	public CalculadoraPage calculadoraClick() {
		calculadora.click();
		return new CalculadoraPage();
	}
}
