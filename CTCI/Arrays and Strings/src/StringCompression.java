/*
    Problem: implement an algorithm that compresses Strings like  so: [aabccc] -> [a2bc3]
    Solution: Complete
    Tested: Yes
    Time Complexity: O(n) where n is the length of the string s
    Space Complexity: O(n) where n is the length of the string s

    Notes:
        +  This one was good practice.  I drew out an algorithm on paper, and implemented in code.
        +  It was also a great exercise in debugging as there was a small logic error at the end
                and I fixed it without using the line-by-line debugger.
 */


public class StringCompression
{

    /**
     * An algorithm that compresses strings like so: [aabccc] -> [a2bc3].
     @param s The string to be compressed.
     @return A compressed version of the string.
     */
    public static String solution(String s){
        StringBuilder builder = new StringBuilder();
        int prevChar = -1;
        int charCount  = 1;
        for (int i = 0; i < s.length(); i++)
        {
            int sChar = s.charAt(i);
            if(prevChar == sChar) charCount++;



            if(prevChar != sChar && i != s.length() - 1){
                builder.append((char)prevChar);
                if(charCount > 1) builder.append(charCount);

                charCount = 1;
            }
            else if(i == s.length() - 1){
                if(prevChar == sChar){
                    builder.append((char)prevChar);
                    if(charCount > 1) builder.append(charCount);
                }
                else{
                    builder.append((char)prevChar);
                    if(charCount > 1) builder.append(charCount);
                    builder.append((char)sChar);
                }

            }


            prevChar = sChar;

        }

        if(builder.length() > 0) builder.deleteCharAt(0);
        return builder.toString();
    }


    public static void main(String[] args)
    {
        System.out.println("aabccc -> " + solution("aabccc"));
        System.out.println("Hello World! -> " + solution("Hello World!"));
        System.out.println("Hello World!!! -> " + solution("Hello World!!!"));
        System.out.println("{empty string} -> " + solution(""));
        System.out.println("aaa -> " + solution("aaa"));
        System.out.println("b -> " + solution("b"));
    }
}
