package oop.inheritance.verifone.v240m;

import oop.inheritance.data.Card;
import oop.inheritance.data.EntryMode;
import oop.inheritance.data.ExpirationDate;

public class VerifoneV240mChipReader {

    static public VerifoneV240mChipReader uniqueInstance;

    private VerifoneV240mChipReader(){

    }

    static public VerifoneV240mChipReader getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new VerifoneV240mChipReader();
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
