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
    public void TestSpielfeld() {
        this.Felder[1][1].setZahl(2); this.Felder[2][1].setZahl(9); this.Felder[3][1].setZahl(3);
        this.Felder[4][1].setZahl(7); this.Felder[5][1].setZahl(1); this.Felder[6][1].setZahl(5);
        this.Felder[7][1].setZahl(4); this.Felder[8][1].setZahl(8); this.Felder[9][1].setZahl(6);

        this.Felder[1][2].setZahl(4); this.Felder[2][2].setZahl(8); this.Felder[3][2].setZahl(7);
        this.Felder[4][2].setZahl(9); this.Felder[5][2].setZahl(2); this.Felder[6][2].setZahl(6);
        this.Felder[7][2].setZahl(3); this.Felder[8][2].setZahl(5); this.Felder[9][2].setZahl(1);

        this.Felder[1][3].setZahl(5); this.Felder[2][3].setZahl(6); this.Felder[3][3].setZahl(1);
        this.Felder[4][3].setZahl(8); this.Felder[5][3].setZahl(3); this.Felder[6][3].setZahl(4);
        this.Felder[7][3].setZahl(9); this.Felder[8][3].setZahl(7); this.Felder[9][3].setZahl(2);

        this.Felder[1][4].setZahl(8); this.Felder[2][4].setZahl(2); this.Felder[3][4].setZahl(9);
        this.Felder[4][4].setZahl(3); this.Felder[5][4].setZahl(5); this.Felder[6][4].setZahl(7);
        this.Felder[7][4].setZahl(6); this.Felder[8][4].setZahl(1); this.Felder[9][4].setZahl(4);

        this.Felder[1][5].setZahl(3); this.Felder[2][5].setZahl(7); this.Felder[3][5].setZahl(6);
        this.Felder[4][5].setZahl(1); this.Felder[5][5].setZahl(4); this.Felder[6][5].setZahl(2);
        this.Felder[7][5].setZahl(5); this.Felder[8][5].setZahl(9); this.Felder[9][5].setZahl(8);

        this.Felder[1][6].setZahl(1); this.Felder[2][6].setZahl(4); this.Felder[3][6].setZahl(5);
        this.Felder[4][6].setZahl(6); this.Felder[5][6].setZahl(9); this.Felder[6][6].setZahl(8);
        this.Felder[7][6].setZahl(7); this.Felder[8][6].setZahl(2); this.Felder[9][6].setZahl(3);

        this.Felder[1][7].setZahl(9); this.Felder[2][7].setZahl(5); this.Felder[3][7].setZahl(4);
        this.Felder[4][7].setZahl(2); this.Felder[5][7].setZahl(8); this.Felder[6][7].setZahl(3);
        this.Felder[7][7].setZahl(1); this.Felder[8][7].setZahl(6); this.Felder[9][7].setZahl(7);

        this.Felder[1][8].setZahl(6); this.Felder[2][8].setZahl(3); this.Felder[3][8].setZahl(8);
        this.Felder[4][8].setZahl(5); this.Felder[5][8].setZahl(7); this.Felder[6][8].setZahl(1);
        this.Felder[7][8].setZahl(2); this.Felder[8][8].setZahl(4); this.Felder[9][8].setZahl(9);

        this.Felder[1][9].setZahl(7); this.Felder[2][9].setZahl(1); this.Felder[3][9].setZahl(2);
        this.Felder[4][9].setZahl(4); this.Felder[5][9].setZahl(6); this.Felder[6][9].setZahl(9);
        this.Felder[7][9].setZahl(8); this.Felder[8][9].setZahl(3); this.Felder[9][9].setZahl(5);
    }

    public int getBlock(int x, int y) {
        return this.Felder[x][y].getBlock();
    }

    // Getter und Setter
    public Feld[][] getFelder() {
        return Felder;
    }
}
