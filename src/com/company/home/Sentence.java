package com.company.home;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sentence {
    private static final FileManager fileManager = new FileManager();
    private List<String> Sentence;

    public static List<String> getListSentence() {
        fileManager.readLines();
        String text = fileManager.readLines();
        text = text.replaceAll("\\s+", " ").replace("!", ".").replace("?", ".").replace("-", "");
        String[] words = text.split("\\.");
        return new ArrayList<>(Arrays.asList(words));
    }

    public static List<String> getListSentenceMax() {
        List<String> listSentenceMax = new ArrayList<>();
        List<String> list;
        String[] words;
        for (String sentence : getListSentence()) {
            words = sentence.split(" ");
            list = new ArrayList<>(Arrays.asList(words));
            if (list.contains(Word.getWordMax())) {
                listSentenceMax.add(sentence);
            }
        }
        return listSentenceMax;
    }


}
