// 11/27/23
// Pierce Mohney
// SDEV 200
// M05 assignment 1
// This program will take four different images and put them into a grid layout of 2x2. 
// For program to work correctly change gif paths to your own computer's gif path.

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.io.File;

public class GifGrid {

    public static void main(String[] args) {
        JFrame frame = new JFrame("GIF Grid");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(2, 2, 10, 10));

//**NOTICE**//
        addGifToPanel(panel, "c:/user/example/Desktop/folder/images/flag1.gif");
        addGifToPanel(panel, "c:/user/example/Desktop/folder/images/flag2.gif");
        addGifToPanel(panel, "c:/user/example/Desktop/folder/images/flag6.gif");
        addGifToPanel(panel, "c:/user/example/Desktop/folder/images/flag7.gif");
//**Change paths in these four methods to your own computer's path of gif images
//**Example of valid format location path: "c:/user/example/Desktop/folder/images/example.gif"

        frame.getContentPane().add(panel);

        frame.setSize(900, 500);
        frame.setVisible(true);
    }
//Creates a grid panel for gif images 

    private static void addGifToPanel(JPanel panel, String gifPath) {
        File file = new File(gifPath);
        if (file.exists()) {
            ImageIcon imageIcon = new ImageIcon(file.getAbsolutePath());

            JLabel label = new JLabel(imageIcon);

            panel.add(label);
        } else {
            System.err.println("Error from gif path " + gifPath);
        }
    }
//Loads Gif images from file path, creates Jlabel to display them in panel, and handles errors from gif paths. 
}
