import java.util.HashMap;
import java.util.Map.Entry;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        HashMap<Character, Integer> hashmap = new HashMap<>();
        HashMap<Character, Integer> highest = new HashMap<>();
        highest.put(str.charAt(0), 1);

        for (int i = 0; i < str.length(); i++){
            if (hashmap.containsKey(str.charAt(i))){
                hashmap.put(str.charAt(i) , hashmap.get(str.charAt(i))+1);
                if(hashmap.get(str.charAt(i)) > highest){
                    highest++;
                }
            }
            else{
                hashmap.put(str.charAt(i), 1);
            }
        }
        return highest.get;
    }
}
