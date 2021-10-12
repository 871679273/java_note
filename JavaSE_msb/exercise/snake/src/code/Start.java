package code;

import javax.swing.*;
import java.awt.*;

public class Start {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setTitle("2021-10-07");
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int height = Toolkit.getDefaultToolkit().getScreenSize().height;
        jf.setBounds((width-800)/2,(height-800)/2,800,800);
        jf.setResizable(false);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        GamePanel gp = new GamePanel();
        jf.add(gp);

        jf.setVisible(true);
    }
}
