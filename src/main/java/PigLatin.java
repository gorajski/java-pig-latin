public class PigLatin {

    public static String convertWord(String input) {
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

    public static String convertSentence(String input) {
        Integer start = -1;
        Integer end;
        String output = "";
        for(Integer letterPosition = 0; letterPosition < input.length(); letterPosition++) {

            if (!isSpace(input.substring(letterPosition, letterPosition + 1)) && (start.equals(-1))) {
                start = letterPosition;
            } else if (isSpace(input.substring(letterPosition, letterPosition + 1))) {
                end = letterPosition;
                output += convertWord(input.substring(start, end)) + " ";
                start = -1;
            } else if (letterPosition == input.length() - 1) {
                end = input.length();
                output += convertWord(input.substring(start, end));
            }

        }
        return output.substring(0, output.length());
    }

    private static Boolean isVowel(String letter) {
        return letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u");
    }

    private static Boolean isSpace(String letter) {
        return letter.equals(" ");
    }
}