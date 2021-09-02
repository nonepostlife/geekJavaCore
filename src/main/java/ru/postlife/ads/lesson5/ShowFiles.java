package ru.postlife.ads.lesson5;

import java.io.File;

public class ShowFiles {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\ilyha\\Documents\\geekJavaCore");
        viewFiles(file);
    }

    private static void viewFiles(File root, int level) {
        StringBuilder prefix = new StringBuilder();

//        prefix.append("\t".repeat(level));

        for (int i = 0; i < level; i++) {
            prefix.append("\t");
        }

        if (root.isFile()) {
            System.out.println(prefix + "File: " + root.getName());
        } else {
            System.out.println(prefix + "Dir: " + root.getName());
            level++;
            for (File file : root.listFiles()) {
                viewFiles(file, level);
            }
        }
    }

    private static void viewFiles(File root) {
        viewFiles(root, 0);
    }

}
