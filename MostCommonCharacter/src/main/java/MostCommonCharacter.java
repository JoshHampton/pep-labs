import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
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
        HashMap<Integer, Character> highest = new HashMap<>();
        highest.put(0, str.charAt(0));
        
        int highVal = 1;        //used to keep track of highest val, so we don't need to keep adding to 'highest' hashmap

        for (int i = 0; i < str.length(); i++){
            //If the character is already in the map, incriment its value.
            if (hashmap.containsKey(str.charAt(i))){        
                hashmap.put(str.charAt(i) , hashmap.get(str.charAt(i))+1);
                //If this key is now the most common, place it in highest
                if(hashmap.get(str.charAt(i)) > highVal){
                    highVal++;
                    highest.put(0, str.charAt(i));
                }
            }
            //If the character isn't aready in the map, add it.
            else{
                hashmap.put(str.charAt(i), 1);
            }
        }
        return highest.get(0);
    }
}
