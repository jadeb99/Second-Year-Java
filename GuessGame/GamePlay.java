package com.lab6.www;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.util.Random;;

public class GamePlay extends JFrame {
	int userGuess;
	int guessCount;
	
	Random randomNum = new Random();
	int randNum = randomNum.nextInt(100);
	
	
	JButton generateBut, submitBut;
	JLabel guessLab, pictureLab;
	JTextField userInp;
	JPanel norPan, souPan, cenPan;
	
	
	
	public GamePlay() {
		guessLab = new JLabel ("Make Guess!");
		
		userInp = new JTextField (15);
		userInp.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					userGuess = Integer.parseInt(userInp.getText());
					
					if (userGuess == randNum) {
						JOptionPane.showMessageDialog(userInp, "You got it in " + guessCount + " guesses!");
					}
					if (userGuess > randNum) {
						JOptionPane.showMessageDialog(userInp, "Too High!");
					}
					if (userGuess < randNum) {
						JOptionPane.showMessageDialog(userInp, "Too Low!");
					}
					
					guessCount++;
				}
				catch (Exception e1) {
					JOptionPane.showMessageDialog(userInp, "Invalid Input!");
				}
			}
		});
		
		generateBut = new JButton ("Generate a Random Number!");
		generateBut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int randNum = randomNum.nextInt(100);
				JOptionPane.showMessageDialog(generateBut, "Generated!");
				guessCount = 0;
			}
		});
		
		
		submitBut = new JButton ("Submit!");
		submitBut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(generateBut, "Click");
			}
		});
		
		
		norPan = new JPanel();
		souPan = new JPanel();
		cenPan = new JPanel();
		
		norPan.add(generateBut);
		souPan.add(submitBut);
		cenPan.add(userInp);
		
		add(norPan, BorderLayout.NORTH);
		add(souPan, BorderLayout.SOUTH);
		add(cenPan, BorderLayout.CENTER);
		
		setSize(600,600);
		setVisible(true);
		
		
	}
	
}