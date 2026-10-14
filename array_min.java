public class array_min {
    public static void main(String[] args){
        int [] minvalue ={-2,-5,0,3,7};
        // Start with the first element as the current minimum.
        int min=minvalue[0];
        // Scan the rest of the array and keep any smaller value found.
        for(int i=1;i<minvalue.length;i++){
            if(minvalue[i]<min){
                min=minvalue[i];
            }

        }
        System.out.println("The minimum value in the array is: " + min);
    }
    
}

// -5     -2      0      3            7
//---|------|------|------|------------|--->
//(Leftmost = Smallest)           (Rightmost = Largest)
