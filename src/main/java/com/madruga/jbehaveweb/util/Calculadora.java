package com.madruga.jbehaveweb.util;

import java.lang.reflect.Method;

public class Calculadora {
	private double operando1;
	private double operando2;
	private String operacao;
	
	public double getOperando1() {
		return operando1;
	}

	public void setOperando1(double operando1) {
		this.operando1 = operando1;
	}

	public double getOperando2() {
		return operando2;
	}

	public void setOperando2(double operando2) {
		this.operando2 = operando2;
	}

	public String getOperacao() {
		return operacao;
	}

	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}

	public double somar() {
		return operando1 + operando2; 
	}
	
	public double subtrair() {
		return operando1 - operando2; 
	}
	
	public double multiplicar() {
		return operando1 * operando2; 
	}
	
	public double dividir() {
		if (operando2 != 0d) {
			return operando1 / operando2;
		} else {
			return 0d;
		}
	}
	
	public double resultado(String operacao) {
		try {
			Class cls = Class.forName("com.madruga.jbehaveweb.util.Calculadora");
			Method meth = cls.getMethod(operacao);
			//Calculadora calculadora = new Calculadora();
			
			return (Double) meth.invoke(this);
		} catch (Throwable e) {
			System.err.println(e);
			return 0d;
		}
	}
	
	public double resultado() {
		try {
			Class cls = Class.forName("com.madruga.jbehaveweb.util.Calculadora");
			Method meth = cls.getMethod(this.operacao);
			//Calculadora calculadora = new Calculadora();
			
			return (Double) meth.invoke(this);
		} catch (Throwable e) {
			System.err.println(e);
			return 0d;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((operacao == null) ? 0 : operacao.hashCode());
		long temp;
		temp = Double.doubleToLongBits(operando1);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(operando2);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Calculadora other = (Calculadora) obj;
		if (operacao == null) {
			if (other.operacao != null)
				return false;
		} else if (!operacao.equals(other.operacao))
			return false;
		if (Double.doubleToLongBits(operando1) != Double
				.doubleToLongBits(other.operando1))
			return false;
		if (Double.doubleToLongBits(operando2) != Double
				.doubleToLongBits(other.operando2))
			return false;
		return true;
	}

}
