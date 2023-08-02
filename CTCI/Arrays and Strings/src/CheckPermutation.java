/*
    Problem: implement an algorithm to determine if a string is one permutation of another
    Solution: complete
    Tested: yes
    Time Complexity: O(n), where n is the length of both of the strings (this is the worst case)
    Space Complexity: O(1)

    Notes:
        + Similar to isUnique, using a constant size vector to store info about the data
 */

import java.util.Arrays;

public class CheckPermutation
{

    /**
     * An algorithm to determine if one string is a permutation of another.
     @param a First string.
     @param b Second string.
     @return True if the strings are permutations of each other, false otherwise.
     */
    public static boolean solution(String a, String b){
        if(a.length() != b.length()) return false;
        int aChars[] = charCount(a);
        int bChars[] = charCount(b);

        for (int i = 0; i < 128; i++)
        {
            if(aChars[i] != bChars[i]) return false;
        }
        return true;
    }

    /**
     * A method to count the individual ASCII characters in a string.
     @param c The String being counted.
     @return An array of length 128 with a count of each individual ASCII character.
     */
    public static int[] charCount(String c){
        int chars[] = new int[128];  // we are creating a count of each ASCII character in the string
        Arrays.fill(chars, 0);
        for (int i = 0; i < c.length(); i++)
        {
            chars[c.charAt(i)]++;
        }
        return chars;
    }


    public static void main(String[] args)
    {
        System.out.println("hello + olleh: " + solution("hello", "olleh"));
        System.out.println("hedfo + olleh " + solution("hedfo", "olleh"));
        System.out.println("fish + sifh: " + solution("fish", "sifh"));
        System.out.println("a + f: " + solution("a", "f"));
        System.out.println("hello + hell: " + solution("hello","hell"));
        System.out.println("[empty strings]: " + solution("", ""));
    }
}
