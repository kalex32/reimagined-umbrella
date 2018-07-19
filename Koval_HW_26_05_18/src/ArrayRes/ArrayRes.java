package ArrayRes;

import java.util.Arrays;

class ArrayRes {
    private int[] arrayR;

    ArrayRes(int[] x) {
        arrayR = x;
    }

    int[] getArrayR() {
        return arrayR;
    }

    void arrayInsert(int value, int index) {
        arrayR[index] = value;
    }

    void arrayPrint(ArrayRes[] arrayRes) {
        System.out.println(Arrays.toString(arrayRes));
    }
}
