package captainciaociao.kapitel_9._1_lambda_ausdruecke.quiz_4;

public class Ackamarackus {
    @FunctionalInterface
    interface Flummadiddle {
        void razzmatazz();
    }

    public static void main(String[] args) {
        Flummadiddle a = () -> System.out.println();
        Flummadiddle b = () -> {
            System.out.println();
        };
        Flummadiddle d = () -> {
            System.out.println();
            return;
        };
        Flummadiddle e = System.out::println;
    }
}
