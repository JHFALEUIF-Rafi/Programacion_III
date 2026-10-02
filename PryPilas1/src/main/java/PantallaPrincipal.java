import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import java.awt.GridLayout;
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
        inicializarComponentes();

        agregarElementoEnLaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String direccion = txtUrl.getText().trim();
                if (direccion.isEmpty()) {
                    JOptionPane.showMessageDialog(panel, "Ingrese una URL.");
                    return;
                }

                if (pila.agregar(new Url(contador, direccion))) {
                    JOptionPane.showMessageDialog(panel, "La URL se agregó correctamente.");
                    contador++;
                    actualizarVista();
                    txtUrl.setText("");
                }
            }
        });

        mostrarElementoEnLaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String cima = pila.peek();
                    JOptionPane.showMessageDialog(panel, cima, "Elemento en la cima", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(panel, ex.getMessage(), "Pila vacía", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        eliminarDeLaPilaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String eliminado = pila.pop();
                    actualizarVista();
                    JOptionPane.showMessageDialog(panel, eliminado, "URL eliminada", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(panel, ex.getMessage(), "Pila vacía", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
    }

    private void actualizarVista() {
        txtListado.setText(pila.Listar());
        lblCantidad.setText("Cantidad: " + pila.size());
    }

    private void inicializarComponentes() {
        panel = new JPanel(new GridLayout(0, 1, 0, 6));
        panel.setBorder(new EmptyBorder(12, 12, 12, 12));
        panel.setPreferredSize(new Dimension(520, 430));

        txtUrl = new JTextField();
        agregarElementoEnLaButton = new JButton("Agregar Elemento en la Pila");
        txtListado = new JTextArea(8, 30);
        txtListado.setEditable(false);
        mostrarElementoEnLaButton = new JButton("Mostrar Elemento en la Cima");
        eliminarDeLaPilaButton = new JButton("Eliminar de la Pila");
        lblCantidad = new JLabel("Cantidad: 0");

        panel.add(new JLabel("Ingrese la URL:"));
        panel.add(txtUrl);
        panel.add(agregarElementoEnLaButton);
        panel.add(new JScrollPane(txtListado));
        panel.add(mostrarElementoEnLaButton);
        panel.add(eliminarDeLaPilaButton);
        panel.add(lblCantidad);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("PantallaPrincipal");
        frame.setContentPane(new PantallaPrincipal().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
