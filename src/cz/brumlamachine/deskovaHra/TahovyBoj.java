package cz.brumlamachine.deskovaHra;
import java.util.Scanner;

public class TahovyBoj {

    public static void main(String[] args) {

        Kostka kostka = new Kostka(10);
        Bojovnik Ilidanis = new Bojovnik("Ilidanis", 100, 28, 12, kostka);
        Bojovnik Shadow = new Bojovnik("Shadow", 100, 40, 0, kostka);
        Arena arena = new Arena(Ilidanis, Shadow, kostka);

        arena.zapas();

    }

}








