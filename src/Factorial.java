public class Factorial {
    public static long fact(int n, long fact){
        if (n == 1)
            return fact;
        else
            return fact(n-1,fact * n);
    }

    public static void main(String[] args) {
        System.out.println(fact(50,1));
    }
}
