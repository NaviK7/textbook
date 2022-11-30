package com.company.home;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager {


    public void write() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("notes4.txt"))) {
            String text = "Создать программу обработки текста учебника по программированию\n" +
                    "    классов  с использованием классов: Символ, Слово, Предложение, Знак препинания и др.\n" +
                    "     классов Найти наибольшее количество предложений текста,\n" +
                    "      в которых есть одинаковые слова классов.";
            bw.write(text);
            bw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void readBytes() {
        try (BufferedReader reader = new BufferedReader(new FileReader("notes4.txt"))) {
            int c;
            while ((c = reader.read()) != -1) {

                System.out.print((char) c);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public String readLines() {
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader("notes4.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return stringBuilder.toString();
    }

    public List<String> read() {
        List<String> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("notes.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                list.add(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

}
