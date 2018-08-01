import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GlowneOkno {
    private JPanel panelGlowny;
    private JButton calculate;
    private JTextField iloscKm;
    private JTextField iloscBenzyny;
    private JTextField cena;
    private JLabel wynik;
    private JTextField koszt;


    public GlowneOkno() {



        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String km = iloscKm.getText();
                double przejechaneKm = Double.parseDouble(km);
                String paliwo = iloscBenzyny.getText();
                double spalonePaliwo = Double.parseDouble(paliwo);
                String price = cena.getText();
                double cenaPaliwa = Double.parseDouble(price);

                Double c = (spalonePaliwo/przejechaneKm*100)*cenaPaliwa;
                String p = c.toString();
                wynik.setText(p);
            }
        });
    }

    public static void main(String[] args) {
            JFrame frame = new JFrame("Apka");
            frame.setContentPane(new GlowneOkno().panelGlowny);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        }

}
