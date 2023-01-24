package Recursion;

public class powerSum {
    public static int pow(int x, int N) {
        int result = 1;
        for (int i = 0; i < N; i++)
            result = result * x;
        return (result);
    }

    public static int powerSum(int x, int N) {
        return (recursive(x, N, 1));
    }

    public static int recursive(int x, int N, int i) {
        int result = pow(i, N);
        if (result == x)
            return (1);
        if (result > x)
            return (0);
        return recursive(x, N, i + 1) + recursive(x - result, N, i + 1);
    }

}
