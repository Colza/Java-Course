import javax.swing.*;

public class Swing1 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Windows test");
        JLabel label = new JLabel("Hello World!");
        frame.add(label);
        frame.setSize(200,200);
        frame.setVisible(true);


    }
}
