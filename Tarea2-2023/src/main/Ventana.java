package main;
import javax.swing.*;

public class Ventana extends JFrame {
    public Ventana(Expendedor exp){
        super();
        JFrame frame = new JFrame("Tarea2");
        PanelPrincipal panel=new PanelPrincipal(exp);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 600);
        frame.setVisible(true);
    }
}