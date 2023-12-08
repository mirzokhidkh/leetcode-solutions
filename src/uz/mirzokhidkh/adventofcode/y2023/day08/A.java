package uz.mirzokhidkh.adventofcode.y2023.day08;

import java.util.*;

public class A {

    public static void main(String[] args) {
        // Example input
        Map<String, List<String>> graph = new HashMap<>();
        graph.put("11A", Arrays.asList("11B", "XXX"));
        graph.put("11B", Arrays.asList("XXX", "11Z"));
        graph.put("11Z", Arrays.asList("11B", "XXX"));
        graph.put("22A", Arrays.asList("22B", "XXX"));
        graph.put("22B", Arrays.asList("22C", "22C"));
        graph.put("22C", Arrays.asList("22Z", "22Z"));
        graph.put("22Z", Arrays.asList("22B", "22B"));
        graph.put("XXX", Arrays.asList("XXX", "XXX"));

        int steps = escapeHauntedWasteland(graph, getStartNodes(graph, "A"), "Z");
        System.out.println("Steps to escape: " + steps);
    }

    public static int escapeHauntedWasteland(Map<String, List<String>> graph, List<String> startNodes, String targetSuffix) {
        Set<String> currentNodes = new HashSet<>(startNodes);
        int steps = 0;

        while (!areAllNodesAtTargetSuffix(currentNodes, targetSuffix)) {
            Set<String> nextNodes = new HashSet<>();

            for (String currentNode : currentNodes) {
                List<String> neighbors = graph.get(currentNode);
                if (neighbors != null) {
                    nextNodes.addAll(neighbors);
                }
            }

            currentNodes = nextNodes;
            steps++;
        }

        return steps;
    }

    public static List<String> getStartNodes(Map<String, List<String>> graph, String suffix) {
        List<String> startNodes = new ArrayList<>();

        for (String node : graph.keySet()) {
            if (node.endsWith(suffix)) {
                startNodes.add(node);
            }
        }

        return startNodes;
    }

    public static boolean areAllNodesAtTargetSuffix(Set<String> nodes, String targetSuffix) {
        for (String node : nodes) {
            if (!node.endsWith(targetSuffix)) {
                return false;
            }
        }
        return true;
    }
}
