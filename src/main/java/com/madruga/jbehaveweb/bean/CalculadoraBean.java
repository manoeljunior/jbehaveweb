package com.madruga.jbehaveweb.bean;

import javax.faces.bean.ManagedBean;

import com.madruga.jbehaveweb.util.Calculadora;

@ManagedBean
public class CalculadoraBean {
	double resultado;

	private Calculadora calculadora = new Calculadora();

	public CalculadoraBean() {
		System.out.println("Instanciada");
	}
	
	public Calculadora getCalculadora() {
		return calculadora;
	}

	public void setCalculadora(Calculadora calculadora) {
		this.calculadora = calculadora;
	}
	
	public String calcular() {
		resultado = this.calculadora.resultado();
		return null;
	}
	
	public double getResultado() {
		return resultado;
	}
	
	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	
	public String limparCampos() {
		this.calculadora = new Calculadora();
		resultado = 0D;
		return null;
	}
	
}
