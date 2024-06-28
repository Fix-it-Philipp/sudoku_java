public class Game {
    // Variablen
    private Feld[][] Felder = new Feld[10][10];

    // Konstruktor
    public Game() {
        int block = 0;
        for (int x=1; x <= 9; x++) {
            for (int y=1; y <= 9; y++) {

                // Überprüfung in welchem Block das Feld liegt. Blöcke werden von links nach rechts und Zeile für Zeile durchnummeriert
                // Erste Zeile
                if (x <= 3 && y <= 3) block = 1;
                if (x > 3 && x <= 6 && y <= 3) block = 2;
                if (x > 6 && y <= 3) block = 3;

                // Zweite Zeile
                if (x <= 3 && y > 3 && y <= 6) block = 4;
                if (x > 3 && x <= 6 && y > 3 && y <= 6) block = 5;
                if (x > 6 && y > 3 && y <= 6) block = 6;

                // Dritte Zeile
                if (x <= 3 && y > 6) block = 7;
                if (x > 3 && x <= 6 && y > 6) block = 8;
                if (x > 6 && y > 6) block = 9;

                // Felder initialisieren
                Felder[x][y] = new Feld(this, block, x, y);
            }
        }

    }

    // Funktionen


    // Getter und Setter
    public int getBlock(int x, int y) {
        return this.Felder[x][y].getBlock();
    }

    public Feld[][] getFelder() {
        return Felder;
    }

    public void setFelder(Feld[][] Felder) {
        this.Felder = Felder;
    }
}
