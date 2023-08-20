/*
    Problem:
    Source: Practice interview question
    Solution:
    Tested:
    Time Complexity:
    Space Complexity:

    Explanation of implementation:

    Notes:
        +

 */

import java.util.List;


public class MinimumWildcard
{

    public static int solution(List<String> patterns){
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < patterns.get(0).length(); i++)
        {
            char firstChar = patterns.get(0).charAt(i);
            boolean validChar = true;
            for (int j = 0; j < patterns.size(); j++)
            {
                if(patterns.get(j).charAt(i) != firstChar && patterns.get(j).charAt(i) != '?') validChar = false;
            }
            if(validChar){
                builder.append(firstChar);
            }
            else{
                builder.append('?');
            }
        }

        String wildCard = builder.toString();
        int count = 0;
        for (int i = 0; i < wildCard.length(); i++)
        {
            if(wildCard.charAt(i) =='?') count++;
        }

        return count;
    }
}
