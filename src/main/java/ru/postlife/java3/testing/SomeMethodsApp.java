package ru.postlife.java3.testing;

import java.util.Arrays;

public class SomeMethodsApp {
    public int[] getArrayAfterLastFour(int[] array) {
        if (array.length == 0) {
            throw new ArrayZeroSizeException();
        }
        int indexLastFour = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 4) {
                indexLastFour = i;
            }
        }
        if (indexLastFour == -1) {
            throw new RuntimeException("Array dont contains fours");
        }
        return Arrays.copyOfRange(array, indexLastFour + 1, array.length);
    }

    public boolean isContainOnlyOneAndFour(int[] array) {
        if (array.length == 0) {
            throw new ArrayZeroSizeException();
        }
        int countOne = 0;
        int countFour = 0;
        for (int j : array) {
            if (j == 1) {
                countOne++;
            } else if (j == 4) {
                countFour++;
            } else {
                return false;
            }
        }
        return countOne > 0 && countFour > 0;
    }
}
