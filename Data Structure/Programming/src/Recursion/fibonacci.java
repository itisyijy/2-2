package Recursion;

public class fibonacci {
    public static long fibo(long n) {
        long result = 0;
        long pre = 1;
        long prepre = 0;
        for (long i = 0; i < n; i++) {
            result = pre + prepre;
            prepre = pre;
            pre = result;
        }
        return (result);
    }
    public static String isFibo(long n) {
        long i;
        for (i = 0; fibo(i) < n; i++)
            continue;
        if (fibo(i) == n)
            return ("IsFibo");
        else
            return ("IsNotFibo");
    }
}
