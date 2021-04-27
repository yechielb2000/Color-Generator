package ColorGeneratorPackage;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import java.awt.*;

public class WindowPanel extends JPanel {

    private JPanel colorPanel;
    private JSlider rSlider, gSlider, bSlider;
    private JLabel rLabel, gLabel, bLabel;

    public WindowPanel() {

        //set sliders
        rSlider = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
        setSliders(rSlider);
        gSlider = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
        setSliders(gSlider);
        bSlider = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
        setSliders(bSlider);

        //set labels
        rLabel = new JLabel("Red : 0");
        rLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        gLabel = new JLabel("Green : 0");
        gLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        bLabel = new JLabel("Blue : 0");
        bLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        //create controlsPanel
        JPanel controlsPanel = new JPanel();
        controlsPanel.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
        controlsPanel.setLayout(new BoxLayout(controlsPanel, BoxLayout.Y_AXIS));
        controlsPanel.add(rLabel);
        controlsPanel.add(rSlider);
        controlsPanel.add(gLabel);
        controlsPanel.add(gSlider);
        controlsPanel.add(bLabel);
        controlsPanel.add(bSlider);

        //create colorPanel
        colorPanel = new JPanel();
        colorPanel.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
        colorPanel.setPreferredSize(new Dimension(100, 180));
        colorPanel.setBackground(new Color(0, 0, 0));

        //add the panels to the JPanel
        add(controlsPanel);
        add(colorPanel);

        // add change listener
        SliderListener sliderListener = new SliderListener(colorPanel, rSlider, gSlider, bSlider, rLabel, gLabel, bLabel );
        rSlider.addChangeListener(sliderListener);
        gSlider.addChangeListener(sliderListener);
        bSlider.addChangeListener(sliderListener);
    }

    private void setSliders(JSlider slider){

        slider.setMajorTickSpacing(50);
        slider.setMinorTickSpacing(10);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setAlignmentX(Component.LEFT_ALIGNMENT);
    }
}
