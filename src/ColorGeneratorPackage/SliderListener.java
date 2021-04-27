package ColorGeneratorPackage;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class SliderListener implements ChangeListener {


    private JPanel colorPanel;
    private JSlider rSlider, gSlider, bSlider;
    private JLabel rLabel, gLabel, bLabel;

    public SliderListener(JPanel colorPanel, JSlider rSlider, JSlider gSlider, JSlider bSlider, JLabel rLabel, JLabel gLabel, JLabel bLabel) {
        this.colorPanel = colorPanel;
        this.rSlider = rSlider;
        this.gSlider = gSlider;
        this.bSlider = bSlider;
        this.rLabel = rLabel;
        this.gLabel = gLabel;
        this.bLabel = bLabel;
    }

    @Override
    public void stateChanged(ChangeEvent changeEvent) {

        int red = rSlider.getValue();
        int green = gSlider.getValue();
        int blue = bSlider.getValue();

        rLabel.setText("Red : " + red);
        gLabel.setText("Green : " + green);
        bLabel.setText("Blue : " + blue);

        colorPanel.setBackground(new Color(red, green, blue));
    }
}
