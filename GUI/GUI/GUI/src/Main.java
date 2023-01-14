import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame jFrame;

        jFrame = new  JFrame();
        jFrame.setSize(400,300);
        jFrame.setVisible(true);

        JOptionPane.showMessageDialog(jFrame, "Good Morning");
        JOptionPane.showMessageDialog(null, "Morning to");


        JOptionPane.showMessageDialog(null, "one\ntwo\nthree");
        JOptionPane.showInputDialog(null, "Enter text");

        String input;
        input = JOptionPane.showInputDialog(null, "Enter text: ");


    }
}
