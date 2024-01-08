package org.example;


import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Word {
    Charset charset;
    Path file;

    public Word() {
        this.charset = Charset.forName("WINDOWS-1251");
        this.file = Paths.get("words.txt");
    }

    public String getWord() {
        String word = "";
        ArrayList<String> words = new ArrayList<>();
        try (BufferedReader reader = Files.newBufferedReader(file, charset)) {
            while (true) {
                String flag = reader.readLine();
                if (flag != null) {
                    words.add(flag);
                } else {
                    break;
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        word = (String) words.toArray()[new Random().nextInt(words.size())];
        return word;
    }

    public String[] Mystery(String word) {
        String[] mystery = new String[word.length()];
        Arrays.fill(mystery, "*");

        return mystery;
    }

}
