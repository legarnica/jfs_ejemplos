package com.micalculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraPrueba {

	@Test
	public void prueba() {

		assertEquals(4, Calculadora.suma(2, 2), 0);

		assertEquals(4, Calculadora.multiplica(2, 2), 0);

		assertEquals(0, Calculadora.resta(2, 2), 0);

		assertEquals(1, Calculadora.divide(2, 2), 0);

		assertEquals(0, Calculadora.resto(2, 2), 0);
	}
}
