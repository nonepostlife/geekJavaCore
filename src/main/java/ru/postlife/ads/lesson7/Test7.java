package ru.postlife.ads.lesson7;;

public class Test7 {

    public static void main(String[] args) {
//        testGraph();
//        testDfs();
        //testBfs();
        testFindShortPathViaBfs();
    }

    private static void testFindShortPathViaBfs() {
        Graph graph = new GraphImpl(11);
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");
        graph.addVertex("G");
        graph.addVertex("H");
        graph.addVertex("I");
        graph.addVertex("J");
        graph.addVertex("K");

        graph.addEdge("A", "B", 2);
        graph.addEdge("A", "C", 3);
        graph.addEdge("A", "D", 5);
        graph.addEdge("A", "E", 2);
        graph.addEdge("B", "F", 7);
        graph.addEdge("C", "F", 3);
        graph.addEdge("D", "G", 2);
        graph.addEdge("F", "I", 6);
        graph.addEdge("G", "I", 1);
        graph.addEdge("E", "H", 7);
        graph.addEdge("G", "J", 3);
        graph.addEdge("H", "J", 2);
        graph.addEdge("I", "K", 3);
        graph.addEdge("J", "K", 1);

        graph.display();

        graph.findShortPathViaBfs("A", "K");
    }

//    private static void testGraph() {
//        Graph graph = new GraphImpl(4);
//        graph.addVertex("A");
//        graph.addVertex("B");
//        graph.addVertex("C");
//        graph.addVertex("D");
//
//        graph.addEdge("A", "B", "C");
//        graph.addEdge("B", "C", "D");
//        graph.addEdge("C", "A", "B", "D");
//        graph.addEdge("D", "B", "C");
//
//        System.out.println("Size of graph is " + graph.getSize());
//        graph.display();
//    }
//
//    private static void testDfs() {
//        Graph graph = new GraphImpl(7);
//        graph.addVertex("A");
//        graph.addVertex("B");
//        graph.addVertex("C");
//        graph.addVertex("D");
//        graph.addVertex("E");
//        graph.addVertex("F");
//        graph.addVertex("G");
//
//        graph.addEdge("A", "B", "C", "D");
//        graph.addEdge("B", "E");
//        graph.addEdge("D", "F");
//        graph.addEdge("F", "G");
//
//        graph.dfs("A");
//    }
//
//    private static void testBfs() {
//        Graph graph = new GraphImpl(8);
//        graph.addVertex("A");
//        graph.addVertex("B");
//        graph.addVertex("C");
//        graph.addVertex("D");
//        graph.addVertex("E");
//        graph.addVertex("F");
//        graph.addVertex("G");
//        graph.addVertex("H");
//
//        graph.addEdge("A", "B", "C", "D");
//        graph.addEdge("B", "E");
//        graph.addEdge("E", "H");
//        graph.addEdge("C", "F");
//        graph.addEdge("D", "G");
//
//        graph.bfs("A");
//    }
}
