package ru.postlife.ads.lesson6;

import java.util.ArrayList;
import java.util.List;

public class HWApp6 {

    public static void main(String[] args) {
        int count = 20;
        List<Tree<Integer>> trees = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            Tree<Integer> tree = new TreeImpl<>();
            while (tree.getLevel() <= tree.getMaxLevel()) {
                int value = randNode();
                if (!tree.contains(value)) {
                    if (!tree.add(value)) {
                        break;
                    }
                }
            }
            trees.add(tree);
        }

        int countBalanced = 0;
        for (Tree<Integer> tree : trees) {
            System.out.println("isBalanced: " + tree.isBalanced(tree.getRoot()));
            System.out.println("level: " + tree.getLevel());
            if (tree.isBalanced(tree.getRoot())) {
                countBalanced++;
            }
            tree.display();
        }

        System.out.println("Percent balanced tree is " + (float) countBalanced / count);

    }

    public static int randNode() {
        return (int) (Math.random() * (50 + 1)) - 25;
    }
}
