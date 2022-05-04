import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReturnNthCharacter {

    public String returnNthCharacterFrom(String word, Integer nth) {
        if (nth < 1 || nth > word.length()) return "";

        StringBuilder newWord = new StringBuilder();

        // (nth - 1) because if nth = 1 it means the 1st character
        for (int i = nth-1; i < word.length(); i+=nth) {
            char myCharacter = word.charAt(i);

            // tests if the myCharacter in the nth position is Uppercase
            if (Character.isUpperCase(myCharacter) || // character is Uppercase
                    Character.isDigit(myCharacter) || // character is a Number
                    Character.toString(myCharacter).matches("[^A-Za-z0-9]")) { // character is not a Number or a Letter (regex pattern)
                newWord.append(myCharacter);
            }
        }

        return newWord.toString();
    }
}
