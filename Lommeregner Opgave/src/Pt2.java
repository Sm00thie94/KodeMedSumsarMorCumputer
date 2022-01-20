import java.util.Scanner;

public class Pt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


            System.out.println("Vil du +(1), minus(2), gange(3), dividere(4), eller hvad som helst andet for at afslutte programmet");
            int action = scanner.nextInt();
            if (action == 1) {
                System.out.println("Indtast tal");
                int x = scanner.nextInt();
                System.out.println("Indtast andet tal");
                int y = scanner.nextInt();
                System.out.println(x + y);
            } else if (action == 2) {
                System.out.println("Indtast tal");
                int x = scanner.nextInt();
                System.out.println("Indtast andet tal");
                int y = scanner.nextInt();
                System.out.println(x - y);
            } else if (action == 3) {
                System.out.println("Indtast tal");
                int x = scanner.nextInt();
                System.out.println("Indtast andet tal");
                int y = scanner.nextInt();
                System.out.println(x * y);
            } else if (action == 4) {
                System.out.println("Indtast tal");
                int x = scanner.nextInt();
                System.out.println("Indtast andet tal");
                int y = scanner.nextInt();
                System.out.println(x / y);
            }



    }
}