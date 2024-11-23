package edu.bsu.cs222;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameWork extends JFrame implements ActionListener {
    JButton GetRatesButton;
    JButton convertRatesButton;
    JButton historyButton;
    JButton strongestAndWeakestButton;
    JButton globalRankingButton;

     FrameWork() {
        ImageIcon image = new ImageIcon("IMG_1702");
        JLabel label = new JLabel();
        label.setIcon(image);

        JFrame applicationFrame = new JFrame();

        JPanel sidePanel = new JPanel();
        JPanel topPanel = new JPanel();
        sidePanel.setBackground(Color.GREEN);
        topPanel.setBackground(Color.GREEN);
        sidePanel.setBounds(0, 0, 200, 900);
        topPanel.setBounds(0, 0, 2000, 200);
        TextArea title = new TextArea();
        title.setBounds(25, 400, 25, 50);
        title.setText("Currency ConFlipper");


        GetRatesButton = new JButton();
        GetRatesButton.setBounds(15, 15, 150, 150);
        GetRatesButton.setText("Get Rates");
        GetRatesButton.addActionListener(this);

        convertRatesButton = new JButton();
        convertRatesButton.setBounds(15, 100, 150, 150);
        convertRatesButton.setText("Convert Currency");
        convertRatesButton.addActionListener(this);

        historyButton = new JButton();
        historyButton.setBounds(25, 75, 150, 150);
        historyButton.setText("History");
        historyButton.addActionListener(this);

        strongestAndWeakestButton = new JButton();
        strongestAndWeakestButton.setBounds(25, 550, 150, 150);
        strongestAndWeakestButton.setText("Strongest/Weakest");
        strongestAndWeakestButton.addActionListener(this);

        globalRankingButton = new JButton();
        globalRankingButton.setBounds(25, 725, 150, 150);
        globalRankingButton.setText("Global Ranking");
        globalRankingButton.addActionListener(this);

        applicationFrame.setTitle("Currency Converter");
        applicationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        sidePanel.add(GetRatesButton);
        sidePanel.add(convertRatesButton);
        sidePanel.add(historyButton);
        sidePanel.add(strongestAndWeakestButton);
        sidePanel.add(globalRankingButton);


        applicationFrame.setSize(2000, 2000);
        applicationFrame.setVisible(true);
        applicationFrame.add(label);
        applicationFrame.add(sidePanel);
        applicationFrame.add(topPanel);
        applicationFrame.add(title);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == GetRatesButton) {
            System.out.println("Test");
        }
    }
}
