package splitReverse;

public class Test {
    public static void main(String[] args) {
        String s= "welcome to mumbai";
        System.out.println(solution(s));
        
    }
    public static String solution(String s){
        String[] a=s.split(" ");
        String reverse="";
        for (String b : a) {
            StringBuilder sb=new StringBuilder(b);
            reverse=reverse+" "+sb.reverse().toString(); 
        }
        return reverse;
    }
    
}
