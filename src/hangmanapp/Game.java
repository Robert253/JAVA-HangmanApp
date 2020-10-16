/*
 *Hangman Version 1.0
 * author@ Robert Foster
 * 27/09/2017
 */
package hangmanapp;

//Varables
public class Game {

    private String secret;
    private char guess;
    private StringBuffer strBuff;
    //constructer

    public Game() {
        secret = "house";
        guess = ' ';
        strBuff = new StringBuffer("*****");
    }
    //Setter

    public void setGuess(char guess) {
        this.guess = guess;
    }

    public void compute() {
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess) {
                strBuff.setCharAt(i, guess);
            }
        }
    }

    //Getter 
    public String getOutput() {
        return strBuff.toString();
    }

    public String getSecret() {
        return secret;
    }


}
