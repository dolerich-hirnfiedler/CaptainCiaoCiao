package captainciaociao.kapitel_2.variablenunddatentypen.aufgabe2_3_2;

import java.util.ArrayList;

public class Crew {
    private ArrayList<Crewmember> crewmembers = new ArrayList<>();
    private Captain captain;

    private ArrayList<Crewmember> generateCrewmembers(int amountCrewmembers) {
        ArrayList<Crewmember> crewmembers = new ArrayList<>();
        for (int i = 0; i < amountCrewmembers; i++) {
            crewmembers.add(new Crewmember());
        }
        return crewmembers;
    }

    public Crew(int amountCrewmembers) {
        this.crewmembers = generateCrewmembers(amountCrewmembers);
        this.captain = new Captain();
    }

    public int getCrewmembersSize() {
        return crewmembers.size();
    }
}
