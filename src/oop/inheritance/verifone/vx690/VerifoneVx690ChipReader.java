package oop.inheritance.verifone.vx690;

import oop.inheritance.data.Card;
import oop.inheritance.data.EntryMode;
import oop.inheritance.data.ExpirationDate;

public class VerifoneVx690ChipReader {

    static public VerifoneVx690ChipReader uniqueInstance;

    private VerifoneVx690ChipReader(){

    }

    static public VerifoneVx690ChipReader getInstance(){
        if(uniqueInstance == null) {
            uniqueInstance = new VerifoneVx690ChipReader();
        }
        return uniqueInstance;
    }

    public Card readCard() {
        return Card.builder()
                .account("4558211532252558")
                .entryMode(EntryMode.INSERTED)
                .expirationDate(ExpirationDate.builder()
                        .year(20)
                        .month(8)
                        .build())
                .build();
    }

}
