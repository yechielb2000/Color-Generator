package ColorGeneratorPackage;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class SliderListener implements ChangeListener {

    private JLabel hexColor;
    private JPanel colorPanel;
    private JSlider rSlider, gSlider, bSlider;
    private JLabel rLabel, gLabel, bLabel;

    public SliderListener(JPanel colorPanel, JLabel hexColor, JSlider rSlider, JSlider gSlider, JSlider bSlider, JLabel rLabel, JLabel gLabel, JLabel bLabel) {
        this.colorPanel = colorPanel;
        this.hexColor = hexColor;
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
        hexColor.setText(String.format("#%02x%02x%02x", colorPanel.getBackground().getRed(), colorPanel.getBackground().getGreen(), colorPanel.getBackground().getBlue()));
    }
}
