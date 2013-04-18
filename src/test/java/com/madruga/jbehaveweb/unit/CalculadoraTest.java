package com.madruga.jbehaveweb.unit;

import org.junit.Before;
import org.junit.Test;
import com.madruga.jbehaveweb.util.Calculadora;

import static org.junit.Assert.assertEquals;

public class CalculadoraTest {

	private Calculadora calculadora;
	private final double DELTA = 0.0000001;
	
	@Before
	public void initialize() {
		calculadora = new Calculadora();
		calculadora.setOperando1(21);
		calculadora.setOperando2(12);
	}
	
	@Test
	public void testSoma() {
		assertEquals(new Double(33), calculadora.somar(), DELTA);
	}
	
	@Test
	public void testSubtracao() {
		assertEquals(new Double(9), calculadora.subtrair(), DELTA);
	}
	
	@Test
	public void testMultiplicacao() {
		assertEquals(new Double(252), calculadora.multiplicar(), DELTA);
	}
	
	@Test
	public void testDivisao() {
		assertEquals(1.75, calculadora.dividir(), DELTA);
	}
}
