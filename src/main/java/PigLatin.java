public class PigLatin {

    public static String convert(String input) {
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

    private static Boolean isVowel(String letter) {
        return letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u");
    }
}