public class ReturnNthCharacter {

    public String returnNthCharacterFrom(String word, Integer nth) {
        if (nth < 1 || nth > word.length()) return "";

        StringBuilder newWord = new StringBuilder();

        // (nth - 1) because if nth = 1 it means the 1st character
        for (int i = nth-1; i < word.length(); i+=nth) {
            char letter = word.charAt(i);

            // tests if the character in the nth position is Uppercase
            if (Character.isUpperCase(letter)) {
                newWord.append(letter);
            }
        }

        return newWord.toString();
    }
}
