package be.intecbrussel;

import java.util.Arrays;

public class LeerkrachtBlunders {

    public static void main(String[] args) {


        int[] studentPoints = {1, 5, 6, -9, 77, 110, -4, 3, 10, 2};

        System.out.println("FinalArray is:  " + Arrays.toString(resultArray(studentPoints)));

    }

    public static int[] resultArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 10) {
                a[i] /= 11;
            }
            if (a[i] < 0) {
                a[i] = Math.abs(a[i]);
            }
            if (a[i] < 3) {
                a[i] *= 3;
            }
        }
        final var a1 = a;
        return a1;

    }
}


