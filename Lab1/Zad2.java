import java.util.Random;
import java.util.Scanner;
import java.io.*; 
import java.lang.*; 

public class Zad2 {
    static float sumOfAP(float a, float d, float n) 
    { 
        float sum = (n / 2) * (2 * a + (n - 1) * d); 
        return sum; 
    } 
    public static void main (String[] args)  
    { 
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Wprowadź N: ");
        int n = input.nextInt();
        System.out.print("\n");

        int r = rand.nextInt();
        System.out.print("Wylosowana liczba r: " + r + "\n");

        System.out.print("Wprowadź a1: ");
        int a =input.nextInt();
        System.out.print("\n");

        System.out.print("Suma ciągu aretmetycznego wynosi: " + sumOfAP(a, r, n));
        input.close();
    }
}