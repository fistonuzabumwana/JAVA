/*
 * Created by JFormDesigner on Wed Oct 16 05:21:39 CAT 2024
 */

package Lecture5;

import java.awt.*;
import javax.swing.*;

/**
 * @author fiston
 */
public class newlook extends JPanel {
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JTextField textField1;
    private JPanel panel1;
    private JLabel hello;
    public newlook() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        textField1 = new JTextField();
        panel1 = new JPanel();
        hello = new JLabel();

        //======== this ========
        setLayout(null);
        add(textField1);
        textField1.setBounds(210, 80, 125, textField1.getPreferredSize().height);

        //======== panel1 ========
        {
            panel1.setLayout(null);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < panel1.getComponentCount(); i++) {
                    Rectangle bounds = panel1.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = panel1.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                panel1.setMinimumSize(preferredSize);
                panel1.setPreferredSize(preferredSize);
            }
        }
        add(panel1);
        panel1.setBounds(new Rectangle(new Point(80, 135), panel1.getPreferredSize()));

        //---- hello ----
        hello.setText("text");
        add(hello);
        hello.setBounds(60, 80, 105, 30);

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < getComponentCount(); i++) {
                Rectangle bounds = getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            setMinimumSize(preferredSize);
            setPreferredSize(preferredSize);
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
