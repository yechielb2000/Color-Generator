package ColorGeneratorPackage;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class WindowPanel extends JPanel {


    public WindowPanel() {

        //set sliders
        JSlider rSlider = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
        setSliders(rSlider);
        JSlider gSlider = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
        setSliders(gSlider);
        JSlider bSlider = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
        setSliders(bSlider);

        //set labels
        JLabel rLabel = new JLabel("Red : 0");
        rLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        JLabel gLabel = new JLabel("Green : 0");
        gLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        JLabel bLabel = new JLabel("Blue : 0");
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
        JPanel colorPanel = new JPanel();
        colorPanel.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
        colorPanel.setPreferredSize(new Dimension(100, 170));
        colorPanel.setBackground(new Color(0, 0, 0));

        //create JLabel of hex color
        JLabel hexColor = new JLabel("#000000");

        //create tight panel
        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));
        rightPanel.add(colorPanel);
        rightPanel.add(hexColor);

        //add the panels to the JPanel
        add(controlsPanel);
        add(rightPanel);

        // add change listener
        SliderListener sliderListener = new SliderListener(colorPanel, hexColor, rSlider, gSlider, bSlider, rLabel, gLabel, bLabel);
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
