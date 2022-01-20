import java.util.Scanner;

public class ForExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        for (int x = 15; x > 0; x = x - 1) {
            System.out.println(x);
        }
        System.out.println("Indsast Nummer her:");
        int input = scanner.nextInt();
        for (int y = input; y > 0; y = y - 1) {
            System.out.println(y);
        }
        for (int z = 1;z <= 5; z++)  {
            System.out.print(z);
            System.out.println();

        }
        while (true) {
            int SelvBestemmer = scanner.nextInt();
            if (SelvBestemmer == 25) {
                break;
            }else {
                System.out.println(SelvBestemmer);
            }
        }

    }
}
/*Opgave 6.4:
Lav et while loop der køre forevigt "while (true)"
Inde i loopet skal du tage imod brugerinput og gemme det i en int variable, du bestemmer selv navnet på variablen
Hvis brugerinputtet er 25 så break ud af loopet.
hvis brugerinputtet ikke er 25 så print inputtet ud
Kan du nøjes med at bruge en if statement?*/