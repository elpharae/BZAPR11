package pkg;

public class Vozidlo implements Movable {

    private String typ;

    public Vozidlo(String typ) {
        this.typ = typ;
    }

    @Override
    public void pohniSeDo(String mesto) {
        System.out.println("Vozidlo typu " + this.typ + " odjelo do mesta " + mesto);
    }
}
