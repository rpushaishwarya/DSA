public class CountTheChar {
    public static void main(String[] args) {
        String str = "dollar";
        char target = 'l';
        int count = 0;
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
            }
        }
        
        System.out.println("The count is " + count);
    }
}  