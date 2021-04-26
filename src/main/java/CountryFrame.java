import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CountryFrame extends JFrame {

    public static void createGUI() {
        JFrame frame = new JFrame("Country API frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final JLabel label = new JLabel();
        label.setBackground(Color.WHITE);
        label.setOpaque(true);
        frame.getContentPane().add(label, BorderLayout.CENTER);
        JButton buttonInfo = new JButton("See country information");
        buttonInfo.setFocusable(false);
        buttonInfo.setFont(new Font("Verdana", Font.PLAIN, 12));
        buttonInfo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                UsingListDemo.createRequestGUI();
            }
        });
        frame.getContentPane().add(buttonInfo, BorderLayout.NORTH);

        JButton buttonFlag = new JButton("See country flag");
        buttonFlag.setFocusable(false);
        buttonFlag.setFont(new Font("Verdana", Font.PLAIN, 12));
        buttonFlag.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                UsingListDemo.createRequestGUI();
            }
        });

        frame.getContentPane().add(buttonFlag, BorderLayout.SOUTH);
        frame.setPreferredSize(new Dimension(800, 600));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

//    public static void main(String[] args) {
//        javax.swing.SwingUtilities.invokeLater(new Runnable() {
//            public void run() {
//                JFrame.setDefaultLookAndFeelDecorated(true);
//                createGUI();
//            }
//        });
//    }
}
