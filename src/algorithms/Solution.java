package algorithms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Solution {
    /**
     * @param words1: a list of string
     * @param words2: a list of string
     * @param pairs: a list of string pairs
     * @return: return a boolean, denote whether two sentences are similar or not
     */
    public boolean isSentenceSimilarity(String[] words1, String[] words2, List<List<String>> pairs) {
        if ((words1 == null && words2 == null) && (words1.length == 0 && words2.length == 0)) {
            return true;
        }
        if (words1.length != words2.length) {
            return false;
        }

        Map<String, Set<String>> graph = new HashMap<>();
        for (List<String> pair : pairs) {
            graph.computeIfAbsent(pair.get(0), x -> new HashSet<>()).add(pair.get(1));
            graph.computeIfAbsent(pair.get(1), x -> new HashSet<>()).add(pair.get(0));
        }

        for (int i = 0; i < words1.length; i++) {
            if (words1[i].equals(words2[i])) {
                continue;
            }
            if (!graph.containsKey(words1[i]) || !graph.get(words1[i]).contains(words2[i])) {
                return false;
            }
        }

        return true;
    }
}