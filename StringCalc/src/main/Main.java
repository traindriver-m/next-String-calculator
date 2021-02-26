package main;

import operation.Delit;
import operation.Minus;
import operation.Plus;
import operation.Umnojit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().start();

    }

    private void start() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String f = scanner.nextLine();
            int c = 0;
            int r = 0;
            for (char x : f.toCharArray()) {
                if (r == 0 && x != '"') {
                    System.err.println("Не соответствует условию!(main)");
                    System.exit(1);
                }
                r++;
                if (x == '"' && c < 2)
                    c++;
                else if (c >= 2)
                    switch (x) {
                        case '+':
                            Plus plus = new Plus();
                            plus.operation(f);
                            break;
                        case '-':
                            Minus minus = new Minus();
                            minus.operation(f);
                            break;
                        case '*':
                            new Umnojit().operation(f);
                            break;
                        case '/':
                            new Delit().operation(f);
                            break;


                    }

            }
        }
    }
}