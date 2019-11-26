import java.util.Random;
import java.util.Scanner;

public class Zad1 {
    public static void main(String arg[]) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int generator = 0;
        System.out.print("Wprowadź MIN do zakresu: ");
        int min = input.nextInt();
        System.out.print("Wprowadź MAX do zakresu: ");
        int max = input.nextInt();
        System.out.print("Wprowadź do której liczby ma sprawdzać dzielenie (minimalna liczba dzielona jest ustawione na 0)");
        int number = input.nextInt();

        generator = rand.nextInt((max) + 1 - min) + min;
        System.out.print("Wylosowana liczba: "+ generator +"\n");
        
        System.out.print("Wylosowane liczby są podzielne przez "+ generator +":\n");
        for(int i=0; i<=number; i++){
            
            if(i % generator == 0 )
            {
                System.out.print(i + ", ");
            }
        }
        input.close();
    }
}
