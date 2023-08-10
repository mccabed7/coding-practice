/*
    Problem: implement an algorithm that compresses Strings like  so: [aabccc] -> [a2bc3]
    Solution: Complete
    Tested: no
    Time Complexity:
    Space Complexity:

    Notes:
        +
 */


public class StringCompression
{

    public static String solution(String s){
        StringBuilder builder = new StringBuilder();
        int prevChar = -1;
        int charCount  = 1;
        for (int i = 0; i < s.length(); i++)
        {
            int sChar = s.charAt(i);
            if(prevChar == sChar) charCount++;

            if((prevChar != sChar || i == s.length() - 1) && prevChar != -1){
                builder.append((char)prevChar);
                if(charCount > 1) builder.append(charCount);

                charCount = 1;
            }
            prevChar = sChar;

        }
        return builder.toString();
    }


    public static void main(String[] args)
    {
        System.out.println(solution("aabccc"));
        System.out.println(solution("Hello World!!!"));
    }
}
