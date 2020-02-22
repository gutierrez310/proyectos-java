
/*
For this problem, you will implement a variation of the classic wordgame Hangman. For
those of you who are unfamiliar with the rules, you may read all about it here. In this
problem, the second player will always be the computer, who will be picking a word at
random.

In this problem, you will implement a function, called hangman, that will start up and
carry out an interactive Hangman game between a player and the computer. Before we get
to this function, we'll first implement a few helper functions to get you going.

For this problem, you will need the code files ps3_hangman.py and words.txt...

Requirements - Here are the requirements for your game:

1-The computer must select a word at random from the list of available words that was
provided in words.txt. The functions for loading the word list and selecting a random
word have already been provided for you in ps3_hangman.py.

2-The game must be interactive; the flow of the game should go as follows:
--At the start of the game, let the user know how many letters the computer's word contains.
--Ask the user to supply one guess (i.e. letter) per round.
--The user should receive feedback immediately after each guess about whether their guess
appears in the computer's word.
--After each round, you should also display to the user the partially guessed word so far,
as well as letters that the user has not yet guessed.

3-Some additional rules of the game:
--A user is allowed 8 guesses. Make sure to remind the user of how many guesses s/he has
left after each round. Assume that players will only ever submit one character at a time
(A-Z).
--A user loses a guess only when s/he guesses incorrectly.
--If the user guesses the same letter twice, do not take away a guess - instead, print a
message letting them know they've already guessed that letter and ask them to try again.
--The game should end when the user constructs the full word or runs out of guesses. If
the player runs out of guesses (s/he "loses"), reveal the word to the user when the game
ends.

Sample Output
The output of a winning game should look like this...

	Loading word list from file...
	55900 words loaded.
	Welcome to the game, Hangman!
	I am thinking of a word that is 4 letters long.
	-------------
	You have 8 guesses left.
	Available letters: abcdefghijklmnopqrstuvwxyz
	Please guess a letter: a
	Good guess: _ a_ _
	...
*/


import java.util.Scanner;
public class Problemset3{
    
    public static boolean isWordGuessed(String secretWord, String lettersGuessed){
        boolean outp=true;
        for(int i=0;i<secretWord.length();i++)
            if(lettersGuessed.indexOf(secretWord.charAt(i)) < 0)
                outp=false;
        return outp;         
    }
    
    public static String getGuessedWord(String secretWord, String lettersGuessed){
        String theString="";
        for(int i=0; i < secretWord.length();i++){
            if(lettersGuessed.indexOf(secretWord.charAt(i)) >= 0)
                theString=theString+secretWord.charAt(i);
            else
                theString=theString+"_";
        }
        return theString;
    }

    public static String getAvailableLetters(String lettersGuessed){
        String theString="";
        for(int i=97; i<=122;i++){
            if(lettersGuessed.indexOf((char)i)<0){
                theString = theString + (char)i;
            }
        }
        return theString;
    }

    
    public static void hangman(String secretWord){
        Scanner scan=new Scanner(System.in);
	    System.out.println("Welcome to the game, Hangman!\nI am thinking of a word that is "+secretWord.length() +" letters long.");
        String lettersGuessed = "";
        int guessesLeft = 8;
        System.out.println("-------------");
	    char inputt;
	    while(true){
	        System.out.println("You have " + guessesLeft + " guesses left.");
	        System.out.println("Available letters: "+ getAvailableLetters(lettersGuessed));
	        System.out.println("Please guess a letter: ");
	        inputt = scan.next().charAt(0);
	        if(lettersGuessed.indexOf(inputt) >= 0){
	            System.out.println("Oops! You've already guessed that letter: " + getGuessedWord(secretWord, lettersGuessed));
	        } else if(secretWord.indexOf(inputt) >= 0){
	            lettersGuessed = lettersGuessed + inputt;
	            System.out.println("Good guess: " + getGuessedWord(secretWord, lettersGuessed));
	        } else{
	            lettersGuessed = lettersGuessed + inputt;
	            --guessesLeft;
	            System.out.println("Oops! That letter is not in my word: " + getGuessedWord(secretWord, lettersGuessed));
	        }
	        System.out.println("-------------");
	        if(isWordGuessed(secretWord, lettersGuessed)){
	            System.out.println("Congratulations, you won!");
		        break;
	        }
	        if(guessesLeft == 0){
	            System.out.println("Sorry, you ran out of guesses. The word was " + secretWord +".");
		        break;
	        }
	    }
	}
    public static void main(String[] args){
        String palabraSecreta = "aloha";
        hangman(palabraSecreta);
        
    }
}
