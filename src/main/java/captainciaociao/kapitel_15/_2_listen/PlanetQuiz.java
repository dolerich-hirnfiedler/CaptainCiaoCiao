package captainciaociao.kapitel_15._2_listen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PlanetQuiz {
    public static void main(String[] args) {
        List<Planets> shuffledPlanets = new ArrayList<>(Arrays.asList(Planets.values()));
        Collections.shuffle(shuffledPlanets);

        for (Planets question : shuffledPlanets) {
            System.out.printf("What is the diameter of plante %s (in km)?%n", question.name);

            List<Planets> misleadingPlanets = new ArrayList<>(Arrays.asList(Planets.values()));
            misleadingPlanets.remove(question);
            Collections.shuffle(misleadingPlanets);

            List<Planets> choicePlantes = misleadingPlanets.subList(0, 3);
            choicePlantes.add(question);
            Collections.shuffle(choicePlantes);
            choicePlantes.forEach(planet -> System.out.println(planet.diameter + " km"));

            Scanner scanner = new Scanner(System.in);
            if (scanner.nextInt() != question.diameter) {
                System.out.printf("Wrong! The diameter of %s is %d km.%d%n", question.name, question.diameter);
            } else {
                System.out.printf("Correct!%n%n");
            }
            scanner.close();
        }

    }
}
