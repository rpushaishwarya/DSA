public class aray_max {
    public static void main(String[] args){
        int[] maxvalue={23,53,85,90};
        // Start with the first element as the current maximum.
        int max=maxvalue[0];
        // Scan the rest of the array and keep any larger value found.
        for(int i=1;i<maxvalue.length;i++){
            if(maxvalue[i]>max){
                max=maxvalue[i];
            }
        }
        System.out.println("The maximum value in the array is: " + max);
    }

    // Time complexity: O(n), because each array element is checked once.
    // Space complexity: O(1), because only a fixed amount of extra space is used.
    
}
