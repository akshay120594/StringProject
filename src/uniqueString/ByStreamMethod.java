package uniqueString;

public class ByStreamMethod {
    public static void main(String[] args) {
        String s="programming";
        StringBuilder sb=new StringBuilder();
        s.chars().distinct().forEach(c->sb.append((char)c));
        System.out.println(sb.toString());
    }
    
}
