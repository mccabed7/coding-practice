package solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
    Problem: Group an array of strings into Lists of Anagrams
    Solution: complete
    Tested: yes
    Time Complexity: O(n*m), n is the amount of strings, and m is the length of the longest string
    Space Complexity: O(n), n is the amount of strings

    Notes:
        + Hashing arrays doesn't work, but you can hash something that represents the array
        + In this case Arrays.toString(int-array) is what is hashed
        + In other cases, an object could be hashed using its 'toString()' method
        + In Java, to initialise a List you do ...
        + ... List<String> list = new ArrayList<String>();
        + In this case, stringMap.values() is being implicitly cast to a List
        + This is because the function returns a Collection, the super-class of List.
 */

class $4GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> stringMap = new HashMap<String, ArrayList<String>>();

        for(int i = 0; i < strs.length; i++){
            Integer[] array = getArray(strs[i]);
            String arrayString = Arrays.toString(array);

            if(stringMap.containsKey(arrayString)){
                stringMap.get(arrayString).add(strs[i]);
            }
            else{
                stringMap.put(arrayString, new ArrayList<String>());
                stringMap.get(arrayString).add(strs[i]);
            }
        }

        List<List<String>> result = new ArrayList<List<String>>(stringMap.values());

        return result;
    }


    public Integer[] getArray(String s){
        Integer[] array = new Integer[26];
        Arrays.fill(array, 0);

        for(int i = 0; i < s.length(); i++){
            array[s.charAt(i)-97] += 1;
        }

        return array;
    }
}