package lab7;

import java.util.Scanner;

public class arrayGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How big is the game array? ");
        int n = input.nextInt();

        System.out.print("What is the leap size? ");
        int leap = input.nextInt();

        int[] game = generateGameArray(n);

        System.out.print("Game array: ");
        for (int v : game) System.out.print(v + " ");
        System.out.println();

        System.out.println(arrayGame(leap, game) ? "YES" : "NO");

        input.close();
    }

    private static int[] generateGameArray(int size) {
        int[] game = new int[size];
        game[0] = 0;
        for (int i = 1; i < game.length; i++) {
            game[i] = (int)(Math.random() * 2);
        }
        return game;
    }

    static boolean arrayGame(int leap, int[] game) {
        return canWin(0, leap, game);
    }

    static boolean canWin(int i, int leap, int[] game) {
        if (i >= game.length) return true;
        if (i < 0 || game[i] == 1) return false;

        game[index] = 1;

        return canWin(i + leap, leap, game) ||
            canWin(i + 1, leap, game)   ||
            canWin(i - 1, leap, game);
    }
}