package com.java.patterns.Chain_of_Responsibility;

public class Main {
    public static void main(String[] args) {
        Message message = new Message("A", 20, OfficerRank.CAPTAIN);

        Officer sergeant = new Sergeant();
        Officer captain = new Captain();
        Officer general = new General();

        sergeant.setSuperiorOfficer(captain);
        captain.setSuperiorOfficer(general);

        sergeant.processMessage(message);
    }
}
