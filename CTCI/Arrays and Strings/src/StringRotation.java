/*
    Problem:
    Solution:
    Tested:
    Time Complexity:
    Space Complexity:

    Notes:
        +
 */


public class StringRotation {

    public static boolean solution(String s1, String s2){
        if(s1.length() != s2.length()) return false;
        StringBuilder builder = new StringBuilder(s2);
        builder.append(s2);

        for (int i = 0; i < builder.length() - s2.length(); i++) {
            if(builder.subSequence(i, i + s1.length()).toString().equals(s1)) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(solution("hello", "llohe"));
        System.out.println(solution("heloo", "llohe"));
    }
}
