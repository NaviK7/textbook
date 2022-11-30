package com.company.home;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Word {
    private static final FileManager fileManager = new FileManager();

    public static String getWordMax() {
        String text = fileManager.readLines();
        text = text.replaceAll("\\s+", " ").replace("!", ".").replace("?", ".").replace("-", "").replace(". ", " ");
        String[] words = text.split(" ");
        List<String> wordList = new ArrayList<>(Arrays.asList(words));
        List<Integer> integerList = new ArrayList<>();
        for (String word : wordList) {
            integerList.add(Collections.frequency(wordList, word));
        }
        int max = Collections.max(integerList);
        String str = null;
        for (String word : wordList) {
            if (Collections.frequency(wordList, word) == max) {
                str = word;
            }
        }
        return str;
    }
}
