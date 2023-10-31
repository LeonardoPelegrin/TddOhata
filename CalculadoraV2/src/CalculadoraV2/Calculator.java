package CalculadoraV2;

/**
 * @author Leonardo Pelegrin
 * @version 1.05
 * @since Release 1.02 da aplicação
 *
 * Uma classe Simples chamada Calculator que realiza operaçãoes de adição e subtração, na qual as mesmas  
 * serão usada na classe CalculatorTest através do método Junit.
 */

public class Calculator {
	/**
	 * Realiza uma operação de adição de a + b na qual retorna c.
	 * 
	 * @param   a  O primeiro operando.
	 * @param   b  O segundo operando.
	 * @return  C  Resultado da adição realizada entre a + b.
	 */
	public int add(int a, int b) {
		return a + b;
	}

	/**
	 * Realiza uma operação de Subtração de a - b na qual retorna c.
	 * 
	 * @param  a O operando do qual será subtraído.
	 * @param  b O operando a ser subtraído.
	 * @return C Resultado da operação entre a - b;
	 */
public int subtract(int a,int b) {
	return a - b;
    }

}