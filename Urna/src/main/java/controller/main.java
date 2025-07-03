package controller;

import com.mycompany.view.Urna;
import javax.swing.SwingUtilities;

public class main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Urna().setVisible(true);
        });
    }
}