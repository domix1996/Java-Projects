import java.util.Random;
import java.util.Scanner;

public class Zad4 {
    public static void main(String arg[]) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int var1 = 0;

        System.out.print("Wprowadź MIN do zakresu: ");
        int min = input.nextInt();
        System.out.print("Wprowadź MAX do zakresu: ");
        int max = input.nextInt();
        int yes = 0;
        int no = 0;

          for(int i=0; i<10; i++){
              var1 = rand.nextInt((max*10) + 1 - min) + min;
              if(var1 >= min && var1 <= max )
              {
                  System.out.print("Wylosowana liczba " + var1 + " należy do zakresu");
                  System.out.print("\n");
                  yes++;
              }
              else
              {
                  System.out.print("Wylosowana liczba " + var1 + " nie należy do zakresu");
                  System.out.print("\n");
                  no++;
              }
          }
          System.out.print("\n");
          System.out.print("Udało się wylosować " + yes + " liczb z zakresu, a " + no + " razy nie udało się trafić");
          input.close();
    }
}
