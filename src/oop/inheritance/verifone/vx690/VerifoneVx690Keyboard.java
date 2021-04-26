package oop.inheritance.verifone.vx690;

public class VerifoneVx690Keyboard {

    static public VerifoneVx690Keyboard uniqueInstance;

    private VerifoneVx690Keyboard(){

    }

    static public VerifoneVx690Keyboard getInstance(){
        if(uniqueInstance == null) {
            uniqueInstance = new VerifoneVx690Keyboard();
        }
        return uniqueInstance;
    }

    public String get(){
        return "Key pressed";
    }
}
