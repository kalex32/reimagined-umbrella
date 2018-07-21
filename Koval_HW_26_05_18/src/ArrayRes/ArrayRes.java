package ArrayRes;

import java.util.Arrays;

class ArrayRes {
    private int[] arrayR;

    ArrayRes(int x) {
        this.arrayR = new int[x];
    }

    int[] getArrayR() {
        return arrayR;
    }

    void arrayInsert(int value, int index) {
        arrayR[index] = value;
    }

    void arrayPrint(int[] arrayR) {
        System.out.println(Arrays.toString(arrayR));
    }
}
