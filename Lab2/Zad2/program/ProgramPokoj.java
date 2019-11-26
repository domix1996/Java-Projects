package program;

public class ProgramPokoj {
    public static void main (final String[] args) 
    {
        PokojClass pokoj = new PokojClass(5.4f, 7.2f, 7.0f, "tak", "tak", "pokój");
        PokojClass kuchnia = new PokojClass(3.2f, 3.1f, 8.5f, "tak", "tak", "kuchnia");
        PokojClass lazienka = new PokojClass(5.4f, 7f, 12.0f, "tak", "tak", "łazienka");

        pokoj.InfoPokoj();
        kuchnia.InfoPokoj();
        lazienka.InfoPokoj();
    }
}