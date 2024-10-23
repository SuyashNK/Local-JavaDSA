public class reverseString {
    public static void main(String[] args) {
        String str = "Suyash";
        System.out.println(reverse(str));
    }

    public static String reverse(String str){
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }
}
