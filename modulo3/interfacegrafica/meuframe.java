package interfacegrafica;

import javax.swing.JFrame;

public class meuframe extends JFrame {

    public meuframe() {

        super("Meu Frame");

        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new meuframe();
    }
}
