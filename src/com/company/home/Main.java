package com.company.home;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Main {
    /**
     * Создать программу обработки текста учебника по программированию
     * с использованием классов: Символ, Слово, Предложение, Знак препинания и др.
     * Найти наибольшее количество предложений текста,
     * в которых есть одинаковые слова.
     * <p>
     * Заменена табуляция и последовательность пробелов одним пробелом.
     * последовательность решения : поиск слова,
     * которое встречается максимальное число раз,
     * достаём множество предложений,
     * проверяем все слова из собранных предложений,
     * кроме максимального,
     * проверяем все предложения, кроме уже собранных,
     * проверяем каждое предложение, можно ли его добавить во множество,
     * чтобы не нарушить правило.
     * <p>
     * Вводим понятие ранга предложения = к-во уникальных предложений,
     * в которых встречаются его слова. Для получения такого списка -
     * карта слов на множество предложений.
     * Из карты получаем счётчик уникальных предложений.
     */

    public static void main(String[] args) throws IOException {

       // System.out.println(Word.getWordMax());
        for (String s:Sentence.getListSentenceMax()) {
            System.out.println(s);
        }

    }
}



