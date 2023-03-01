package removeSpecialCharacter;

public class Test {
    public static void main(String[] args) {
        String str="#j$%al*vastar";
        System.out.println(solution(str));
        
    }
    public static String solution(String s){
       return s.replaceAll("[^a-zA-Z0-9]","");
        
    }
    
}



