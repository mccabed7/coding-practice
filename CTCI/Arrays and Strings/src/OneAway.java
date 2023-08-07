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

        if(s.length() == 1 && t.length() == 0) return true;

        for (int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) != t.charAt(i)){
                //edge conditions not tested yet [when index is at end, empty strings, etc.]
                //check add
                if(s.substring(i).equals(t.substring(i + 1))) return true;

                //check remove
                if(s.substring(i + 1).equals(t.substring(i))) return true;

                //check replace
                if(s.substring(i + 1).equals(t.substring(i + 1))) return true;

                return false;
            }
        }
        return true;
    }


    public static void main(String[] args)
    {
        System.out.println("pale + ple" + solution("pale", "ple"));
        System.out.println("pale + pasle" + solution("pale", "pasle"));
        System.out.println("pale + bale" + solution("pale", "bale"));
        System.out.println("pale + bake" + solution("pale", "bake"));
    }
}
