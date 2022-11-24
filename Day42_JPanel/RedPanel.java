import javax.swing.*;
import java.awt.*;

public class RedPanel extends JPanel {
    RedPanel()
    {
        this.setBackground(Color.red);
        this.setBounds(80,0,250,250);
    }
}

class BluePanel extends JPanel {
    BluePanel()
    {
        this.setBackground(Color.blue);
        this.setBounds(400,0,250,250);
    }
}

class YellowPanel extends JPanel {
    YellowPanel()
    {
        this.setBackground(Color.yellow);
        this.setBounds(80,300,250,250);
    }
}

class GreenPanel extends JPanel {
    GreenPanel()
    {
        this.setBackground(new Color(0,200,0));
        this.setBounds(400,300,250,250);
    }
}