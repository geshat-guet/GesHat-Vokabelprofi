
/**
 * Die Klasse VokabelKiste repräsentiert eine Box, in der einzelne
 * Vokabelkarten liegen.
 * Diese werden in einer Liste gespeichert.
 * 
 * @author guet 
 * @version 2022
 */
public class VokabelKiste
{
    private List<VokabelKarte> vokabeln = new List();
    private int anzahlVokabeln;
    
    public FileHandler myFh = new FileHandler();

    /**
     * Konstruktor für Objekte der Klasse VokabelKiste
     */
    public VokabelKiste()
    {
        anzahlVokabeln = 0;
        // Bekanntmachen der Vokabelkiste im FileHandler-Objekt
        // damit FileHandler auf die Vokabelliste zugreifen kann.
        myFh.setVokabelKiste(this);
        
        // Aufruf der Methode "ladeDatei" um die Vokabelliste zu laden.
        myFh.ladeDatei();
    }
    
    /** 
     * Auftrag vokabelHinzufuegen
     * @param pNeueKarte - VokabelKarte, die hinzugefügt werden soll
     * 
     * Nachher: neue Vokabelkarte (pNeueKarte) ist am Ende der Liste
     * angehängt.
     */
    public void vokabelHinzufuegen(VokabelKarte pNeueKarte)
    {
        vokabeln.append(pNeueKarte); 
        anzahlVokabeln++;
    }
    
    /**
     * Anfrage getAnzahlVokabeln
     * gibt den Wert an, der in der Variable
     * "anzahlVokabeln" gespeichert ist.
     * @return Wert, der in anzahlVokabeln gespeichert ist.
     */
    public int getAnzahlVokabeln()
    {
        return anzahlVokabeln;
    }
    
    /**
     * Anfrage zaehleVokabeln
     * @return Anzahl der Vokabeln in der Liste
     * 
     * Zählt die Vokaben in der Liste mit dem Verfahren:
     * Gehe an den Anfang der Liste,
     * Solange Zugriff auf eine Vokabel besteht erhöhe die
     * Variable anz (Befehl anz++) und gehe einen Schritt in der
     * Liste weiter (next).
     */
    private int zaehleVokabeln()
    {
        // Setze den Zähler anz auf Null.
        int anz = 0;
        
        // Gehe an den Anfang der Liste.
        vokabeln.toFirst();
        
        // Solange Zugriff auf Vokabelkarten gegeben ist, wiederhole
        while(vokabeln.hasAccess())
        {
            // Erhöhe die Anzahl um Eins.
            anz++;
            // Gehe einen Schritt weiter in der Liste.
            vokabeln.next();
        }
        // Setze die Klassenvariable anzahlVokabeln auf die
        // ermittelte Anzahl anz.
        anzahlVokabeln = anz;
        
        // Gib den aktuellen Wert von anz zurück.
        return anz;
    }

    /**
     * Anfrage dateiStringErzeugen
     * @return String für die Speicherung in einer Datei
     * 
     * Erzeugt einen String für die Speicherung in einer Datei.
     */
    public String dateiStringErzeugen()
    {
        String ausgabe ="";
        vokabeln.toFirst();
        while(vokabeln.hasAccess())
        {
            ausgabe=ausgabe + vokabeln.getContent().getDateiString()+"\n";
            vokabeln.next();
        }
        
        return ausgabe;
    }
    
    /**
     * Anfrage listenStringErzeugen erzeugt einen String, der in einem
     * Textfeld ausgegeben werden kann.
     * 
     * @return String für die Listenausgabe
     */
    public String listenStringErzeugen()
    {
        String ausgabe ="";
        vokabeln.toFirst();
        while(vokabeln.hasAccess())
        {
            ausgabe=ausgabe + vokabeln.getContent().getListenansicht();
            vokabeln.next();
        }
        
        return ausgabe;
    }

}
