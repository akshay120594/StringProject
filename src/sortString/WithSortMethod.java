package sortString;

import java.util.Arrays;

public class WithSortMethod {
    public static void main(String[] args) {
        String s="programming";
        char[] ch=s.toCharArray();
        Arrays.sort(ch);
        System.out.println(new String(ch));
    }
    
}
