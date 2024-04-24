package org.example;

import java.util.Arrays;

public class Solver {
    public static boolean isPrime(int k) {
        if (k <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(k); i++) {
            if (k % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] primeFactors(int k) {
        if (isPrime(k)) {
            return new int[]{k};
        }
        int[] result={};
        for (int i = 2; i <= Math.sqrt(k); i++) {
            if (k % i == 0 && isPrime(i)) {
                int[] prime = primeFactors(k / i);
                result = new int[prime.length + 1];
                result[result.length-1] = i;
                System.arraycopy(prime, 0, result, 0, prime.length);
            }
        }
        return Arrays.stream(result).sorted().toArray();
    }
}