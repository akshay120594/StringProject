package reverseString;

public class StringBuilderMethod {
    public static void main(String[] args) {
        String a="goal";
        
        System.out.println(solution(a));
        
    }

    public static String solution(String s){
        StringBuilder sb=new StringBuilder(s);
        s=sb.reverse().toString();
        return s;
        
    }
    
}
