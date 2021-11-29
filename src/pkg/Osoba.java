package pkg;

public class Osoba implements Movable {

    private String jmeno;

    public Osoba(String jmeno) {
        this.jmeno = jmeno;
    }

    @Override
    public void pohniSeDo(String mesto) {
        System.out.println("Osoba se jmenem " + this.jmeno + " sla do mesta " + mesto);
    }
}
