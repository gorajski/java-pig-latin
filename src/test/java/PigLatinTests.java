import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class PigLatinTests {
    @Test
    @DisplayName("it should return apple because it starts with a vowel")
    public void testInitialVowelWordApple() {
        assertEquals("apple", PigLatin.convert("apple"));
    }

    @Test
    @DisplayName("it should return evil because it starts with a vowel")
    public void testInitialVowelWordEvil() {
        assertEquals("evil", PigLatin.convert("evil"));
    }

    @Test
    @DisplayName("it should return idle because it starts with a vowel")
    public void testInitialVowelWordIdle() {
        assertEquals("idle", PigLatin.convert("idle"));
    }

    @Test
    @DisplayName("it should return oval because it starts with a vowel")
    public void testInitialVowelWordOval() {
        assertEquals("oval", PigLatin.convert("oval"));
    }

    @Test
    @DisplayName("it should return uvula because it starts with a vowel")
    public void testInitialVowelWordUvula() {
        assertEquals("uvula", PigLatin.convert("uvula"));
    }

    @Test
    @DisplayName("it should return eesbay because it starts with a consonant")
    public void testInitialConsonantWordBees() {
        assertEquals("eesbay", PigLatin.convert("bees"));
    }

    @Test
    @DisplayName("it should return eesechay because it starts with a consonant")
    public void testInitialConsonantWordCheese() {
        assertEquals("eesechay", PigLatin.convert("cheese"));
    }

    @Test
    @DisplayName("it should return eezgay because it starts with a consonant")
    public void testInitialConsonantWordGeez() {
        assertEquals("eezgay", PigLatin.convert("geez"));
    }

    @Test
    @DisplayName("it should return easpay because it starts with a consonant")
    public void testInitialConsonantWordPeas() {
        assertEquals("easpay", PigLatin.convert("peas"));
    }

    @Test
    @DisplayName("it should return easeplay because it starts with a consonant")
    public void testInitialConsonantWordPlease() {
        assertEquals("easeplay", PigLatin.convert("please"));
    }

}
