import java.lang.reflect.Array;
import java.util.Arrays;

public class Isogram {
    /**
     * An Isogram is a word where no letters are repeated. You may assume that there will only be lowercase
     * letters in the String.
     *
     * For instance, "cat", "isogram", "uncopyrightable" are isograms. "egg", "java", "programming" are not.
     * You could use a Set of characters or a Map of characters to int or boolean to solve this problem.
     * You could even solve it with an array of 26 booleans, and convert characters to an index of that array.
     * It's also possible to solve this with nested for loops.... but it's not as easy or efficient.
     *
     * @param str a String.
     * @return true if str is an isogram, false otherwise.
     */
    public boolean isIsogram(String str){
       String str2=str;
       int count= 0;
        for(int i=0; i<str.length();i++){
            char m=str.charAt(i);
            count= 0;
            for(int s=1; s<str2.length();s++){
             
             System.out.println(str2);
             if(str2.charAt(s)==m) {
                
               count++;
               if(count==2){
                
                return false;
               }
             }
            

            }

        }
        return true;
    }
}

