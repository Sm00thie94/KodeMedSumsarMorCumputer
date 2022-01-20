import java.util.Scanner;

public class ScopeExercise {
    public static void main(String[] args) {
        int x;
    }

        {

            { // scopet må ikke rykkes
                Scanner scanner = new Scanner(System.in); //scanneren skal forblive inde i scopet
                System.out.println("Indtast et tal");
                int x = scanner.nextInt();
            } // scopet må ikke rykkes

            System.out.println(x); //Denne linje må ikke rykkes!

        }
    }
