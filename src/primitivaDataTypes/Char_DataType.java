package primitivaDataTypes;

public class Char_DataType {

	public static void main(String[] args) {

		char letter = 'A';
        char digit = '7';
        char unicode = '\u0906'; 
        char next = (char) (letter + 1); 

        System.out.println("Char values:");
        System.out.println("letter = " + letter);
        System.out.println("digit  = " + digit);
        System.out.println("unicode= " + unicode);
        System.out.println("next   = " + next);
        System.out.println("numeric value of 'A' = " + (int) letter);

	}

}
