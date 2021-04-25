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

    static String defaultURL = "https://restcountries.eu/data/rus.svg";
    static String URL = "https://restcountries.eu/data/ind.svg";

    public static void createGUI() {
        JFrame frame = new JFrame("Country API frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final JLabel label = new JLabel();
        label.setBackground(Color.WHITE);
        label.setOpaque(true);
        frame.getContentPane().add(label, BorderLayout.CENTER);

        JButton button = new JButton("See country flag");
        button.setFocusable(false);
        button.setFont(new Font("Verdana", Font.PLAIN, 12));
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

//                Image img = loadImage(URL);
//                Image defaultImg = loadDefaultImage(defaultURL);
//                Image testImg = loadTestImage(defaultURL);
//                if(img != null){
//                    label.setIcon(new ImageIcon(img, "Country flag"));
//                    System.out.println("ImageIcon set");
//                } else if(testImg !=null){
//                    label.setIcon(new ImageIcon(testImg, "Test img"));
//                    System.out.println("TestImage set");
//                } else {
//                    label.setIcon(new ImageIcon(defaultImg, "Default image"));
//                    System.out.println("DefaultImage set");
//                }

                openWebpage(URL);


            }
        });
        frame.getContentPane().add(button, BorderLayout.SOUTH);

        frame.setPreferredSize(new Dimension(800, 600));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void openWebpage(String urlString) {
        try {
            Desktop.getDesktop().browse(new URL(urlString).toURI());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    public static boolean openWebpage(URI uri) {
//        Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
//        if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
//            try {
//                desktop.browse(uri);
//                return true;
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//        return false;
//    }
//
//    public static boolean openWebpage(URL url) {
//        try {
//            return openWebpage(url.toURI());
//        } catch (URISyntaxException e) {
//            e.printStackTrace();
//        }
//        return false;
//    }


    private static Image loadDefaultImage(String URI) {
        try {
            String fileName = "default.png";
            BufferedImage img = ImageIO.read(new URL(URI));
            File file = new File(fileName);
            if (!file.exists()) {
                file.createNewFile();
            }
            ImageIO.write(img, "png", file);
            return img;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    private static Image loadImage(String URI) {
        try {
            String fileName = "ind.svg";
            BufferedImage img = ImageIO.read(new URL(URI));
            File file = new File(fileName);
            if (!file.exists()) {
                System.out.println("flag file exists");
                file.createNewFile();
            }
            ImageIO.write(img, "svg", file);
            return img;
        } catch (Exception e) {
            System.out.println("flag file doesn't exist");
            e.printStackTrace();
        }
        return null;
    }

    private static Image loadTestImage(String URI) {
        ImageIcon icon = new ImageIcon(URI);
        Image testImage = icon.getImage();
        System.out.println("testImage loaded");
        System.out.println(testImage.toString());
        return testImage;
    }


    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                createGUI();
            }
        });
    }
}
