import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana {
    private JPanel Ventana;
    private JSpinner spiNumero;
    private JButton btnCalcular;
    private JLabel lblResultado;
    private Pila pila = new Pila();

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().Ventana);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    SpinnerNumberModel snm = new SpinnerNumberModel(21, 1, Integer.MAX_VALUE, 1);
    spiNumero.setModel(snm);

    public Ventana() {
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Integer numero = Integer.parseInt(spiNumero.getValue().toString());
                while (numero!=0){
                    int residuo = numero % 2;
                    pila.push(residuo);
                    numero = numero / 2;
                }
                lblResultado.setText(pila.toString());
            }
        });
    }
}
