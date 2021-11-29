package pkg;

public class Main {

    public static void main(String[] args) {
	    Osoba osoba = new Osoba("Jan");
        Vozidlo vozidlo = new Vozidlo("auto");

        String mesto = "Pardubice";
        Movable[] arr = new Movable[]{osoba, vozidlo};
        for (Movable obj : arr) {
            obj.pohniSeDo(mesto);
        }

        FileManager manager = new DiscFileManager();
        manager.saveFile("Soubor.txt");
        manager.readFile("Soubor.docx");
    }
}
