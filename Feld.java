public class Feld {
    // Variablen
    private Game game;
    private int block;
    private int row;
    private int line;
    private boolean[] hint = new boolean[9];
    private int zahl;
    private int rateZahl;

    // Konstruktor
    public Feld(Game game, int block, int row, int line) {
        this.game = game;
        this.block = block;
        this.row = row;
        this.line = line;
        for (int i = 0; i < 9; i++) this.hint[i] = false;
        this.zahl = 0;
    }

    // Funktionen
    public void toggleHint(int zahl) {
        this.hint[zahl] = !this.hint[zahl];
    }

    //Getter und Setter

    public int getRateZahl() {
        return rateZahl;
    }

    public void setRateZahl(int rateZahl) {
        this.rateZahl = rateZahl;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public int getZahl() {
        return zahl;
    }

    public void setZahl(int zahl) {
        this.zahl = zahl;
    }
}
