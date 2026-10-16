public class palindrom {
    public static void main(String [] args){
        String palindromword= "level";

        int left=0;
        int right=palindromword.length()-1;
        boolean ispalinflag=true;

        while (left<right){
            if(palindromword.charAt(left)!=palindromword.charAt(right)){
                ispalinflag=false;
                break;

            }
            left++;
            right--;
        }
     System.out.println(ispalinflag);
    }
    
}
