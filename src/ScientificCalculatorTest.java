import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ScientificCalculatorTest {

    ScientificCalculator calculator;

    @BeforeEach
    void setup() {
        calculator = new ScientificCalculator();
    }

    // Testes de operações básicas
    // -----------------------------------------

    @Test
    void testAddition() {

        // Setup => objeto criado automaticamente pelo BeforeEach

        // Execution => executa o método a ser testado
        double result = calculator.add(2, 3);

        // Assertion => verifica se o resultado está conforme esperado
        assertEquals(5.0, result);

        /* O painel JUnit exibiu um ícone verde indicando que o teste passou.
           A mensagem "1 test successful" confirma que o teste foi executado corretamente.
           Em caso de erro, o ícone apareceria vermelho mostrando a diferença
           entre o valor esperado e o valor obtido. */
    }

    @Test
    void testSubtract() {

        // Setup => objeto criado automaticamente pelo BeforeEach

        // Execution => executa o método a ser testado
        double result = calculator.subtract(10, 4);

        // Assertion => verifica se o resultado está conforme esperado
        assertEquals(6.0, result);

        // Teardown => não utilizado neste caso
    }

    @Test
    void testDivideValid() { // antes: testDivide

        // Setup => objeto criado automaticamente pelo BeforeEach

        // Execution => executa o método a ser testado
        double result = calculator.divide(10, 2);

        // Assertion => verifica se o resultado está conforme esperado
        assertEquals(5.0, result);

        // Teardown => não utilizado neste caso
    }

   
    // Testes de cenários válidos
    // -----------------------------------------

    @Test
    void testSquareRootPositive() {

        // Setup => objeto criado automaticamente pelo BeforeEach

        // Execution => executa o método a ser testado
        double result = calculator.squareRoot(16);

        // Assertion => verifica se o resultado está conforme esperado
        assertEquals(4.0, result);

        // Teardown => não utilizado neste caso
    }

  
    // Testes de cenários de erro
    // -----------------------------------------

    @Test
    void testSquareRootNegative() {

        // Setup => objeto criado automaticamente pelo BeforeEach

        // Execution + Assertion => verifica se lança exceção
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.squareRoot(-9);
        });

        // Teardown => não utilizado neste caso
    }

    @Test
    void testLogInvalid() { // antes: testLogNegative

        // Setup => objeto criado automaticamente pelo BeforeEach

        // Execution + Assertion => verifica se lança exceção
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.log(-5);
        });

        // Teardown => não utilizado neste caso
    }
}
