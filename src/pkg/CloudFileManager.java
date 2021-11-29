package pkg;

public class CloudFileManager implements FileManager {
    @Override
    public void saveFile(String fileName) {
        System.out.println("Soubor " + fileName + " byl uložen na cloud");
    }

    @Override
    public void readFile(String fileName) {
        System.out.println("Čteme ze souboru " + fileName + " na cloudu");
    }
}
