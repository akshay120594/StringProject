package sortString;

public class withoutSort {
    public static void main(String[] args) {
        String s="goldi";
        solution(s);

    }

    public static void solution(String s){
        char[] ch=s.toCharArray();
        char temp;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(ch[i]>ch[j]){
                    temp=ch[i];
                    ch[i]=ch[j];
                    ch[j]=temp;

                }
                    
            }
        }
        System.out.println(new String(ch));
    }
    
}
