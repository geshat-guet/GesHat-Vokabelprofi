import javax.swing.JTextField;
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
 * <H1>Klasse VokabelTrainerProgramm</H1>
 * 
 * Das Hauptprogramm mit main-Methode.<br>
 * Öffnet das Hauptfenster,
 * erzeugt alle nötigen Objekte und läd die aktuell gespeicherte
 * Vokabelliste.
 * 
 * @author guet
 * @version 2023
 */
public class VokabelTrainerProgramm extends JFrame implements ActionListener{

    VokabelKiste meineVokabelKiste = new VokabelKiste();
    JLabel lbStatusLabel;
    JButton btZeigeListe;

    public VokabelTrainerProgramm() {
        setTitle("GesHAT - VokabelProfi");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 150, 400, 400);

        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lbUeberschrift = new JLabel();
        lbUeberschrift.setFont(new Font("Tahoma", Font.BOLD, 20));
        lbUeberschrift.setBounds(10, 10, 380, 20);
        lbUeberschrift.setText("GesHAT - Vokabelprofi");
        contentPane.add(lbUeberschrift);

        lbStatusLabel = new JLabel();
        lbStatusLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lbStatusLabel.setBounds(10,40, 380, 20);
        lbStatusLabel.setText("Aktueller Status: "+ meineVokabelKiste.getAnzahlVokabeln() + " Vokabeln geladen");
        contentPane.add(lbStatusLabel);

        btZeigeListe = new JButton();
        btZeigeListe.setBounds(10,65,180, 20);
        btZeigeListe.setText("Zeige Liste");
        btZeigeListe.addActionListener(this);
        contentPane.add(btZeigeListe);

        setVisible(true);
        //update();
    }

    public static void main(String[] args) {

        new VokabelTrainerProgramm();
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==btZeigeListe)
        {
            // Starte das Listenansichtsfenster
            ListenansichtGUI listenAnsicht = new ListenansichtGUI(meineVokabelKiste);
        }
    }
}