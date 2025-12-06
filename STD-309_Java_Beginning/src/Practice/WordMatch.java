package Practice;

public class WordMatch
{
    /** The secret string. */
    private String secret;

    /** Constructs a WordMatch object with the given secret string of lowercase letters. */
    public WordMatch(String word)
    {
        this.secret = word;

    }

    /**
     * Returns a score for guess, as described in part (a).
     * Precondition: 0 < guess.length() <= secret.length()
     */
    // "dercdd" , "cd" , str.indexOf("cd") --> 2
    public int scoreGuess(String guess)
    {
        String sec2 = this.secret;
        int guessLength = guess.length();
        int count = 0;
        while (sec2.contains(guess)){
            int index= sec2.indexOf(guess);
            count++;
            sec2 = sec2.substring(index+1);
        }
        return count * guessLength * guessLength;
    }

    /**
     * Returns the better of two guesses, as determined by scoreGuess and the rules for a
     * tie-breaker that are described in part (b).
     * Precondition: guess1 and guess2 contain all lowercase letters.
     * guess1 is not the same as guess2.
     */
    public String findBetterGuess(String guess1, String guess2)
    {
        /* to be implemented in part (b) */
        int guess1Score = scoreGuess(guess1);
        int guess2Score = scoreGuess(guess2);

        // g1 > g2
        // g1 == g2 or g2 > g1
        // if g1 == g2
            // g1.cmpr(g2) > 0 ---> g1 else g2

        // -1, 0, 1
        // con.compareTo(cat)
        // c o t ----> greater ---> 1
        // c a n -->

        if(guess1Score > guess2Score){
            return guess1;
        }else {
            if(guess1Score == guess2Score){
                if(guess1.compareTo(guess2) > 0) {
                    return guess1;
                }else{
                    return guess2;
                }
            }else{
                return guess2;
            }
        }
    }
}