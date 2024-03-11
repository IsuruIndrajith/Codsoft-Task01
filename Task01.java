import java.util.Random;
import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {
        System.out.println("...**** THE NUMBER GAME ***...");
        int marks = 0;
        char c = 'Y';
        // while loop
        while (c == 'Y') {
            System.out.println("A random number between 0 and 100 is generated...");
            Random random = new Random();
            int x = random.nextInt(101);

            // System.out.println(x);
            int chance = 0;

            int i = 1;
            while (i == 1) {
                chance++;
                System.out.println("Guess the random generated number");
                Scanner scanner = new Scanner(System.in);
                int n = scanner.nextInt();

                if (n < x) {
                    i = 1;
                    System.out.println("Low");

                } else if (n > x) {
                    i = 1;
                    System.out.println("High");
                } else {
                    i = 0;
                    System.out.println("Correct");
                    marks++;
                }

            }
            System.out.println("You took " + chance + " to get the answer.");
            System.out.print("Your marks = ");
            System.out.println(marks);
            System.out.println("Play again?[Yes=Y/No=N]");
            Scanner sc = new Scanner(System.in);
            char a = sc.next().charAt(0);
            c = a;

        }

    }
}
