package cz.brumlamachine.deskovaHra;

import java.util.Random;

public class Kostka {
    /** Generátor náhodných čísel */
    private Random random;
    /** Pocet sten kostky */
    private int pocetSten;

    public Kostka() {
        pocetSten = 6;
        random = new Random();
    }

    /**
     * Vrátí počet stěn hrací kostky
     * @return      počet stěn hrací kostky
     */
    public int vratPocetSten() {
        return pocetSten;
    }

    public Kostka(int PocetSten) {
        this.pocetSten = PocetSten;
        random = new Random();
    }

    /**
     * Vykoná hod kostkou
     * @return Číslo od 1 do počtu stěn
     */
    public int hod() {

        return random.nextInt(pocetSten) + 1;
    }
        /**
         * Vrací textovou reprezentaci kostky
         * @return Textová reprezentace kostky
         */
        @Override
        public String toString() {
            return String.format("cz.brumlamachine.deskovaHra.Kostka s %s stěnami", pocetSten);
        }
    }
