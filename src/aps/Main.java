
package aps;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("APS - Espécies Ameaçadas");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JanelaPrincipal painel = new JanelaPrincipal(); // é um JPanel
            frame.setContentPane(painel);

            frame.pack(); // ajusta ao tamanho dos componentes
            frame.setLocationRelativeTo(null); // centraliza
            frame.setVisible(true); // exibe
        });
    }
}
