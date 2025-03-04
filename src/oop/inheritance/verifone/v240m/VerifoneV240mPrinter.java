package oop.inheritance.verifone.v240m;

import oop.inheritance.core.TPVPrinter;

import java.awt.event.WindowStateListener;

public class VerifoneV240mPrinter implements TPVPrinter {

    public static VerifoneV240mPrinter uniqueInstance;

    private VerifoneV240mPrinter(){

    }

    public static VerifoneV240mPrinter getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new VerifoneV240mPrinter();
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
