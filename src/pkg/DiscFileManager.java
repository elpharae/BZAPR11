package pkg;

public class DiscFileManager implements FileManager {
    @Override
    public void saveFile(String fileName) {
        System.out.println("Soubor " + fileName + " byl uložen na disk");
    }

    @Override
    public void readFile(String fileName) {
        System.out.println("Čteme ze souboru " + fileName + " na disku");
    }
}
