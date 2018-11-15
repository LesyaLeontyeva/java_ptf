package ru.stqa.pft.sandbox;

public class Primes {
    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) { // вместо i = i + 1 можно написать i += 1,
            // а i++ используется в том случае если прибавляется единица, i++ называется инкремент
            // также есть декремент i--
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimeFast(int n) {
        int m = (int) Math.sqrt(n);
        for (int i = 2; i < m; i++) { // вместо i = i + 1 можно написать i += 1,
            // а i++ используется в том случае если прибавляется единица, i++ называется инкремент
            // также есть декремент i--
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimeWhile(int n) {
        int i = 2;
        while (i < n && n % i != 0) {
            i++;
        }
        return i == n;
    }

    public static boolean isPrime(long n) {
        for (int i = 2; i < n; i++) { // вместо i = i + 1 можно написать i += 1,
            // а i++ используется в том случае если прибавляется единица, i++ называется инкремент
            // также есть декремент i--
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

