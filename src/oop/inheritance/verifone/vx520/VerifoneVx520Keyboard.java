package oop.inheritance.verifone.vx520;

public class VerifoneVx520Keyboard {

    static public VerifoneVx520Keyboard uniqueInstance;

    private VerifoneVx520Keyboard(){

    }

    static public VerifoneVx520Keyboard getInstance(){
        if(uniqueInstance == null) {
            uniqueInstance = new VerifoneVx520Keyboard();
        }
        return uniqueInstance;
    }

    public String get(){
        return "Key pressed";
    }
}
