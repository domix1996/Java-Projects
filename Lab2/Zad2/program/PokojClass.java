package program;

import java.util.Scanner;

public class PokojClass {

    Scanner scanner = new Scanner(System.in);
    protected float _lengths, _width, _height;
    String decide1, decide2, room;
    
    public PokojClass(float _lengths, float _width, float _height, String decide1, String decide2, String room){

        this._lengths = _lengths;
        this._width = _width;
        this._height = _height;
        this.decide1 = decide1;
        this.decide2 = decide2;
        this.room = room;
    }

    public void InfoPokoj()
    {
        objetosc(_lengths, _width, _height);
        powierzchniaSciany(_lengths, _height);
        powierzchniaPodlogi(_lengths, _width);

        if (decide1 == "tak") {
            kosztMalowaniaSciany();

            if (decide2 == "tak") {
                kosztMalowaniaPodlogi();
            }
        }
        else if (decide2 == "tak") {
            kosztMalowaniaPodlogi();
        }
    }

    protected float objetosc(float l, float w, float h)
    {
        System.out.println("-------------------------------------------------\n\n\n");


        System.out.println("Objętość " + room + ": " + ".\n\n");

        l = _lengths;
        System.out.println("długość " + room + ": " + l + ".\n");
        
        h = _height;
        System.out.println("wysokość " + room + ": " + h + ".\n");
        
        w = _width;
        System.out.println("szerokość " + room + ": " + w + ".\n\n");

        float objetosc = l * w * h;

        System.out.println("-------------------------------------------------\n\n\n");
        System.out.println("Objętość " + room +  " wynosi " + objetosc + "m3.\n\n");

        return objetosc;
    }

    protected float powierzchniaSciany(float l, float h) {
        System.out.println("-------------------------------------------------\n\n\n");

        l = _lengths;
        h = _height;

        float powierzchniaSciany = l * h;
        System.out.println("Powierzchnia ściany wynosi " + powierzchniaSciany + "m2.\n\n");
        return powierzchniaSciany;
    }

    protected float powierzchniaPodlogi(float l, float w) {
        System.out.println("\n\n-------------------------------------------------\n\n");

        l = _lengths;
        w = _width;

        float powierzchniaPodlogi = l * w;
        System.out.println("Powierzchnia podłogi wynosi " + powierzchniaPodlogi + "m2.\n\n");

        return powierzchniaPodlogi;
    }

    protected float kosztMalowaniaSciany() {
        float _priceWall;
        System.out.println("\n\n-------------------------------------------------\n\n");

        System.out.println("Wprowadz koszt farby (m2):");
        _priceWall = scanner.nextFloat();

        float koszt = powierzchniaSciany(_lengths, _height) * _priceWall;
        System.out.println("\nKoszt pomalowania ściany będzie wynosić " + koszt + "zł.\n\n");
        return koszt;
    }

    protected float kosztMalowaniaPodlogi() {
        float _priceFloor;
        System.out.println("\n\n-------------------------------------------------\n\n");

        System.out.println("Wprowadz koszt podlogi (m2):");
        _priceFloor = scanner.nextFloat();

        float koszt = powierzchniaPodlogi(_lengths, _height) * _priceFloor;
        System.out.println("\nKoszt podlogi będzie wynosić " + koszt + "zł.\n\n");
        return koszt;
    }
}