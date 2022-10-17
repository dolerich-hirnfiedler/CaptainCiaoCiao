package captainciaociao.kapitel_15._2_listen;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class Ship {
    private List<String> persons = new ArrayList<>();

    void addName(String name) {
        persons.add(name);
    }

    boolean contains(String name) {
        return persons.contains(name);
    }

    @Override
    public String toString() {
        return "" + persons;
    }

    public static void main(String[] args) {
        List<Ship> ships = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            ships.add(new Ship());
        }
        ships.get(new Random().nextInt(ships.size())).addName("Covid Cough");
        int index = new Random().nextInt(ships.size());
        ListIterator<Ship> iterator = ships.listIterator(index);
    }
}
