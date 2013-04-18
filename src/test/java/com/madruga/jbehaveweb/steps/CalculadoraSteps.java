package com.madruga.jbehaveweb.steps;

import org.jbehave.core.annotations.AfterStories;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import static org.junit.Assert.assertEquals;

import com.madruga.jbehaveweb.pages.CalculadoraPage;

public class CalculadoraSteps {

	private CalculadoraPage calculadoraPage;
	private double DELTA = 0.0000001;
	
	@Given("o sistema apresenta a tela calculadora")
	public void givenOSistemaApresentaATelaCalculadora() {
		calculadoraPage = new CalculadoraPage();
	}
	
	@When("o usuario informa os numeros $op1 e $op2")
	public void whenOUsuarioInformaOsNumeros10E20(double op1, double op2) {
		System.out.println("Op1: " + op1);
		System.out.println("Op2: " + op2);
		calculadoraPage.setFields(op1, op2);
	}
	
	@When("o usuario seleciona a operacao $operacao")
	public void whenOUsuarioSelecionaAOperacaosomar(String operacao) {
		calculadoraPage.selectOperation(operacao);
	}
	
	@When("o usuario seleciona o botao calcular")
	public void whenOUsuarioSelecionaOBotaoCalcular() {
		calculadoraPage.calcularClick();
	}
	
	@When("o usuario seleciona o botao limpar campos")
	public void whenOUsuarioSelecionaOBotaoLimparCampos() {
		calculadoraPage.limparCamposClick();
	}
	
	@Then("o resultado sera igual a $resultado")
	public void thenOResultadoSeraIgualA30(double resultado) {
		assertEquals(resultado, Double.valueOf(calculadoraPage.getResultado()), DELTA);
	}
	
	@Then("o operandoUm sera igual a $valor")
	public void thenOOperandoUmSeraIgualA0(double valor) {
		assertEquals(valor, Double.valueOf(calculadoraPage.getOperando1()), DELTA);
	}
	
	@Then("o operandoDois sera igual a $valor")
	public void thenOOperandoDoisSeraIgualA0(double valor) {
		assertEquals(valor, Double.valueOf(calculadoraPage.getOperando2()), DELTA);
	}
	
	@AfterStories
	public void close() {
		calculadoraPage.close();
	}
	
}
