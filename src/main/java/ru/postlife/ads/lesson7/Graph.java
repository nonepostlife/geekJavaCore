package ru.postlife.ads.lesson7;

import java.util.Queue;
import java.util.Stack;

public interface Graph {

    void addVertex(String label);

    boolean addEdge(String startLabel, String secondLabel, int length);

    int getSize();

    void display();

    /**
     * англ. Depth-first search, DFS
     */
    void dfs(String startLabel);

    /**
     * англ. breadth-first search, BFS
     */
    void bfs(String startLabel);

    Stack<String> findShortPathViaBfs(String startLabel, String finishLabel);

}
