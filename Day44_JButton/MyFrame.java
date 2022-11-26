import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame()
    {
        JButton button = new JButton();
        button.setBounds(120,120,100,50);
        button.setText("Click Here!");
        button.setFocusable(false);
        button.addActionListener(e -> System.out.println("Hello Connections!"));
        this.setLayout(null);
        this.setSize(750,600); // sets the x-dimension, and y-dimension of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //EXIT out of application after clicking on Close button
        this.setTitle("JButton"); // sets title of the frame
        this.setResizable(true); // prevent frame from  being resized
        ImageIcon image = new ImageIcon("C:\\Users\\AMAN\\Desktop\\java topics\\src\\Theatre.jpg");
        this.setIconImage(image.getImage()); // Change Icon of the frame
        this.getContentPane().setBackground(new Color(0,170,150)); // Setting custom color in background
        this.setVisible(true); // Make frame visible
        this.add(button);
    }
}
