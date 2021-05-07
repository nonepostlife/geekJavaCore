package ru.postlife.java.xo;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp4 {
    private static char[][] map;
    private static final int SIZE_MAP = 3;

    private static final char DOT_X = '✗';
    private static final char DOT_O = '♡';
    private static final char DOT_EMPTY = '·';

    private static Scanner scanner;


    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        initMap();
        printMap();
        while (true) {
            playerTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил игрок");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE_MAP; i++) {
            for (int j = 0; j < SIZE_MAP; j++) {
                if (map[i][j] == DOT_EMPTY)
                    return false;
            }
        }
        return true;
    }

    public static boolean checkWin(char symbol) {
        int countRow = 0;
        int countCol = 0;
        int countMainDiagonal = 0;
        int countSideDiagonal = 0;

        for (int i = 0; i < SIZE_MAP; i++) {
            // проверка главной и побочной диагонали
            if (map[i][i] == symbol) {
                countMainDiagonal++;
            }
            if (map[i][SIZE_MAP - i - 1] == symbol) {
                countSideDiagonal++;
            }
            if (countMainDiagonal == SIZE_MAP || countSideDiagonal == SIZE_MAP) {
                return true;
            }

            // проверка строк и столбцов
            for (int j = 0; j < SIZE_MAP; j++) {
                if (map[i][j] == symbol) {
                    countRow++;
                }
                if (map[j][i] == symbol) {
                    countCol++;
                }
            }
            if (countRow == SIZE_MAP || countCol == SIZE_MAP) {
                return true;
            }
            countRow = 0;
            countCol = 0;
        }
        return false;
    }

    public static int[] findWinOrBlockPlayer(char symbol) {
        int countRow = 0;
        int countCol = 0;
        int countMainDiagonal = 0;
        int countSideDiagonal = 0;

        for (int i = 0; i < SIZE_MAP; i++) {
            // проверка главной и побочной диагонали
            if (map[i][i] == symbol) {
                countMainDiagonal++;
            }
            if (map[i][SIZE_MAP - i - 1] == symbol) {
                countSideDiagonal++;
            }
            if (countMainDiagonal == SIZE_MAP - 1) {
                for (int k = 0; k < SIZE_MAP; k++) {
                    if (map[k][k] == DOT_EMPTY)
                        return new int[]{k, k};
                }
            }
            if (countSideDiagonal == SIZE_MAP - 1) {
                for (int k = 0; k < SIZE_MAP; k++) {
                    if (map[k][SIZE_MAP - k - 1] == DOT_EMPTY)
                        return new int[]{k, SIZE_MAP - k - 1};
                }
            }

            // проверка строк и столбцов
            for (int j = 0; j < SIZE_MAP; j++) {
                if (map[i][j] == symbol) {
                    countRow++;
                }
                if (map[j][i] == symbol) {
                    countCol++;
                }
            }
            if (countRow == SIZE_MAP - 1) {
                for (int k = 0; k < SIZE_MAP; k++) {
                    if (map[i][k] == DOT_EMPTY)
                        return new int[]{i, k};
                }
            }
            if (countCol == SIZE_MAP - 1) {
                for (int k = 0; k < SIZE_MAP; k++) {
                    if (map[k][i] == DOT_EMPTY)
                        return new int[]{k, i};
                }
            }
            countRow = 0;
            countCol = 0;
        }
        return new int[]{};
    }

    public static void aiTurn() {
        int[] positionToWin = findWinOrBlockPlayer(DOT_O);
        if (positionToWin.length != 0) {
            System.out.println("ИИ вырывает победу победу в (x,y) = (" + (positionToWin[0] + 1) + "," + (positionToWin[1] + 1) + ")");
            map[positionToWin[0]][positionToWin[1]] = DOT_O;
            return;
        }

        int[] positionToBlock = findWinOrBlockPlayer(DOT_X);
        if (positionToBlock.length != 0) {
            System.out.println("ИИ блокирует победу игрока в (x,y) = (" + (positionToBlock[0] + 1) + "," + (positionToBlock[1] + 1) + ")");
            map[positionToBlock[0]][positionToBlock[1]] = DOT_O;
            return;
        }
        Random random = new Random();
        int x, y;
        do {
            x = random.nextInt(SIZE_MAP);
            y = random.nextInt(SIZE_MAP);
        } while (!isCellValid(x, y));
        System.out.println("ИИ походил в точку (x,y) = (" + (x + 1) + "," + (y + 1) + ")");
        map[x][y] = DOT_O;
    }

    public static void playerTurn() {

        int x, y;
        do {
            System.out.println("Введите координаты вашего хода X и Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[x][y] = DOT_X;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE_MAP || y < 0 || y >= SIZE_MAP)
            return false;
        if (map[x][y] == DOT_EMPTY)
            return true;
        return false;
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE_MAP; i++) {
            System.out.print((i) + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE_MAP; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE_MAP; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void initMap() {
        map = new char[SIZE_MAP][SIZE_MAP];
        for (int i = 0; i < SIZE_MAP; i++) {
            for (int j = 0; j < SIZE_MAP; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }
}
