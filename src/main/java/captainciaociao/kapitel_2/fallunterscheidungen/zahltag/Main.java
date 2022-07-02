package captainciaociao.kapitel_2.fallunterscheidungen.zahltag;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String payment = "";
        double paymentValue = 1000;
        double lowerBound = paymentValue * 0.9;
        double upperBound = paymentValue * 1.2;
        double paymentDouble;
        while (true) {
            System.out.printf("Enter payment: ");
            payment = scanner.next();
            if (payment.matches("([0-9]+)(,|.)([0-9]{2})")) {
                paymentDouble = Double.parseDouble(payment);
                break;

            } else {
                System.out.printf("Invalid Input. PLease try again %n");
            }
        }
        if (paymentDouble < lowerBound || paymentDouble > upperBound) {
            System.out.printf("You son of a bitch%n");
        } else {
            System.out.printf("Good boy!%n");
        }
        scanner.close();
    }
}
