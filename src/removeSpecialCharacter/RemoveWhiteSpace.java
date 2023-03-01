package removeSpecialCharacter;

public class RemoveWhiteSpace {
    public static void main(String[] args) {
        String str=" d h gt ad jh a ";
        String plain=str.replaceAll("\\s","");
        System.out.println(plain);
    }
    
}
