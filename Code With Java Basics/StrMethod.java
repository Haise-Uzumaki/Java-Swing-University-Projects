public class StrMethod {
    public static void main(String[] args) {
        String name = "Haise Uzumaki";

        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf("i");
        int lastIndex = name.lastIndexOf("i");
        //name = name.toUpperCase();
        //name = name.toLowerCase();
        //name = name.trim();
        

        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);
        
    }
}