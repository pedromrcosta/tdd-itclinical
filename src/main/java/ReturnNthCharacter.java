import java.util.LinkedHashMap;
import java.util.Map;

public class ReturnNthCharacter {

    public String returnNthCharacterFrom(String word, Integer nth) {
        if (nth < 1 || nth > word.length()) return "";

        Map<Character, Integer> characterList = new LinkedHashMap<>();
        StringBuilder newWord = new StringBuilder();

        // (nth - 1) because if nth = 1 it means the 1st character
        for (int i = nth-1; i < word.length(); i+=nth) {
            char myCharacter = word.charAt(i);

            // tests if the myCharacter in the nth position is Uppercase
            if (Character.isUpperCase(myCharacter) || // character is Uppercase
                    Character.isDigit(myCharacter) || // character is a Number
                    Character.toString(myCharacter).matches("[^A-Za-z0-9]")) { // character is not a Number or a Letter (regex pattern)
                newWord.append(myCharacter);

                // if the character is in map it will return it's value else it will give 0
                int charCount = characterList.containsKey(myCharacter) ? characterList.get(myCharacter) : 0;
                characterList.put(myCharacter, charCount+=1);
            }
        }

        characterList.forEach((key, value) -> System.out.println(key + " = " + value));

        return newWord.toString();
    }
}
