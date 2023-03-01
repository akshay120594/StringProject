package reverseString;

public class CharArrayMethod {
    public static void main(String[] args) {
        String s="hello";
        solution(s);
        
    }
     public static void solution(String s){
        char[] a=s.toCharArray();
        for(int i=a.length-1;i>=0;i--){
           System.out.print(a[i]);
        }
     }
    
}
