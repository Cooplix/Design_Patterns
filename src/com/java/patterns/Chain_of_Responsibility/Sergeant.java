package com.java.patterns.Chain_of_Responsibility;

public class Sergeant extends Officer {

    private static final int CODE = 10;
    private static final String NAME = "Sergeant";

    @Override
    public void processMessage(Message message) {
        if(message.getOfficerRank().equals(OfficerRank.SERGEANT) && message.getCode() == CODE) {
            System.out.println(NAME + "received message: " + message.getContent());
        } else {
            getSuperiorOfficer().processMessage(message);
        }
    }
}
