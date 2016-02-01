package info.dvad.opotest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by loki.od.ua on 29.01.2016.
 */
public class main {
    public String strToCheck = "lorem ipsum dolor sit amet, consectetur adipiscing elit";

    public void main() {
        System.out.println("Checking string: " + strToCheck);
        System.out.println("Result: " + getFirstUChar(strToCheck));
    }

    /*
    * This method checks for first unique character in string given
    * Returns String containing one symbol if character found
    * Returns "empty" if source array is empty
    * Returns "none" if there are no unique characters in string
    */
    public static String getFirstUChar(String str) {
        Map<Character, Integer> locations = new HashMap<Character, Integer>();

        if( str.isEmpty() ) {
            return "empty";
        }

        // Here we fill locations hash with index of first character position or -1 if character appears more than once
        for(int c=0; c<str.length(); c++){
            Character chr = str.charAt(c);
            if( locations.containsKey(chr) ){
                locations.put(chr, -1);
            } else {
                locations.put(chr, c);
            }
        }

        // There's no easy way to select min(value) from HashMap where value>=0, so let's loop that string another time
        for(int c=0; c<str.length(); c++){
            Character chr = str.charAt(c);
            if( locations.get(chr) >= 0 ) {
                return chr.toString();
            }
        }
        return "none";
    }
}
