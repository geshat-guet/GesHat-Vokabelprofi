import java.nio.file.Files;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Path;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * Klasse FileHandler
 * Erledigt das Laden und Speichern der Vokabeln in Dateien.
 * 
 * @author guet 
 * @version 2023
 */
public class FileHandler
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private String path;
    private String fileName;
    private VokabelKiste myKiste;

    /**
     * Konstruktor für Objekte der Klasse FileHandler
     */
    public FileHandler()
    {
        // Instanzvariable initialisieren
        path = "";
        fileName = "englisch.csv";

    }

    /**
     * ladeDatei
     * 
     * Läd die Vokabeln aus der angegebenen Datei.
     */
    public boolean ladeDatei()
    {
        
        
        boolean success = false;
        try (FileReader reader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader((reader))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println("Line: " + line);
                
                // line in Vokabel konvertieren und der Vokabelliste hinzufügen
                String split[] = line.split(",");
                VokabelKarte neueKarte = new VokabelKarte(split[0].trim(), split[1].trim(), split[2].trim());
                neueKarte.druckeKarte();
                
                myKiste.vokabelHinzufuegen(neueKarte);
            }
            success = true;
        } catch (IOException e) {
            e.printStackTrace();
            success = false;
        }
        return success;
    }
    
    public void speichereDatei()
    {
        
        String text = myKiste.dateiStringErzeugen();
       
        try{
            Files.writeString(Path.of(fileName), text);
        } catch (IOException e) {
            e.printStackTrace();
            //success = false;
        }
        
    }
    
    public void setVokabelKiste(VokabelKiste pVK)
    {
        myKiste = pVK;
    }
}
