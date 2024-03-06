public class Pkw extends Fahrzeug {

    private String typ;

    private int anzahlSitzplaetze;
    private boolean istKofferraumOffen;


    public Pkw(String marke, String farbe, String typ, int anzahlSitzplaetze, boolean istKofferraumOffen) {
        super(marke, farbe);
        this.typ = typ;
        this.anzahlSitzplaetze = anzahlSitzplaetze;
        this.istKofferraumOffen = istKofferraumOffen;
    }
}
