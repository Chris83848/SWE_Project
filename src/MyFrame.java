import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {
    public MyFrame() {
        setTitle("Swing Application");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create a Button
        JButton button = new JButton("Click Me");
        button.addActionListener(e -> JOptionPane.showMessageDialog(this, "Button Clicked!"));

        // Add button to the frame
        setLayout(new FlowLayout());
        add(button);

        setVisible(true);
    }
}
