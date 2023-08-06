/*
    Problem: implement an algorithm to determine if only one (or none) of the following operations
                have been performed on a string: add char, remove char, replace char
    Solution: incomplete
    Tested: no
    Time Complexity:
    Space Complexity:

    Explanation of implementation:

    Notes:
        +
        +
 */

public class OneAway
{
    /**
     * An algorithm that compares a string with possibly modified other string
     * checking that only one of the operations have been performed on it
     @param s The original ASCII string
     @param t The possibly modified copy of the string
     @return True if one or zero modifications were made, false otherwise
     */
    public static boolean solution(String s, String t){
        boolean foundAdd = false;
        boolean foundRemove = false;
        boolean foundReplace = false;
        for (int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) != t.charAt(i)){
                //check add

                //check remove
                //check replace
            }
        }
        return true;
    }


    public static void main(String[] args)
    {
        System.out.println("pale + ple");
        System.out.println("pales + pale");
        System.out.println("pale + bale");
        System.out.println("pale + bake");
    }
}
