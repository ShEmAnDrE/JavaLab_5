package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Animation extends JFrame {
    private JPanel panel = new JPanel();
    private JLabel titleLabel = new JLabel("Гомер бегает:");
    private JLabel picLabel;

    public void startAnimation() {
        while (true) {
            for (int i = 0; i < 10; i++) {
                try {
                    BufferedImage myPicture = ImageIO.read(new File("/Users/andreyshemchuk/Downloads/homer/homer-" + (i + 1) + ".jpg"));
                    picLabel.setIcon(new ImageIcon(myPicture));
                    Thread.sleep(100);
                } catch (IOException | InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public Animation () {
        super ("Animation");
        setSize(650, 500);
        setContentPane(panel);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel.setLayout(new GridLayout());
        titleLabel.setFont(new Font("Serif",Font.PLAIN,50));
        titleLabel.setHorizontalAlignment(0);
        panel.add(titleLabel);
        try {
            BufferedImage myPicture = ImageIO.read(new File("/Users/andreyshemchuk/Downloads/homer/homer-1.jpg"));
            picLabel = new JLabel(new ImageIcon(myPicture));
            panel.add(picLabel);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
