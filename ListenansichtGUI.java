
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * Beschreiben Sie hier die Klasse ListenansichtGUI.
 * 
 * Die Klasse ListenansichtGUI startet ein neues Fenster und
 * zeigt alle Vokabeln in der VokabelKiste an, die beim Aufrufen als 
 * Parameter übergeben wurde.
 * 
 * @author guet
 * @version 2023
 */
public class ListenansichtGUI extends JDialog implements ActionListener
{
    JTextArea tAListenFeld;
    VokabelKiste meineVokabelKiste;
    
    /**
     * Konstruktor für Objekte der Klasse ListenansichtGUI
     * 
     * @param pVK VokabelKiste
     */
    public ListenansichtGUI(VokabelKiste pVK)
    {
        meineVokabelKiste = pVK;
        // Erzeugung eines neuen Frames mit 
        // dem Titel Beispiel JDialog
        JDialog meinJDialog = new JDialog();
        // Titel wird gesetzt
        meinJDialog.setTitle("GesHat - Vokabelprofi - Liste");
        // Breite und Höhe des Fensters werden 
        // auf 200 Pixel gesetzt
        meinJDialog.setSize(400,400);
        // Dialog kann auf modal gesetzt werden,
        // d.h. dass dieser erst geschlossen werden muss,
        // bevor in dem anderen Fenster weitergearbeitet 
        // werden kann.
        // meinJDialog.setModal(true);
        
        meinJDialog.setLayout(null);

        // Überschrift (Label) hinzufügen
        JLabel lbUeberschrift = new JLabel();
        // Schriftart für die Überschrift setzen
        lbUeberschrift.setFont(new Font("Tahoma", Font.BOLD, 16));
        // Rechteck definieren, in dem die Überschrift steht
        lbUeberschrift.setBounds(10, 10, 380, 20);
        // Text der Überschrift setzen
        lbUeberschrift.setText("GesHAT - Vokabelprofi - Listenansicht");
        // Überschrift dem Dialog hinzufügen
        meinJDialog.add(lbUeberschrift);
        
        // Textfeld hinzufügen
        tAListenFeld = new JTextArea();
        tAListenFeld.setBounds(10, 30, 380, 340);
        meinJDialog.add(tAListenFeld);
        
        // Hole die aktuelle Vokabelliste mit "listenStringErzeugen" aus der
        // Klasse VokabelKiste und schreibe sie mit setText in das Textfeld.
        tAListenFeld.setText(meineVokabelKiste.listenStringErzeugen());
        
        // Wir lassen unseren Dialog anzeigen
        meinJDialog.setVisible(true);
    }

    /**
     * actionPerformed für Buttons usw...
     */
    public void actionPerformed(ActionEvent e)
    {
        // tragen Sie hier den Code ein

    }
}
