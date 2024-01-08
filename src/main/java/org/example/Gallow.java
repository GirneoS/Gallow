package org.example;

public class Gallow {
    public void DrawTheGallow() {
        System.out.println("  __\n |\t|\n\t|\n\t|\n\t|\n\t|\n\t|\n^^^^^^^\n--------------");
    }

    public String UpdateTheGallow(int mistakes) {
        String[] newGallow = "  __\n |\t|\n\t|\n\t|\n\t|\n\t|\n\t|\n^^^^^^^\n--------------".split("\n");


        if (mistakes == 1) {
            newGallow[2] = " O" + newGallow[2];
        }
        if (mistakes == 2) {
            newGallow[2] = " O" + newGallow[2];
            newGallow[3] = " | " + newGallow[3];
            newGallow[4] = " |" + newGallow[4];
        }
        if (mistakes == 3) {
            newGallow[2] = " O" + newGallow[2];
            newGallow[3] = "\\| " + newGallow[3];
            newGallow[4] = " |" + newGallow[4];
        }
        if (mistakes == 4) {
            newGallow[2] = " O" + newGallow[2];
            newGallow[3] = "\\|/" + newGallow[3];
            newGallow[4] = " |" + newGallow[4];
        }
        if (mistakes == 5) {
            newGallow[2] = " O" + newGallow[2];
            newGallow[3] = "\\|/" + newGallow[3];
            newGallow[4] = " |" + newGallow[4];
            newGallow[5] = "/  " + newGallow[5];
        }
        if (mistakes == 6) {
            newGallow[2] = " O" + newGallow[2];
            newGallow[3] = "\\|/" + newGallow[3];
            newGallow[4] = " |" + newGallow[4];
            newGallow[5] = "/ \\" + newGallow[5];
        }
        return String.join("\n", newGallow);
    }
}
