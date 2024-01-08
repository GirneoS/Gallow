package org.example;

import java.util.HashSet;
import java.util.Scanner;

public class Game {
    private final String word;
    private final String[] mystery;

    public Game(String word, String[] mystery) {
        this.word = word;
        this.mystery = mystery;
    }

    public void startGame() throws InterruptedException {
        int mistakes = 0;
        String gallow;
        HashSet<String> rightAnswers = new HashSet<>();
        HashSet<String> wrongAnswers = new HashSet<>();

        while (true) {
            System.out.println(String.join(" ", mystery));
            System.out.println("Предположите, какая буква встречается в загадке:");

            Scanner in = new Scanner(System.in);
            String letter = in.nextLine().toLowerCase();


            if (rightAnswers.contains(letter)) {
                System.out.println("Вы уже отгадали эту букву");
                Thread.sleep(1000);
                continue;
            } else if (wrongAnswers.contains(letter)) {
                System.out.println("Вы уже вводили эту букву, ее нет в слове");
                Thread.sleep(1000);
                continue;
            }

            if (word.contains(letter)) {
                for (int i = 0; i < word.length(); i++) {
                    if (letter.equals(Character.toString(word.charAt(i)))) {
                        mystery[i] = letter;
                        rightAnswers.add(letter);
                    }
                }
                System.out.println("Вы правы, теперь ваша загадка выглядит так: " + String.join(" ", mystery));
                System.out.println("Колличество ошибок: " + mistakes);
                if (!String.join(" ", mystery).contains("*")) {
                    System.out.println("Вы победили, урааа!");
                    Thread.sleep(5000);
                    break;
                }
            } else {
                wrongAnswers.add(letter);
                mistakes++;
                System.out.println("Вы не угадали, в загадке нет буквы  " + letter.toUpperCase());
                System.out.println("Количество ошибок: " + mistakes);
                gallow = new Gallow().UpdateTheGallow(mistakes);
                System.out.println(gallow);
                if (mistakes >= 6) {
                    System.out.println("Вы проиграли");
                    System.out.println("Это было слово  " + word);
                    Thread.sleep(5000);
                    break;
                }
            }
        }
    }
}
