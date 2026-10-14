public class array_Counting {
    public static void main(String[] args){
        String [] values={"Pass","Faill","Pass","Faill"};
        int passcount=0;
        int failcount=0;

        for(int i=0;i<values.length;i++){
            if(values[i].equals("Pass")){

                passcount++;
            }else if(values[i].equals("Faill")){
                failcount++;

            }
        }
        System.out.println("Number of students who passed: " + passcount);
        System.out.println("Number of students who failed: " + failcount);
    }
    
}
