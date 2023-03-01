package occuranceChar;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ReturnNonOccurance {
    public static void main(String[] args) {
        String s="programming";
        System.out.println(solution(s));
        
    }
    public static char solution(String s){
        
        Map<Character,Integer> map=new HashMap<>();
        char[] ch=s.toCharArray();
        for (char c : ch) {
            if(map.containsKey(c))
                map.put(c,map.get(c)+1);
            else
                map.put(c,1);
        }
        Set<Character> keyset=map.keySet();
        for (Character character : keyset) {
            if(map.get(character)==1)
                return character;
        }

        return 'n';
    }
    
}
