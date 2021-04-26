package oop.inheritance.verifone.v240m;

import oop.inheritance.core.TPVDisplay;

public class VerifoneV240mDisplay implements TPVDisplay {

    public static VerifoneV240mDisplay uniqueInstance;

    private VerifoneV240mDisplay(){

    }

    public static VerifoneV240mDisplay getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new VerifoneV240mDisplay();
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
