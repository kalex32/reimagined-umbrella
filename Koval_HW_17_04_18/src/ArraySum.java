public class ArraySum {
    public static void main(String[] args) {
        int myArray[] = {3, 5, 7, 12};
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i];
        }
        System.out.println (sum);
    }
}
