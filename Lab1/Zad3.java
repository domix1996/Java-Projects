import java.util.Random;
import java.util.Scanner;

public class Zad3 {
    static float weightedMean(int X[], int W[], int n) 
    { 
        int sum = 0, numWeight = 0; 
       
        for (int i = 0; i < n; i++) 
        { 
            numWeight = numWeight + X[i] * W[i]; 
            sum = sum + W[i]; 
        } 
       
        return (float)(numWeight) / sum; 
    } 
    public static void main(String args[]) 
    {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
             
        int number = 0;
        int j = 0;
        int num = 0;
        System.out.print("Wprowadź ilość liczb do średniej aretmetycznej: ");
        number = input.nextInt();
        int X[] = new int[number]; 
        int W[] = new int[number];
        int k = 0;

        for (int i = 0; i < number; i++) {
            k = i+1;
            System.out.print("Wprowadź " + k + " liczbę do średniej: ");
            num = input.nextInt();
            X[i] = num;
            System.out.print("\n");
        }

        for(int i = 0; i < number; i++)
        {
            j = Math.abs(rand.nextInt());
            W[i] = j;
        }
        
        int n = X.length; 
        int m = W.length; 
       
        if (n == m) 
            System.out.println(weightedMean(X, W, n)); 
        else
            System.out.println("-1" );
        input.close();
    }  
}