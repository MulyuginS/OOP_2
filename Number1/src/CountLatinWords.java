public class CountLatinWords {
    public int countLatinWords(String sentence) {
        int counter = 0;
        boolean isLatinWord = false;
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
                if (!isLatinWord) {
                    isLatinWord = true;
                    counter++;
                }
            } else {
                isLatinWord = false;
            }
        }
        return counter;
    }

}
