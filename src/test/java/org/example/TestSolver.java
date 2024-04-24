package org.example;
import org.example.Solver;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestSolver {


    @org.junit.jupiter.api.Test
    void isPrime() {
        assertTrue(Solver.isPrime(13));
        assertFalse(Solver.isPrime(200));
        assertTrue(Solver.isPrime(7919));
        assertTrue(Solver.isPrime(17));
        assertTrue(Solver.isPrime(23));
        assertFalse(Solver.isPrime(988));
        assertTrue(Solver.isPrime(5));

    }

    @Test
    void primeFactors() {
        assertArrayEquals(Solver.primeFactors(17), new int[]{17});
        assertArrayEquals(Solver.primeFactors(6), new int[]{2, 3});
        assertArrayEquals(Solver.primeFactors(7919), new int[]{7919});
        assertArrayEquals(Solver.primeFactors(465), new int[]{3, 5, 31});
        assertArrayEquals(Solver.primeFactors(15), new int[]{3, 5});
        assertArrayEquals(Solver.primeFactors(3053), new int[]{43, 71});
        assertArrayEquals(Solver.primeFactors(12), new int[]{2, 2, 3});
    }
}