/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangmanapp;

import javax.swing.JOptionPane;

public class HangmanApp {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        String output;
        char guess;

        Game myHang = new Game();
        for (int i = 0; i < 5; i++) {

            guess = (JOptionPane.showInputDialog(null, "Enter a letter")).charAt(0);
            myHang.setGuess(guess);
            myHang.compute();

            output = myHang.getStrBuff();
            JOptionPane.showMessageDialog(null, output);
        }

    }
}