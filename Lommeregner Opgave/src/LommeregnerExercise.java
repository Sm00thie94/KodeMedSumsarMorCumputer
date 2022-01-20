import java.util.Scanner;

public class LommeregnerExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Vil du +(1), minus(2), gange(3), dividere(4), eller afslut programmet(0)");
            int action = scanner.nextInt();
        } while (action >= 5) {
        int action = scanner.nextInt();
         action >= 5) {


            action = scanner.nextInt();
            System.out.println("Vil du +(1), minus(2), gange(3), dividere(4), eller afslut programmet(0)");
             action = scanner.nextInt();


        }
        int action2 = scanner.nextInt();
        if (action2 == 1) {
            System.out.println("Indtast tal");
            int x = scanner.nextInt();
            System.out.println("Indtast andet tal");
            int y = scanner.nextInt();
            System.out.println(y + x);


        }


    }
}


