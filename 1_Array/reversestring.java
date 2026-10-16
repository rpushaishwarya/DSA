public class reversestring {

    public static void main (String args[]){
        String Word="Thailand";
        String reverse ="";

        for(int i=Word.length()-1;i>=0;i--){
            reverse = reverse + Word.charAt(i);

        }

        System.out.println("The Reversed Word "+ reverse);
    
    }
    
}
