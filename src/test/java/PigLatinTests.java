import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class PigLatinTests {
    @Test
    @DisplayName("it should return apple because it starts with a vowel")
    public void testInitialVowelWordApple() {
        assertEquals("apple", PigLatin.convertWord("apple"));
    }

    @Test
    @DisplayName("it should return evil because it starts with a vowel")
    public void testInitialVowelWordEvil() {
        assertEquals("evil", PigLatin.convertWord("evil"));
    }

    @Test
    @DisplayName("it should return idle because it starts with a vowel")
    public void testInitialVowelWordIdle() {
        assertEquals("idle", PigLatin.convertWord("idle"));
    }

    @Test
    @DisplayName("it should return oval because it starts with a vowel")
    public void testInitialVowelWordOval() {
        assertEquals("oval", PigLatin.convertWord("oval"));
    }

    @Test
    @DisplayName("it should return uvula because it starts with a vowel")
    public void testInitialVowelWordUvula() {
        assertEquals("uvula", PigLatin.convertWord("uvula"));
    }

    @Test
    @DisplayName("it should return eesbay because it starts with a consonant")
    public void testInitialConsonantWordBees() {
        assertEquals("eesbay", PigLatin.convertWord("bees"));
    }

    @Test
    @DisplayName("it should return eesechay because it starts with a consonant")
    public void testInitialConsonantWordCheese() {
        assertEquals("eesechay", PigLatin.convertWord("cheese"));
    }

    @Test
    @DisplayName("it should return eezgay because it starts with a consonant")
    public void testInitialConsonantWordGeez() {
        assertEquals("eezgay", PigLatin.convertWord("geez"));
    }

    @Test
    @DisplayName("it should return easpay because it starts with a consonant")
    public void testInitialConsonantWordPeas() {
        assertEquals("easpay", PigLatin.convertWord("peas"));
    }

    @Test
    @DisplayName("it should return easeplay because it starts with a consonant")
    public void testInitialConsonantWordPlease() {
        assertEquals("easeplay", PigLatin.convertWord("please"));
    }

    @Test
    @DisplayName("it should return 'ourfay orescay and evensay earsyay ago'")
    public void testSentenceFourScoreAndSevenYearsAgo() { assertEquals("ourfay orescay and evensay earsyay ago", PigLatin.convertSentence("four score and seven years ago")); }

    @Test
    @DisplayName("it should return 'appyhay irthdaybay otay ouyay'")
    public void testSentenceHappyBirthdayToYou() { assertEquals("appyhay irthdaybay otay ouyay", PigLatin.convertSentence("happy birthday to you")); }

    @Test
    @DisplayName("it should return 'ed ate an apple'")
    public void testSentenceEdAteAnApple() { assertEquals("ed ate an apple", PigLatin.convertSentence("ed ate an apple")); }
}