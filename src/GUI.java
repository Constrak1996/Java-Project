import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener {

    // Objects
    private JLabel label;
    private JFrame frame;
    private JPanel mainPanel;
    private JButton button;
    private JButton button2;
    private JCheckBox checkBox;
    private JComboBox comboBox;

    public GUI() {
        createPanel();
        createFields();
        createFrame();
    }

    public void createFields() {
        label = new JLabel("Set to: 0");

        button = new JButton("Set label to 1");
        button.addActionListener(this);

        button2 = new JButton("Set label to 2");
        button2.addActionListener(this);

        checkBox = new JCheckBox();
        checkBox.addActionListener(this);

        String[] list = { "1", "2" };
        comboBox = new JComboBox<>(list);
        comboBox.addActionListener(this);

        mainPanel.add(label);
        mainPanel.add(button);
        mainPanel.add(button2);
        mainPanel.add(checkBox);
        mainPanel.add(comboBox);
    }

    public void createPanel() {
        mainPanel = new JPanel();
        mainPanel.setBorder(BorderFactory.createEmptyBorder(0, 60, 5, 60));
        mainPanel.setLayout(new GridLayout(0, 1));
    }

    public void createFrame() {
        frame = new JFrame();
        frame.add(mainPanel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Welcome");
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == comboBox) {
            System.out.println(comboBox.getSelectedItem());
        }

        if (e.getSource() == checkBox) {
            if (checkBox.isSelected() == true) {
                System.out.println("Turned on");
            } else {
                System.out.println("Turned off");
            }
        }

        if (e.getSource() == button) {
            label.setText("Set to: " + 1);
        }

        if (e.getSource() == button2) {
            label.setText("Set to: " + 2);
        }
    }
}
