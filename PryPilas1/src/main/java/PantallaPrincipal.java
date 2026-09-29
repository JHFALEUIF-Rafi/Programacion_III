import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PantallaPrincipal {

    private JPanel panel;
    private JTextField txtUrl;
    private JButton agregarElementoEnLaButton;
    private JTextArea txtListado;
    private JButton mostrarElementoEnLaButton;
    private JButton eliminarDeLaPilaButton;
    private JLabel lblCantidad;
    private int contador = 1;
    private Pila pila = new Pila();

    public PantallaPrincipal() {
        agregarElementoEnLaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Url direccion = new Url(contador, txtUrl.getText();
                if(pila.agregar(direccion)){
                    JOptionPane.showMessageDialog(null, "El pila se ha agregado correctamente");
                    txtListado.setText(pila.Listar());
                    contador++;
                    lblCantidad.setText("Cantidad: " + pila.size());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("PantallaPrincipal");
        frame.setContentPane(new PantallaPrincipal().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
        mostrarElementoEnLaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String cima = pila.peek();
                    JOptionPane.showMessageDialog(null, "Cima");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });
    }
