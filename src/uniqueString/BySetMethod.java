package uniqueString;

import java.util.LinkedHashSet;
import java.util.Set;

public class BySetMethod {
    public static void main(String[] args) {
        String s="programming";
       Set<Character> charset=new LinkedHashSet<>();
       for(int i=0;i<s.length();i++){
        charset.add(s.charAt(i));
       }
       for (Character character : charset) {
        System.out.print(character);
       }
    }
    
}
