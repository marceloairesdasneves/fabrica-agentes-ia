package com.suaempresa.math;

/**
 * Utility class for basic arithmetic operations.
 * Designed as final and stateless.
 */
public final class Calculator {

    // Privado para prevenir instanciação desnecessária de classe utilitária
    private Calculator() {
        throw new UnsupportedOperationException("Utility class cannot be instantiated");
    }

    /**
     * Sums two integers safely.
     * @throws ArithmeticException if the result overflows an int.
     */
    public static int sum(int addend1, int addend2) {
        return Math.addExact(addend1, addend2); // Previne estouro de memória/limite
    }

    /**
     * Multiplies two integers safely.
     * @throws ArithmeticException if the result overflows an int.
     */
    public static int multiply(int factor1, int factor2) {
        return Math.multiplyExact(factor1, factor2);
    }
}
