import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class PigLatinTests {
    @Test
    @DisplayName("it should return apple because it starts with a vowel")
    public void testNaiveInitialVowelWordApple() {
        assertEquals("apple", PigLatin.naiveConvertWord("apple"));
    }

    @Test
    @DisplayName("it should return evil because it starts with a vowel")
    public void testNaiveInitialVowelWordEvil() {
        assertEquals("evil", PigLatin.naiveConvertWord("evil"));
    }

    @Test
    @DisplayName("it should return idle because it starts with a vowel")
    public void testNaiveInitialVowelWordIdle() {
        assertEquals("idle", PigLatin.naiveConvertWord("idle"));
    }

    @Test
    @DisplayName("it should return oval because it starts with a vowel")
    public void testNaiveInitialVowelWordOval() {
        assertEquals("oval", PigLatin.naiveConvertWord("oval"));
    }

    @Test
    @DisplayName("it should return uvula because it starts with a vowel")
    public void testNaiveInitialVowelWordUvula() {
        assertEquals("uvula", PigLatin.naiveConvertWord("uvula"));
    }

    @Test
    @DisplayName("it should return eesbay because it starts with a consonant")
    public void testNaiveInitialConsonantWordBees() {
        assertEquals("eesbay", PigLatin.naiveConvertWord("bees"));
    }

    @Test
    @DisplayName("it should return eesechay because it starts with a consonant")
    public void testNaiveInitialConsonantWordCheese() {
        assertEquals("eesechay", PigLatin.naiveConvertWord("cheese"));
    }

    @Test
    @DisplayName("it should return eezgay because it starts with a consonant")
    public void testNaiveInitialConsonantWordGeez() {
        assertEquals("eezgay", PigLatin.naiveConvertWord("geez"));
    }

    @Test
    @DisplayName("it should return easpay because it starts with a consonant")
    public void testNaiveInitialConsonantWordPeas() {
        assertEquals("easpay", PigLatin.naiveConvertWord("peas"));
    }

    @Test
    @DisplayName("it should return easeplay because it starts with a consonant")
    public void testNaiveInitialConsonantWordPlease() {
        assertEquals("easeplay", PigLatin.naiveConvertWord("please"));
    }

    @Test
    @DisplayName("it should return 'ourfay orescay and evensay earsyay ago'")
    public void testNaiveSentenceFourScoreAndSevenYearsAgo() { assertEquals("ourfay orescay and evensay earsyay ago", PigLatin.naiveConvertSentence("four score and seven years ago")); }

    @Test
    @DisplayName("it should return 'appyhay irthdaybay otay ouyay'")
    public void testNaiveSentenceHappyBirthdayToYou() { assertEquals("appyhay irthdaybay otay ouyay", PigLatin.naiveConvertSentence("happy birthday to you")); }

    @Test
    @DisplayName("it should return 'ed ate an apple'")
    public void testNaiveSentenceEdAteAnApple() { assertEquals("ed ate an apple", PigLatin.naiveConvertSentence("ed ate an apple")); }




    @Test
    @DisplayName("it should return apple because it starts with a vowel")
    public void testSmartInitialVowelWordApple() {
        assertEquals("apple", PigLatin.smartConvertWord("apple"));
    }

    @Test
    @DisplayName("it should return evil because it starts with a vowel")
    public void testSmartInitialVowelWordEvil() {
        assertEquals("evil", PigLatin.smartConvertWord("evil"));
    }

    @Test
    @DisplayName("it should return idle because it starts with a vowel")
    public void testSmartInitialVowelWordIdle() {
        assertEquals("idle", PigLatin.smartConvertWord("idle"));
    }

    @Test
    @DisplayName("it should return oval because it starts with a vowel")
    public void testSmartInitialVowelWordOval() {
        assertEquals("oval", PigLatin.smartConvertWord("oval"));
    }

    @Test
    @DisplayName("it should return uvula because it starts with a vowel")
    public void testSmartInitialVowelWordUvula() {
        assertEquals("uvula", PigLatin.smartConvertWord("uvula"));
    }

    @Test
    @DisplayName("it should return eesbay because it starts with a consonant")
    public void testSmartInitialConsonantWordBees() {
        assertEquals("eesbay", PigLatin.smartConvertWord("bees"));
    }

    @Test
    @DisplayName("it should return eesechay because it starts with a consonant")
    public void testSmartInitialConsonantWordCheese() {
        assertEquals("eesechay", PigLatin.smartConvertWord("cheese"));
    }

    @Test
    @DisplayName("it should return eezgay because it starts with a consonant")
    public void testSmartInitialConsonantWordGeez() {
        assertEquals("eezgay", PigLatin.smartConvertWord("geez"));
    }

    @Test
    @DisplayName("it should return easpay because it starts with a consonant")
    public void testSmartInitialConsonantWordPeas() {
        assertEquals("easpay", PigLatin.smartConvertWord("peas"));
    }

    @Test
    @DisplayName("it should return easeplay because it starts with a consonant")
    public void testSmartInitialConsonantWordPlease() {
        assertEquals("easeplay", PigLatin.smartConvertWord("please"));
    }

    @Test
    @DisplayName("it should return 'ourfay orescay and evensay earsyay ago'")
    public void testSmartSentenceFourScoreAndSevenYearsAgo() { assertEquals("ourfay orescay and evensay earsyay ago", PigLatin.smartConvertSentence("four score and seven years ago")); }

    @Test
    @DisplayName("it should return 'appyhay irthdaybay otay ouyay'")
    public void testSmartSentenceHappyBirthdayToYou() { assertEquals("appyhay irthdaybay otay ouyay", PigLatin.smartConvertSentence("happy birthday to you")); }

    @Test
    @DisplayName("it should return 'ed ate an apple'")
    public void testSmartSentenceEdAteAnApple() { assertEquals("ed ate an apple", PigLatin.smartConvertSentence("ed ate an apple")); }
}