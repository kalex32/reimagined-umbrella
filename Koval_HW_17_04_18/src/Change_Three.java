import java.util.Arrays;

public class Change_Three {
    public static void main(String[] args) {
        int[] arr = {10, 18, 12, 19, 234, 865, 65364, 442, 54, 658, 87, 91239, 86, 6, 7564};
        System.out.println (Arrays.toString (arr));
        System.out.println (" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] %3 == 0){
                arr[i] = 3;
            }
        }
        System.out.println (Arrays.toString (arr));
    }
}
