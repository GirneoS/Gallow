package org.example;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        Gallow gallow = new Gallow();
        gallow.DrawTheGallow();

        Word obj_word = new Word();
        String word = obj_word.getWord();
        String[] mystery = obj_word.Mystery(word);

        Game game = new Game(word, mystery);
        game.startGame();
    }
}
