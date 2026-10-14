public class Array_reverse{
    public static void main(String[] args){
        int revvalues [] = {23,98,34,42};

        int left= 0;
        int right=revvalues.length-1;

        while(left < right){
             int temp= revvalues[left];
             revvalues[left]=revvalues[right];
             revvalues[right] = temp;

             left++;
             right--;


        }
        for(int num :revvalues){
            System.out.println(num +"");
        }
 
    }
}