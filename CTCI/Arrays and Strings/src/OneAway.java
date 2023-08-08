/*
    Problem: implement an algorithm to determine if only one (or none) of the following operations
                have been performed on a string: add char, remove char, replace char
    Solution: complete
    Tested: Yes, quickly by changing tests on each run  //TODO write out all unit tests
    Time Complexity: O(n), where n is the length of the shorter string (by one char) in the worst case
    Space Complexity: O(1

    Explanation of implementation:
            I first attempted this problem in the "solution()" method, but realised it was wrong, and briefly
            glanced at the solution in the book before attempting again in "bookStyleSolution()".  I have
            included both solutions below as I think there are valuable lessons to be learned from it.
            My problem was that I was just coding as I was thinking, eliminating cases using if-statements
            as I went along.  This produced a very messy ad-hoc solution that was trying to brute-force
            my original plan into working.
            The book's solution rather reduces cases first, thinking about what info each case gives us.
            It ends up a lot cleaner, and a lot simpler to code.

    Notes:
        + The main takeaway is that you should think about your different cases before implementing a solution.

 */

public class OneAway
{

    public static boolean bookStyleSolution(String s, String t){
        if(s.length() == t.length()){
            return sameLength(s, t);
        }
        else if(s.length() - t.length() == 1){
            return removeOrAdd(s,t);
        }
        else if(s.length() - t.length() == -1){
            return removeOrAdd(t,s);
        }
        return false;
    }

    public static boolean sameLength(String first, String second){
        boolean difFound = false;
        for (int i = 0; i < first.length(); i++)
        {
            if(first.charAt(i) != second.charAt(i)){
                if(difFound) return false;
                difFound = true;
            }
        }
        return true;
    }

    public static boolean removeOrAdd(String longer, String shorter){
        int longPtr = 0;
        int shortPtr = 0;
        boolean difFound = false;

        while(shortPtr < shorter.length()){
            if(longer.charAt(longPtr) == shorter.charAt(shortPtr)) {
                shortPtr++;
            }
            else if (difFound){
                return false;
            }
            else{
                difFound = true;
            }
            longPtr++;
        }
        return true;

    }


    /**
     * An algorithm that compares a string with possibly modified other string
     * checking that only one of the operations have been performed on it
     @param s The original ASCII string
     @param t The possibly modified copy of the string
     @return True if one or zero modifications were made, false otherwise
     */
    public static boolean firstSolution(String s, String t){

        if(s.length() == 1 && t.length() == 0 || t.length() == 1 && s.length() == 0) return true;
        if(s.equals(t)) return true;

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
        return false;
    }


    public static void main(String[] args)
    {
        System.out.println(bookStyleSolution("f", ""));
        System.out.println("pale + pasle" + bookStyleSolution("pale", "pasle"));
        System.out.println("pale + bale" + bookStyleSolution("pale", "bale"));
        System.out.println("pale + bake" + bookStyleSolution("pale", "bake"));
    }
}
