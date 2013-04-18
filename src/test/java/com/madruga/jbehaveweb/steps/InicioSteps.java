package com.madruga.jbehaveweb.steps;

import org.jbehave.core.annotations.Given;

import com.madruga.jbehaveweb.pages.InicioPage;

public class InicioSteps {

	private InicioPage inicioPage;
	
	@Given("o usuario esta na pagina inicial")
	public void givenOUsuarioEstaNaPaginaInicial() {
		inicioPage = new InicioPage();
	}
	
	@Given("o usuario seleciona a calculadora")
	public void givenOUsuarioSelecionaACalculadora() {
		inicioPage.calculadoraClick();
	}
	
}
