package occuranceChar;

public class Test {
    public static void main(String[] args) {
        String s="textmaster";
        char ch='t';
        char[] array=s.toCharArray();
        int j=0;
        for(int i=0;i<array.length;i++){
            if(ch==array[i]){
                j++;
                array[i]=String.valueOf(j).charAt(0);
            }
        }
        System.out.println(new String(array));

        
    }
    
}
