
public class Linear_Search {
    public static void main(String args[]){
        int [] times= {23,54,64,76};
        int target=64;
        int foundindex=-1;

        for(int i=0;i<times.length;i++){
            if(target==times[i]){
                foundindex=i;
                break;
            }
        }
        System.out.println("target is  "+ foundindex);
    }
    
}