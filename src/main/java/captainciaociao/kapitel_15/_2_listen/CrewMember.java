package captainciaociao.kapitel_15._2_listen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CrewMember {
    enum Profession {
        CAPTAIN, NAVIGATOR, CARPENDER, COOK, MUSICIAN, DOCTOR
    }

    String name;
    Profession profession;

    /**
     * @param name
     * @param profession
     */
    public CrewMember(String name, Profession profession) {
        this.name = name;
        this.profession = profession;
    }

    static boolean areSameNumberOfCooksAndMusicians(List<CrewMember> crew) {
        int cooks = 0;
        int musicians = 0;
        for (CrewMember member : crew) {
            if (member.profession.equals(Profession.MUSICIAN)) {
                musicians++;
            }
            if (member.profession.equals(Profession.COOK)) {
                cooks++;
            }
        }

        return cooks == musicians;
    }

    public static void main(String[] args) {
        CrewMember captain = new CrewMember("CiaoCiao", Profession.CAPTAIN);
        CrewMember cook1 = new CrewMember("Remy", Profession.COOK);
        CrewMember cook2 = new CrewMember("The Witch Cook", Profession.COOK);
        CrewMember musician1 = new CrewMember("Mahna Mahna", Profession.MUSICIAN);
        CrewMember musician2 = new CrewMember("Rowlf", Profession.MUSICIAN);

        List<CrewMember> crew1 = Arrays.asList(cook1, musician1);
        System.out.println(areSameNumberOfCooksAndMusicians(crew1));

        List<CrewMember> crew2 = Arrays.asList(cook1, musician1, musician2, captain);
        System.out.println(areSameNumberOfCooksAndMusicians(crew2));

        List<CrewMember> crew3 = new ArrayList<>();
        crew3.addAll(crew2);
        crew3.add(cook2);

        System.out.println(areSameNumberOfCooksAndMusicians(crew3));
    }

}
