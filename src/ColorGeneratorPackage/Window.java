package ColorGeneratorPackage;

import javax.swing.*;

public class Window {

    public Window(){

        JFrame frame = new JFrame();
        frame.setTitle("Color Generator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.getContentPane().add(new WindowPanel());
        frame.pack();
        frame.setVisible(true);
    }
}
