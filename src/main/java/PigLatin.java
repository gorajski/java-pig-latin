public class PigLatin {

    public static String naiveConvertWord(String input) {
        String firstLetter = input.substring(0, 1);
        Integer firstVowelPosition = 0;
        if (isVowel(firstLetter)) {
            return input;
        }

        for(Integer letterPosition = 0; (!isVowel(input.substring(letterPosition, letterPosition + 1)) && letterPosition < input.length()); letterPosition++) {
            firstVowelPosition = letterPosition + 1;
        }

        return(input.substring(firstVowelPosition) + input.substring(0, firstVowelPosition) + "ay");
    }

    public static String naiveConvertSentence(String input) {
        Integer start = -1;
        Integer end;
        String output = "";
        for(Integer letterPosition = 0; letterPosition < input.length(); letterPosition++) {

            if (!isSpace(input.substring(letterPosition, letterPosition + 1)) && (start.equals(-1))) {
                start = letterPosition;
            } else if (isSpace(input.substring(letterPosition, letterPosition + 1))) {
                end = letterPosition;
                output += naiveConvertWord(input.substring(start, end)) + " ";
                start = -1;
            } else if (letterPosition == input.length() - 1) {
                end = input.length();
                output += naiveConvertWord(input.substring(start, end));
            }

        }
        return output.substring(0, output.length());
    }


    public static String smartConvertWord(String input) {
        Character firstLetter = input.charAt(0);
        Integer firstVowelPosition = 0;
        if (isVowel(firstLetter)) {
            return input;
        }

        for(Integer letterPosition = 0; (!isVowel(input.charAt(letterPosition)) && letterPosition < input.length()); letterPosition++) {
            firstVowelPosition = letterPosition + 1;
        }

        return(input.substring(firstVowelPosition) + input.substring(0, firstVowelPosition) + "ay");
    }

    public static String smartConvertSentence(String input) {
        Integer start = -1;
        Integer end;
        StringBuilder output = new StringBuilder();
        for(Integer letterPosition = 0; letterPosition < input.length(); letterPosition++) {

            if (!isSpace(input.charAt(letterPosition)) && (start.equals(-1))) {
                start = letterPosition;
            } else if (isSpace(input.charAt(letterPosition))) {
                end = letterPosition;
                output.append(naiveConvertWord(input.substring(start, end))).append(" ");
                start = -1;
            } else if (letterPosition == input.length() - 1) {
                end = input.length();
                output.append(naiveConvertWord(input.substring(start, end)));
            }

        }
        return output.substring(0, output.length());
    }


    private static Boolean isVowel(String letter) {
        return letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u");
    }

    private static Boolean isVowel(Character letter) {
        return letter.equals('a') || letter.equals('e') || letter.equals('i') || letter.equals('o') || letter.equals('u');
    }

    private static Boolean isSpace(String letter) {
        return letter.equals(" ");
    }

    private static Boolean isSpace(Character letter) {
        return letter.equals(' ');
    }
}