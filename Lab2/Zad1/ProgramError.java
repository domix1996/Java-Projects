import java.util.Scanner;

public class ProgramError {
    public static void main (String[] args) 
    {
        int num1, num2, num3;
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Wprowadź pierwszą liczbę z jedną cyfrą: ");
            num1 = input.nextInt();

            int length1 = String.valueOf(num1).length();

            if (length1 != 1) {
                System.out.print("Liczba " + num1 + " nie jest liczbą jednocyfrową !");
                return;
            }

            System.out.print("Wprowadź drugą liczbę z dwoma cyframi: ");
            num2 = input.nextInt();

            int length2 = String.valueOf(num2).length();

            if (length2 != 2) {
                System.out.print("Liczba " + num2 + " nie jest liczbą dwucyfrową !");
                return;
            }
                

            num3 = num2 / num1;

            System.out.print("Wynik num3: " + num3);
        } catch (ArithmeticException e) {
            System.out.print("Nie wolno dzielić przez 0!");
        } catch (NumberFormatException e) {
            System.out.print("To nie jest cyfra !");
        } finally {
            System.out.print("\nKoniec programu.");
            input.close();
        }
    }
}