package oop.inheritance.verifone.vx520;

import oop.inheritance.core.TPVDisplay;

public class VerifoneVx520Display implements TPVDisplay {

    static public VerifoneVx520Display uniqueInstance;

    private VerifoneVx520Display(){

    }

    static public VerifoneVx520Display getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new VerifoneVx520Display();
        }
        return uniqueInstance;
    }

    /**
     * Prints a message to specied position
     *
     * @param x       horizontal position
     * @param y       vertical position
     * @param message message to be printed
     */
    public void showMessage(int x, int y, String message) {
    }

    /**
     * Clears the screen
     */
    public void clear() {

    }
}
