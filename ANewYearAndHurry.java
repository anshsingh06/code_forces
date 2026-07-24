import java.util.*;
public class ANewYearAndHurry{
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int totalTime = 240 -k;
        int count =0;
        int timeTaken=0;
        for(int i=0;i<n;i++){
             timeTaken += 5*(i+1);
         if(timeTaken<= totalTime){
          
           count++;
         } 
         else{
            break;
         }
        }
        System.out.println(count);
    }
}