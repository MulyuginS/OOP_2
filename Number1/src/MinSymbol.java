public class MinSymbol {

    public String findMinDifferentCharsWord(String text) {
        String[] words = text.split("\\s+");
        String minWord = words[0];
        int minChars = countDifferentChars(minWord);

        for (int i = 1; i < words.length; i++) {
            int currentChars = countDifferentChars(words[i]);
            if (currentChars < minChars) {
                minWord = words[i];
                minChars = currentChars;
            }
        }
        return minWord;
    }

    public int countDifferentChars(String word) {
        boolean[] charFound = new boolean[256];
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            charFound[c] = true;
        }
        int count = 0;
        for (int j = 0; j < charFound.length; j++) {
            boolean found = charFound[j];
            if (found) {
                count++;
            }
        }
        return count;
    }
}