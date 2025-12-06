package Practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordMatchTest {

    @Test
    void scoreGuess() {
        WordMatch match = new WordMatch("mississippi");

        assertEquals(match.scoreGuess("i"), 4);
        assertEquals(match.scoreGuess("iss"), 18);
        assertEquals(match.scoreGuess("issipp"), 36);
        assertEquals(match.scoreGuess("mississippi"), 121);
    }
//
//    @org.junit.jupiter.api.Test
//    void findBetterGuess() {
//    }
}