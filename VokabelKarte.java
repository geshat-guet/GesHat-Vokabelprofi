
/**
 * Klasse Vokabelkarte.
 * 
 * @author guet
 * @version 2022
 */
public class VokabelKarte
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private String deutsch;
    private String fremdsprache;
    private String kategorie;
    private int gekonntZaehler;
    private int abgefragtZaehler;

    /**
     * Konstruktor für Objekte der Klasse Vokabelkarte
     */
    public VokabelKarte(String pDeu, String pFremd)
    {
        // Instanzvariable initialisieren
        deutsch = pDeu;
        fremdsprache = pFremd;
        kategorie = "";
        gekonntZaehler = 0;
        abgefragtZaehler = 0;
    }
    
    public VokabelKarte(String pDeu, String pFremd, String pKategorie)
    {
        // Instanzvariable initialisieren
        deutsch = pDeu;
        fremdsprache = pFremd;
        kategorie = pKategorie;
        gekonntZaehler = 0;
        abgefragtZaehler = 0;
    }

    public void druckeKarte()
    {
        System.out.println("----------------------");
        System.out.println("-                    -");
        System.out.println("- "+fremdsprache+"    ");
        System.out.println("-                    -");
        System.out.println("----------------------");     
        System.out.println();
        System.out.println("----------------------");
        System.out.println("-                    -");
        System.out.println("- "+deutsch+"    ");
        System.out.println("-                    -");
        System.out.println("----------------------");
    }
    
    public String getDateiString()
    {
        return deutsch +","+ fremdsprache +"," + kategorie;
    }
    
    public String getListenansicht()
    {
        return deutsch + " - " + fremdsprache + "; Kategorie: " + kategorie + "\n";
    }
    
    /* ---------- get- und set-Methoden ---------------------*/
    public int getGekonntZaehler()
    {
        return gekonntZaehler;
    }
    
    public int getAbgefragtZaehler()
    {
        return abgefragtZaehler;
    }
    
    public String getFremdsprache()
    {
        return fremdsprache;
    }
    
    public void setFremdsprache(String pNeu)
    {
        fremdsprache = pNeu;
    }
    
    public String getDeutsch()
    {
        return deutsch;
    }
    
    public void setDeutsch(String pNeu)
    {
        deutsch = pNeu;
    }
    
    public String getKategorie()
    {
        return kategorie;
    }
    
    public void setKategorie(String pNeu)
    {
        kategorie = pNeu;
    }
}
