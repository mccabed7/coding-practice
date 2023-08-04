/*
    Problem: implement an algorithm to check if a string is a permutation of some palindrome
    Solution: complete
    Tested: yes
    Time Complexity: O(n), where n is the length of the string
    Space Complexity: O(1)

    Notes:
        + Again, using a vector to store info about each ASCII character
        + This solution works off the fact that a palindrome permutation can have no more than one
        +       character with an odd count
 */


import java.util.Arrays;

public class PalindromePermutation
{


    /**
     * An algorithm that checks if a string is a permutation of some palindrome
     @param s The ASCII string being checked
     @return True if the string is a permutation of some palindrome, false otherwise
     */
    public static boolean solution(String s){
        int[] chars = new int[128];
        Arrays.fill(chars, 0); // ints initialise at zero, but explicitly filling here just in case
        for (int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) != ' ') chars[s.charAt(i)]++;
        }

        boolean found1 = false;
        for (int i = 0; i < 128; i++)
        {
            if(chars[i] == 1 && !found1)
            {
                found1 = true;
            }
            else if (chars[i] % 2 != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        System.out.println("taco cat: " + solution("taco cat"));
        System.out.println("tacof cat: " + solution("tacof cat"));
        System.out.println("tacf   cat: " + solution("tacf   cat"));
    }
}
