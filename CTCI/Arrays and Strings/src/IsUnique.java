/*
    Problem: implement an algorithm to determine if a string has only unique characters
    Solution: complete
    Tested: yes
    Time Complexity: O(n)
    Space Complexity: O(1)

    Notes:
        + int in java is 32 bits (=4 bytes)
        + a bit vector is good if you need a list of 'status switches'
 */


public class IsUnique
{


    /**
     * An algorithm to determine if a string has only unique characters
       @param s The ASCII string to be tested.
       @return True if each character composing s only occurs once, false otherwise.
     */
    public static boolean solution(String s){
        int vectorArray [] = {0,0,0,0}; // data structure to store the 'found once' status of each type of char (128 in ASCII)
        for (int i = 0; i < s.length(); i++)
        {
            int c = s.charAt(i);
            int test = vectorArray[4*(c/128)] & 1 << c%32; // check to see if the char has been found before
            if (test != 0) return false;

            vectorArray[4*(c/128)] = vectorArray[4*(c/128)] | 1 << c%32; // flip bit to set to 'found once'
        }
        return true;
    }

    public static void main(String[] args)
    {
        System.out.println("Hello World: " + solution("Hello World!"));
        System.out.println("helo: " + solution("helo"));
        System.out.println("asdflkjasdf: " + solution("asdflkjasdf"));
        System.out.println("hi: " + solution("hi"));
        System.out.println("Declan: " + solution("Declan"));
        System.out.println("a: " + solution("a"));
    }
}
