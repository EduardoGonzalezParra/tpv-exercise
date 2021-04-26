package oop.inheritance.verifone.vx520;

import oop.inheritance.core.TPVPrinter;

public class VerifoneVx520Printer implements TPVPrinter {

    static public VerifoneVx520Printer uniqueInstance;

    private VerifoneVx520Printer(){

    }

    static public VerifoneVx520Printer getInstance(){
        if(uniqueInstance == null) {
            uniqueInstance = new VerifoneVx520Printer();
        }
        return uniqueInstance;
    }

    /**
     * Prints a message on the current line at the specified horizontal position
     *
     * @param x       horizontal offset
     * @param message Message to be printed
     */
    public void print(int x, String message) {

    }

    /**
     * Add a line break to the paper
     */
    public void lineFeed() {
    }

}
