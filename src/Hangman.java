import java.awt.*;
import java.util.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;

public class Hangman {

    private static String[] words = {"life", "lemmons", "love", "kagebuushinnojutstu", "mediacollege", "leanderkruiden", "oliebollen", "makker", "kloteren", "random", "bureau", "beeldscherm"};
    private static String word = words[(int) (Math.random() * words.length)];
    private static String asterisk = new String(new char[word.length()]).replace("\0", "*");
    private static int count = 0;
    private static String s;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();

        System.out.println("Dit is mijn hangman spel");
        System.out.println(" ");
        System.out.println("How to play:");
        System.out.println("-je krijgt een woord");
        System.out.println("-je moet het woord gaan gokken");
        System.out.println("-als je alle letters goed gokt dan win je!");
        System.out.println("-als je genoeg keren iets fout gcokt, dan verloor je");
        System.out.println("Good luck have fun!");
        System.out.println(" ");
        while (count < 7 && asterisk.contains("*")) {
            System.out.println("raad een letter AUB!!");
            System.out.println(asterisk);
            String guess = sc.next();
            hang(guess);
        }
        sc.close();
		if(s.equals("stop")) {System.exit(0);}

    }



	public static void hang(String guess) {
		String newasterisk = "";
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == guess.charAt(0)) {
				newasterisk += guess.charAt(0);
			} else if (asterisk.charAt(i) != '*') {
				newasterisk += word.charAt(i);
			} else {
				newasterisk += "*";
			}
			if(s.equals("stop")) {System.exit(0);}
		}

		if (asterisk.equals(newasterisk)) {
			count++;
			hangmanImage();
		} else {
			asterisk = newasterisk;
		}
		if (asterisk.equals(word)) {
			System.out.println("Je hebt gewonnen!!! " + word);
		}
		if(s.equals("stop")) {System.exit(0);}
	}

	public static void hangmanImage() {
		if (count == 1) {
			System.out.println("FOUT, Probeer een andere letter");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("___|___");
			System.out.println();
			if(s.equals("stop")) {System.exit(0);}
		}
		if (count == 2) {
			System.out.println("FOUT, Probeer een andere letter");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("___|___");
			if(s.equals("stop")) {System.exit(0);}
		}
		if (count == 3) {
			System.out.println("FOUT, Probeer een andere letter");
			System.out.println("   ____________");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   | ");
			System.out.println("___|___");
			if(s.equals("stop")) {System.exit(0);}
		}
		if (count == 4) {
			System.out.println("FOUT, Probeer een andere letter");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("___|___");
			if(s.equals("stop")) {System.exit(0);}
		}
		if (count == 5) {
			System.out.println("FOUT, Probeer een andere letter");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |");
			System.out.println("___|___");
			if(s.equals("stop")) {System.exit(0);}
		}
		if (count == 6) {
			System.out.println("FOUT, Probeer een andere letter");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |          / \\ ");
			System.out.println("___|___      /   \\");
			if(s.equals("stop")) {System.exit(0);}
		}
		if (count == 7) {
			System.out.println("VERLOREN");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |          _|_");
			System.out.println("   |         / | \\");
			System.out.println("   |          / \\ ");
			System.out.println("___|___      /   \\");
			System.out.println("VERLOREN! het woord was " + word);
			if(s.equals("stop")) {System.exit(0);}
		}
		if(s.equals("stop")) {System.exit(0);}
	}

}
