package com.madruga.jbehaveweb.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import static org.junit.Assert.assertEquals;

import com.madruga.jbehaveweb.pages.CalculadoraPage;
import com.madruga.jbehaveweb.pages.InicioPage;

public class InicioSteps {

	private InicioPage inicioPage;
	private CalculadoraPage calculadoraPage;
	
	@Given("o usuario esta na pagina inicial")
	public void givenOUsuarioEstaNaPaginaInicial() {
		inicioPage = new InicioPage();
	}
	
	@When("o usuario seleciona a calculadora")
	public void whenOUsuarioSelecionaACalculadora() {
		calculadoraPage = inicioPage.calculadoraClick();
	}

	@Then("o sistema apresenta a tela calculadora")
	public void thenOSistemaApresentaATelaCalculadora() {
		assertEquals("", "");
	}

	
}
