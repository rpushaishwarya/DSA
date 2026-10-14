public class array_secondLargenum {
    public static void main(String[] args){
        int[] numbers={23,54,67,-2};
        // Start with the first element as the current maximum.
        Integer largest=null;
        Integer secondLargest=null;
        for (int num :numbers){
            if(largest==null||num>largest){
                secondLargest=largest;
                largest=num;
            }else if(secondLargest==null||num>secondLargest){
                secondLargest=num;
            }
        }
        System.out.println("The second largest value in the array is: " + secondLargest);
    }
    
}
