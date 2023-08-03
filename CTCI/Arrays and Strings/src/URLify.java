/*
    Problem: implement an algorithm to replace the spaces in a string with "%20"
    Solution: incomplete
    Tested: yes
    Time Complexity: O(n)
    Space Complexity: O(n + c), where c is the amount of spaces in the string

    Notes:
        + String builder makes strings behave like an arraylist
 */



public class URLify
{


    /**
     * An algorithm that replaces spaces in a string with "%20"
     @param s The ASCII string to have its spaces swapped
     @return A new copy of the String with its spaces swapped
     */
    public static String solution(String s){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) != ' '){
                builder.append(s.charAt(i));
            }
            else
            {
                builder.append("%20");
            }
        }
        return builder.toString();
    }

    public static void main(String[] args)
    {
        System.out.println(solution("Hello World!"));
        System.out.println(solution("     "));
    }
}
