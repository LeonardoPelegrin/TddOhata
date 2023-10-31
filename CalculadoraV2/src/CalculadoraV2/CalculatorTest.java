package CalculadoraV2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

// Neste códido implementamos o método testAdd(), no qual será realizado uma simples operação de adição com
// o JunitTest.
	@Test
	public void testAdd() {
		Calculator calculator = new Calculator();
		int result = calculator.add(3, 4);
		assertEquals(7, result);
	}

// Neste códido implementamos o método testSubtract(),no qual será realizado uma simples operação de Subtração
// com o JunitTest.
	@Test
	public void testSubtract() {
		Calculator calculator = new Calculator();
		int result = calculator.add(7, 3);
		assertEquals(4, result);
	}
}
