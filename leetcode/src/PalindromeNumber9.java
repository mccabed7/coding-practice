public class PalindromeNumber9
{
    public static boolean isPalindrome(int x){
        if((x / 10) == 0) return true;
        if(x < 0) return false;
        int length = (int) (Math.log10(x) + 1);
        int xInTens = (int)Math.pow(10, length - 1);

        while(x / 10 != 0){
            int left = x % 10;
            int right = x / xInTens;
            if(left != right) return false;
            x = x - (xInTens * left);
            x = x / 10; //remove right
            xInTens = xInTens / 100;
        }
        return true;
    }


    public static void main(String[] args)
    {
        isPalindrome(121);
    }
}
