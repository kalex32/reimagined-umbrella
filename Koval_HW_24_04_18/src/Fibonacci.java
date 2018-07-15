public class Fibonacci {
    /* Числа Фибоначчи через рекурсию
    реализовать логику метода fibonacci, где n- это номер элемента в последовательности Фибоначчи.
    Первые элемента этого ряда: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34..
     */
    static int fib(int n) {
        System.out.print (" " + n);
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib (n - 2) + fib (n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.print (" " );
        System.out.println (fib (5));
    }
}
