public class FibLoop {
    public static void main(String[] args) {
        System.out.println (fib(10));
    }

    private static int fib(int arg){
        int[] data = new int[arg+1];
        data[0]=0;
        data[1]=1;
        for (int k = 2; k <data.length ; k++) {
            data[k]=data[k-2]+data[k-1];
        }
        return data[arg];
    }
}
