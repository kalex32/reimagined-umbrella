public class Solution {
    public static void main(String[] args) {
        f (1);
    }

    private static void f(int arg) {
        System.out.print (" " + arg);
        if (arg < 18) {
            f (arg+1);
        }
    }
}
