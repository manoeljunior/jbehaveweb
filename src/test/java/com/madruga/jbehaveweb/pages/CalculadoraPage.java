package com.madruga.jbehaveweb.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * 
 * @author manoel.freitasjunior
 * @version 0.6
 * Uso de PageFactory para iniciliar os elementos da página, 
 * usando annotations, e o recurso WaitImplicit.
 */
public class CalculadoraPage extends PageBase {

	@FindBy (id="formCalc:operando1")
	WebElement operando1;
	
	@FindBy (id="formCalc:operando2")
	WebElement operando2;
	
	@FindBy (id="formCalc:operacao")
	WebElement operation;
	
	@FindBy (id="formCalc:calcular")
	WebElement calcular;
	
	@FindBy (id="formCalc:resultado")
	WebElement resultado;
	
	@FindBy (id="formCalc:limparCampos")
	WebElement limparCampos;
	
	public CalculadoraPage() {
		super();
	}
	
	public void setFields(double v_operando1, double v_operando2) {
		setField(operando1, String.valueOf(v_operando1));
		setField(operando2, String.valueOf(v_operando2));
	}
	
	public void selectOperation(String v_operation) {
		operation.sendKeys(v_operation);
	}
	
	public void calcularClick() {
		calcular.click();
	}
	
	public void limparCamposClick() {
		limparCampos.click();
	}
	
	public String getOperando1() {
		return getField(operando1);
	}
	
	public String getOperando2() {
		return getField(operando2);
	}
	
	public String getResultado() {
		return getField(resultado);
	}

	public WebElement getOperation() {
		return operation;
	}

	
}
