import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class MyWindow extends JFrame {
    private JLabel heading;
    private JLabel clockLabel;
    private Font f = new Font("", Font.BOLD, 35);

    MyWindow() {
        super.setTitle("Digital-Clock By Adiraj");
        setSize(500, 200);
        setLocation(550, 150);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GUI();
        startClock();
        setVisible(true);
    }

    public void GUI() {
        heading = new JLabel("Greeting From Adiraj", SwingConstants.CENTER);
        clockLabel = new JLabel("Clock", SwingConstants.CENTER);
        heading.setFont(f);
        clockLabel.setFont(f);

        setLayout(new BorderLayout());
        add(heading, BorderLayout.NORTH);
        add(clockLabel, BorderLayout.CENTER);
    }

    public void startClock() {
        Timer t = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dateTime = new Date().toString();
                clockLabel.setText(dateTime);
            }
        });
        t.start();
    }

    public static void main(String[] args) {
        new MyWindow();
    }
}
