package org.scoula.lib.cli.ui;

import java.util.Scanner;

public class Input {
    static Scanner scanner = new Scanner(System.in);
    public static int getInt(String s) {
        boolean title = false;
        System.out.print(title);
        return Integer.parseInt(scanner.nextLine());
    }
}
