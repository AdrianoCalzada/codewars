package kyu4;

import java.util.*;

public class FrequentWords {

    public static List<String> top3(String text) {
        Map<String, Integer> freq = new HashMap<>();

        StringBuilder word = new StringBuilder();

        for (int i = 0; i <= text.length(); i++) {
            char c = (i < text.length()) ? text.charAt(i) : ' ';

            if (Character.isLetter(c) || c == '\'') {
                word.append(Character.toLowerCase(c));
            } else {
                processWord(word, freq);
            }
        }

        // Keep only top 3 without sorting everything
        PriorityQueue<Map.Entry<String, Integer>> top =
                new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));

        for (Map.Entry<String, Integer> entry : freq.entrySet()) {
            top.offer(entry);
            if (top.size() > 3) {
                top.poll();
            }
        }

        List<String> result = new ArrayList<>();
        while (!top.isEmpty()) {
            result.add(top.poll().getKey());
        }

        Collections.reverse(result); // descending order
        return result;
    }

    private static void processWord(StringBuilder word, Map<String, Integer> freq) {
        if (word.length() == 0) return;

        // Word must contain at least one letter
        boolean hasLetter = false;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isLetter(word.charAt(i))) {
                hasLetter = true;
                break;
            }
        }

        if (hasLetter) {
            String w = word.toString();
            freq.put(w, freq.getOrDefault(w, 0) + 1);
        }

        word.setLength(0);
    }
}
