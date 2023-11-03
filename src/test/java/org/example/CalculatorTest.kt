package org.example

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

// Kelas pengujian untuk kelas Calculator.
class CalculatorTest {

    // Pengujian metode 'add' dalam kelas Calculator.
    @Test
    fun add() {
        val calculator = Calculator()
        val expected = 10
        assertEquals(expected, calculator.add(5, 5))
    }

    // Pengujian untuk metode 'sub' dalam kelas Calculator.
    @Test
    fun `Test calculator can subtract two numbers`() {
        val calculator = Calculator()
        assertEquals(5, calculator.sub(15, 10))}
}
