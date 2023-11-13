package infra;

import core.SystemUi;

import java.util.Scanner;

public class TerminalSystemUi implements SystemUi {

    private final Scanner terminalScanner = new Scanner(System.in);


    @Override
    public int getIntInput() {
        return this.terminalScanner.nextInt();
    }

    @Override
    public String getStringInput() {return this.terminalScanner.next();}

    @Override
    public void displayMessage(String message) {
        System.out.println(message);
    }
}
