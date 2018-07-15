class Party{

    public static void main (String[] args)
    {
        int[] a = {3,5,234,5,123,2,3,5};

        System.out.println(findMax(a, 0));
    }

    public static int findMax(int[] n, int max) {
        //if (n.length > max) {
          //  int next = findMax(n, max + 1);
            //System.out.println("next=" + next + " max=" + max);
            //return (n[max] > next) ? n[max] : next;

            if (max == n.length - 1) {
                return max;
            } else {int t = findMax (n, max + 1);
                return n[t] > n[max] ? t : max;


        }
    }
}