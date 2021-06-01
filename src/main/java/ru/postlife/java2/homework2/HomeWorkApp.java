package ru.postlife.java2.homework2;

public class HomeWorkApp {
    public static void main(String[] args) {

        String[][] matrix = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "0", "1", "2"},
        };

        String[][] matrix2 = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "0", "1"},
                {"3", "4", "5", "6"}
        };

        String[][] matrix3 = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "0", "1", "2S"},
                {"3", "4", "5", "6"}
        };

        String[][] matrix4 = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "0", "1", "2"},
                {"3", "4", "5", "6"}
        };

        System.out.println(sumStringMatrixElement(matrix));
        //System.out.println(sumStringMatrixElement(matrix2));
        //System.out.println(sumStringMatrixElement(matrix3));
        //System.out.println(sumStringMatrixElement(matrix4));
    }

    public static int sumStringMatrixElement(String[][] array) {
        int sum = 0;

        if (array.length != 4) {
            throw new MyArraySizeException(array.length);
        }

        for (int i = 0; i < array.length; i++) {
            if(array[i].length != 4){
                throw new MyArraySizeException(i, array[i].length);
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e){
                    throw new MyArrayDataException(array[i][j], i, j);
                }
            }
        }
        return sum;
    }
}
