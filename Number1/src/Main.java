public class Main {
    public static void main(String[] args) {
        int current = sumDigits.current;
        sumDigits.digits();

        MedianChars medianChars = new MedianChars();
        String str1 = "string";
        System.out.println( medianChars.getMedianChars(str1));

        CountLatinWords counter = new CountLatinWords();
        String sentence = "One two three раз два три one1 two2 123 ";
        int latinWordCount = counter.countLatinWords(sentence);
        System.out.println( latinWordCount);

        String text = "fffff ab f 1234 jkjk";
        MinSymbol finder = new MinSymbol();
        String minWord = finder.findMinDifferentCharsWord(text);
        System.out.println( minWord);
            }
        }


